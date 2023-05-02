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
                sh'mvn package -f pom.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Application Code'
            }
        }
    }
}




