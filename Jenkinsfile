pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
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

    post {

        success {

            mail to: 'lathacm90@gmail.com',
            subject: 'Jenkins Build SUCCESS',
            body: 'Employee Management project build completed successfully.'

        }

        failure {

            mail to: 'lathacm90@gmail.com',
            subject: 'Jenkins Build FAILED',
            body: 'Employee Management project build failed. Check Jenkins console output.'

        }

    }

}
