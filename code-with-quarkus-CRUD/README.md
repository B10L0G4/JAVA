# code-with-quarkus-CRUD

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.


## Adding a dependency

To add a dependency to your project, you can use the `add-extension` goal, for example:
```shell script
./mvnw quarkus:add-extension -Dextensions="extension name"
```
`list of extensions`: https://quarkus.io/guides/all-extensions or
```shell script
./mvnw quarkus:list-extensions
```

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-CRUD-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- REST resources for Hibernate ORM with Panache ([guide](https://quarkus.io/guides/rest-data-panache)): Generate Jakarta REST resources for your Hibernate Panache entities and repositories
- SmallRye OpenAPI ([guide](https://quarkus.io/guides/openapi-swaggerui)): Document your REST APIs with OpenAPI - comes with Swagger UI
- JDBC Driver - MySQL ([guide](https://quarkus.io/guides/datasource)): Connect to the MySQL database via JDBC

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

### Conteiner Image - Docker

Build a container image and run it directly in Docker

```shell script
docker run --network host -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test -d --rm mysql:8.0.19
```

```shell script
docker run [OPTIONS] IMAGE[:TAG|@DIGEST] [COMMAND] [ARG...]
```

- `docker run` - to run the container
- `--network host` - to run the container in the same network as the host
- `-e MYSQL_ROOT_PASSWORD=root` - to set the root password
- `-e MYSQL_DATABASE=test` - to create a database
- `-d` - to run the container in the background
- `--rm` - to remove the container when it stops
- `mysql:8.0.19` - the image to use
