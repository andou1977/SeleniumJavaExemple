pipeline {
    agent any

    tools {
        maven 'Maven 3'      // Jenkins tool name
        jdk   'Java'         // Jenkins tool name
    }

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Generate Allure Report') {
            steps {
                bat 'mvn allure:report'
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/site/allure-maven-plugin/**', fingerprint: true
                }
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully'
        }
        failure {
            echo 'Build failed — check logs and reports'
        }
    }
}