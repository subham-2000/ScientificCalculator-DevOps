pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'scientific-calculator'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/subham-2000/ScientificCalculator-DevOps.git'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push Docker Image') {
             steps {
                script{
                    docker.withRegistry('', 'docker-hub-credentials') {
                    sh 'docker tag calculator subham20000/scientific-calculator:latest'
                    sh 'docker push subham20000/calculator'
                    }
                 }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory.ini ansible-playbook.yml'
            }
        }
    }
}
