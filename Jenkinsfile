pipeline {
	tools {
		maven 'maven3'
	} 
    agent any 
    stages {
        stage('Compile Stage') { 
            steps {
                	sh 'mvn clean compile'
		    	echo 'Hello, Maven'
            }
        }
        stage('Testing Stage') { 
            steps {
                	sh 'mvn test'
            }
        }
        //stage('Deployment Stage') { 
          //  steps {
            //    	sh 'mvn deploy'
            //}
        //}
    }
}
