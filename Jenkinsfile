pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                mvn clean package
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                mvn test
            }
        }
        stage('Extra') {
            steps {
                echo 'Saving Jar....'
            }
        }
    }
}