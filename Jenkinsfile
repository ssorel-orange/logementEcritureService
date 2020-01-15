pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps{
                build job: 'LogementService_build'
            }
        }
        stage('Package Application'){
           steps {
                step ([$class: 'CopyArtifact', projectName: 'LogementService_build', filter: 'target/Logement_Lecture*.jar']);
                sh "pwd"
                sh "ls -a"
                sh "docker build ./ -t logement_service:${env.BUILD_ID}"
            }
            
        }
        stage('Launch Application'){
           steps {
                sh "pwd"
                sh "ls -a"
                sh "docker run -d -p 9092:9091 --name logement_lecture_service_${env.BUILD_ID} logement_service:${env.BUILD_ID}"
            }
            
        }
    }
}

