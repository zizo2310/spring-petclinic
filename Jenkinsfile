pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './mvnw compile'
      }
    }

    stage('test') {
      steps {
        sh './mvnw test'
      }
    }

    stage('package') {
      steps {
        sh './mvnw package'
      }
    }

    stage('deploy') {
      when {
        branch 'master'
      }
      steps {
        sh 'mvn clean install:install'
      }
    }

  }
 post {
    success {
      slackSend (color: '#00FF00', message: "Job success! '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
    }
    failure {
      slackSend (color: '#FF0000', message: "Job failed! '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
    }
  }
}
