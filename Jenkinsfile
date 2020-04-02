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
        sh './mvnw deploy'
      }
    }

  }

	post {
        success {
        mail to: 'moataz_fawzy@live.com',
             subject: "The Pipeline Built Successfully: ${currentBuild.fullDisplayName}",
             body: "BUILD, TEST, PACKAGE, DEPLOY ran sucessfully. Visit ${env.BUILD_URL} for more info."
		}
	}
}
