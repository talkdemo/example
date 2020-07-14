pipeline { 
    agent any  
    stages { 
        stage ('Echo') { 
            steps { 
               echo 'This is a example pipeline step.' 
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}