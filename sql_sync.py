import argparse

import pyodbc
from github import Github

def get_args():
    parser = argparse.ArgumentParser()
    parser.add_argument('-t',
                        '--token',
                        required=True)
    args = parser.parse_args()
    return args

if __name__ == '__main__':
    arguments = get_args()
    g = Github(arguments.token)
    repo = g.get_repo(full_name_or_id='LorinczAlexandra12/devops-hw')
    views = repo.get_views_traffic(per="day")

    conn = pyodbc.connect('Driver={SQL Server};'
                          'Server=DESKTOP-8G83ASS;'
                          'Database=DevOps;'
                          'Trusted_Connection=yes;')

    cursor = conn.cursor()
    #[UniquesNum],[TimeStamp],[Count]
    for v in views['views']:
        sql = "insert into GithubData(UniquesNum, TimeStamp, Count) values (?,?,?)"
        cursor.execute(sql, (v.uniques,v.timestamp,v.count))
        conn.commit()



