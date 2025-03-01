pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'subham20000/scientific-calculator'
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
                sh 'docker login -u subham20000'
                sh 'docker push $DOCKER_IMAGE'
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory.ini ansible-playbook.yml'
            }
        }
    }
}
