pipeline {
    agent any
    stages {
        stage('Sample Stage') {
            steps {
                echo 'This is a sample pipeline script'
            }
        }
    }
}
