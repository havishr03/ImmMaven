pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning Repository'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Run') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.ImmutableDemo"'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment Successful'
            }
        }
    }
}
