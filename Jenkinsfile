pipeline {
    agent any

    stages {

        stage('GIT') {
            steps {
                git branch: 'main',

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
                   sh 'mvn -B org.sonarsource.scanner.maven:sonar-maven-plugin:5.4.0.6356:sonar'
                }
            }
        }
    }
}
