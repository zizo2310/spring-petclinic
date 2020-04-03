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
         
  stage('slack') {
                         slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#jinkinsnotefication', 
                           color: 'good', message: 'build success', tokenCredentialId: 'slack demo', username: 'app.slack'
                          }
 
}
