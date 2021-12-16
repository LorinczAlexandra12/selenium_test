pipeline{
  
  agent any
  
  tools {
        maven 'mymaven'
        jdk 'JAVA_HOME'
    }
  
  stages{
    
  
    stage("Init and check out repository"){
      steps{
        echo 'Initializing and checking out repository...'
      }
    }
    stage("Build project"){
      steps{
        echo 'Building the project...'
      }
    }
    stage("Run tests"){
      steps{
        sh 'mvn clean install'
      }
    }
    stage("Clean out workspace"){
      steps{
       echo 'Cleaning out the workspace...'
      }
    }
  }  
}
