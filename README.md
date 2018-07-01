# PostgresqlWithDocker
*Small project (CRUD samples) - with Spring Boot + JOOQ*

## Getting started

It is necessary to have docker installed on your OS.

### Instructions

This project has a connection with **Postgres** in a **Docker** image.
After cloning it, go to folder *..src/main/resources/docker/postgres* and run the following command to initialize the database:
* *docker-compose up*

To access the database, run the following command in another terminal window:

* *docker exec -it ordernow_mysql bash*


//TODO: add JOOQ in pom.xml and configure this persistence framework
