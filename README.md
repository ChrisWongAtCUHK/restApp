# [RestApp](https://medium.com/@urbanswati/deploying-spring-boot-restapi-using-docker-maven-heroku-and-accessing-it-using-your-custom-aa04798c0112)

This is just a template repo for Dockerizing a Maven Springboot Application.

Mouthful neh? Okay.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software

Need to know Java SE and what a Maven project is and some Springboot

- [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Docker](https://www.docker.com/get-docker)


### Running project with Docker

Ok so you have loaded the application on the IDE, Great Job!

Now all you need to do is build the project jar file
by using the mvnw command
```
./mvnw package
```
After successful build (Phew ey...), You will find the jar file in the `target` directory.

Now time to Docker this stuff. #HappyDance

We need to build the image by executing:
```
docker build -t springbootapp .
```
The `-t <name>` just gives our image a name, relax

After Docker has build successfully, now we need to run the docker image
when doing so it creates a container (meaning its running... gees I suck at explaining but I am trying ey)

So we run the docker image by executing:
```
docker run -t springbootapp
```
The application will start now you test in your browser by going to `localhost:8080`

Whorray you have a spring boot application running with Docker!

## Built With

* [Jet Brains IntelliJ](https://www.jetbrains.com/idea/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Docker](https://www.docker.com/get-docker)
* [Spring Boot](https://spring.io/guides/gs/spring-boot/)
## Contributing

Just fork, clone, crunch the code, commit, push and pull request :P 

## Authors

* **William Maphanga** - *Initial work* - [UrbanSwati](https://github.com/UrbanSwati)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* My Mom and Dad
* Spring.io
* Java
* Maven
* Docker
* and others

# [Spring Boot + Spring data JPA + PostgreSQL](https://mkyong.com/spring-boot/spring-boot-spring-data-jpa-postgresql/)