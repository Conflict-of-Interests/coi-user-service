package com.revature.coi.revanauts;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.with;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.coi.revanauts.models.User;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserTest {
	
	@LocalServerPort
	private int port;
	
	@Before
	public void setUp() throws Exception {
	    RestAssured.port = port;
	}
	
	@Test
	public void getAllUsersIfNoExceptionsTest() {
		get("/users").then().assertThat().statusCode(200);
	}
	
	@Test
	public void registerUserTest() {
		with().body(new User(0, "Petronilo", "Alagna", "peter.alagna@revature.com", "BATCH-ID-000028"))
		.when()
		.contentType(ContentType.JSON)
		.request("POST","/users")
		.then()
		.statusCode(200);	
	}
	
	@Test
	public void updateUserTest() {
		with().body(new User(7, "Pitro", "Alagna", "peter.alagna@revature.com", "BATCH-ID-000028"))
		.when()
		.contentType(ContentType.JSON)
		.request("PUT","/users")
		.then()
		.statusCode(200);	
	}
	
	@Test
	public void updateUserWithBadIdTest() {
		with().body(new User(0, "Pitro", "Alagna", "peter.alagna@revature.com", "BATCH-ID-000028"))
		.when()
		.contentType(ContentType.JSON)
		.request("PUT","/users")
		.then()
		.statusCode(400);
	}
	
	@Test
	public void getAllUsersIfNotEmptyTest() {
		get("/users").then().assertThat().statusCode(200);
	}
}
