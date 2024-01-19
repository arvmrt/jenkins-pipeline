pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh 'java -version'
            }
        }
    
        stage('test') {
            steps {
                sh 'java -version'
            }
        }

        stage('deploy') {
            steps {
                sh 'java -version'
            }
        }

    }
}
