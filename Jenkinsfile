pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Build') {

            steps {

                sh 'mvn clean compile'

            }

        }

        stage('Test') {

            steps {

                sh 'mvn test'

            }

        }

        stage('Package') {

            steps {

                sh 'mvn package'

            }

        }

        stage('Docker Build') {

            steps {

                sh 'docker build -t employee-management .'

            }

        }

        stage('Docker Run') {

            steps {

                sh 'docker rm -f employee-container || true'
                sh 'docker run -d --name employee-container employee-management'

            }

        }

    }

}
