## Jenkins Docker Container
* docker ps -a
* docker pull jenkins/jenkins:lts
* docker run -p 8080:8080 --name jenkins jenkins/jenkins:lts
* docker exec -u 0 -it jenkins /bin/bash
* apt-get update && apt-get install maven

## Jenkins Plugins
* Pipeline
* Pipeline: Stage View
* GitHub
