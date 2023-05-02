pipeline {
    agent any

    stages {
        stage('Clone Application Code') {
            steps {
                
               git'https://github.com/yshu1509/Development-Team-Repo.git'
            }
        }
        stage('Build') {
            steps {
                sh'mvn clean -f pom.xml'
            }
        }
         stage('Build') {
            steps {
                sh'mvn package -f pom.xml'
            }
        }
        }
    }
}




