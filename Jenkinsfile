pipeline {
    agent any

    stages {

        stage('GIT') {
            steps {
                git branch: 'main',
                    credentialsId: 'devopsgit',
                    url: 'https://github.com/azza774/tp_foyer'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn -B sonar:sonar'
                }
            }
        }
    }
}
