pipeline {
    agent any
                 stages {
                         stage('Build') {
                                          steps { sh './mvnw package'  }
                                        }
           
            
                     stage ('Test') {
                                         steps { sh 'mvn test' }
                                     }
            
                     stage ('Package') {
                                         steps { sh 'mvn package' }
                                        }
            
                    stage ('Deploy') {
                                          when { branch 'master' }
                                           steps { sh './mvn deploy' }  
                                      }
                        }
}
