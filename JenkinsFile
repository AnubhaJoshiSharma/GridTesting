pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven 'MAVEN_HOME'
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git 'git@github.com:AnubhaJoshiSharma/GridTesting.git'
            }
        }
        
          stage('exeCute') {
            steps {
             build job: 'GridTestingMavenProject', parameters: [string(name: 'runnerFile', value: 'testng.xml')] 
            }
        }

        }
}
