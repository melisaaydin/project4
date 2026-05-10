pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "melay/project4"
        DOCKER_TAG   = "latest"
    }

    triggers {
        githubPush()
    }

    stages {

        stage('Stage 1: Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/melisaaydin/project4.git'
            }
        }

        stage('Stage 2: Build JAR') {
            steps {
                bat 'gradlew.bat bootJar'
            }
        }

        stage('Stage 3: Build Docker Image') {
            steps {
                bat "docker build -t %DOCKER_IMAGE%:%DOCKER_TAG% ."
            }
        }

        stage('Stage 4: DockerHub Login') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-credentials',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                }
            }
        }

        stage('Stage 5: Push Image') {
            steps {
                bat "docker push %DOCKER_IMAGE%:%DOCKER_TAG%"
            }
        }

        stage('Stage 6: Deploy to K8s') {
            steps {
                bat "kubectl apply -f deployment.yaml"
                bat "kubectl apply -f service.yaml"
            }
        }
    }

    post {
        success { echo 'Pipeline BASARILI!' }
        failure { echo 'Pipeline BASARISIZ!' }
    }
}