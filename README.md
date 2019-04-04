# Snacks service

Microservice for snacks, used during the jx-workshop.

## Running the application

The application can be run in various contexts

### 1. On local host (gradle.build)

- Windows host
	```bash
	gradlew.bat bootRun
	```
- Linux / OSX host
	```bash
	./gradlew bootRun
	```

### 2. In local docker container

1. Assemble project
	- Windows host
	  ```bash
	  gradlew.bat assemble
	  ```
	- Linux / OSX Host
   	  ```bash
 	  ./gradlew assemble
	  ```

1. Build docker image
	```bash
	docker build . -t local/snacks:latest
	```
	> tag: 'latest' is expected in the docker-compose file used to deploy the stack.
	> 
	> If preferred a different tag can be used, the docker-compose file needs to updated with this custom tag.

1. Deploy docker stack
	```bash
	docker stack deploy -c ~/jx-workshop/Development/docker/snack-service-stack.yaml snacks-dev
	```
	> On windows host '~' only works in Powershell or git bash
	>
	> Running command in command prompt '~' must be changed to {path to user home}

### 3. As local kubernetes deployment

TODO

### 4. As local kubernetes helm chart

TODO