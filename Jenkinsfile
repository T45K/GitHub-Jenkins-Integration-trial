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
        jacoco execPattern: 'target/jacoco', classPattern: 'target/classes', sourcePattern: 'src/main/java', exclusivePattern: 'src/test*'
    }
}
