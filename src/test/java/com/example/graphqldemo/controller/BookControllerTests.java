package com.example.graphqldemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureGraphQlTester
public class BookControllerTests {

    @Autowired
    GraphQlTester graphQlTester;

    @Test
    void shouldGetFirstBook() {
        this.graphQlTester
				.documentName("bookDetails")
				.variable("id", 1)
                .execute()
                .path("bookById")
                .matchesJson("""
                	{
				      "id": "1",
				      "title": "The Hobbit",
				      "pageCount": 304,
				      "author": {
				        "id": "1",
				        "name": "J.R.R. Tolkien"
				      }
				    }
                """);
    }
}
