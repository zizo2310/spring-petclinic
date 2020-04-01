pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw package' 
            }
        }
    }
    post {
    	failure {
        	sh "git bisect start ${f14d178657eb670e48ba547d6eddfa6e76b53b22} ${ac3e64208e3bcf85eaeff2f870083212f526676f}"
			sh "git bisect run mvn clean test"
			sh "git bisect reset"
    	}
   }
}
