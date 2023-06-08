# Spring Boot GraphQL Demo Application

This is a Spring Boot application that uses GraphQL, JPA and H2 Database.

## Overview

This application is a simple starter project which demonstrates the use of Spring Boot with GraphQL and JPA for building a robust API service. It uses an H2 database to persist data. The application also includes a simple example of how to define GraphQL schema and mutations.

## Technology Stack

- Spring Boot 3
- GraphQL
- Spring Data JPA
- H2 Database
- Maven

## Prerequisites

- JDK 17 or later
- Maven 3.2+

## Getting Started

### Clone the repository

```bash
https://github.com/leonardohenrique/spring-boot-graphql-demo.git
cd spring-boot-graphql-demo
```

### Build the application

Use the below command to build the application:

```bash
mvn clean install
```

### Run the application

After successfully building the application, to start the application, use the below command:

```bash
mvn spring-boot:run
```

The server will start on the default port 8080.

### Accessing H2 Database
You can access the H2 database console at the following URL when your application is running:

```http
http://localhost:8080/h2-console
```

Make sure the JDBC URL is set to jdbc:h2:mem:testdb

## GraphiQL Playground

You can access the GraphiQL playground console at the following URL when your application is running:

```http
http://localhost:8080/graphiql
```

Here you can make your queries and mutations.

### Example Query

```graphql
query {
  bookById(id: 1) {
    id
    title
    pageCount
    author {
      id
      name
    }
    genres {
      id
      name
    }
  }
}
```

### Example Mutation

```graphql
mutation {
  createBook(input: {
    title:"The Silmarillion",
    authorId:1,
    genreIds: [1, 2]
  }) {
    id
    title
    author {
      name
    }
    genres {
      name
    }
  }
}
```