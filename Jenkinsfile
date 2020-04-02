pipeline {
  agent any
  stages {
            stage('build') {
                            steps { sh './mvnw compile'}
                            }

           stage('test') {
                             steps {sh './mvnw test'}
                          }

          stage('package') {
                             steps { sh './mvnw package' }
                            }

          stage('deploy') {
                           when { branch 'master'}
                          steps { sh './mvnw deploy' }
                           }

         }
 post {
        success {
                  emailext(attachLog: false,
                             body: 'pipeline success', 
                              subject: 'Q1 pipeline ', 
                               to: 'moataz_fawzy@live.com')
                  }
        failure {
            emailext(attachLog: true,
                        body: 'pipeline failed', 
                        subject: 'Q1 pipeline ', 
                        to: 'moataz_fawzy@live.com')
                 }
        }
}
