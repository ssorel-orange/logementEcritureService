pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps{
                build job: 'LogementEcritureService_build'
            }
        }
        stage('Package Application'){
           steps {
                step ([$class: 'CopyArtifact', projectName: 'LogementService_build', filter: 'target/logement_ecriture*.jar']);
                sh "pwd"
                sh "ls -a"
                sh "docker build ./ -t logement_ecriture:${env.BUILD_ID}"
            }
            
        }
        stage('Launch Application'){
           steps {
                sh "pwd"
                sh "ls -a"
                sh "docker run -d -p 9093:9091 --name logement_ecriture_service_${env.BUILD_ID} logement_ecriture_service:${env.BUILD_ID}"
            }
            
        }
    }
}

