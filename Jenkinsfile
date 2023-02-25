pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh './mvnw clean test'
            }
        }
    }

    post {
        success {
            jacoco execPattern: 'target/jacoco', classPattern: 'target/classes', sourcePattern: 'src/main/java', exclusionPattern: 'src/test*'
        }
    }
}
