pipeline{
  
  agent any
  
  tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk9' 
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
