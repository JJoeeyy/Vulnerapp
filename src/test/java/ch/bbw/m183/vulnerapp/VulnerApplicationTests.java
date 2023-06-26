package ch.bbw.m183.vulnerapp;

import ch.bbw.m183.vulnerapp.datamodel.BlogEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.Base64;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VulnerApplicationTests {

	@Autowired
	WebTestClient webTestClient;

	@Test
	void blogsArePublic(){
		webTestClient.get().uri("/api/blog")
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	void needsAuthorization(){
		webTestClient.get().uri("/api/")
				.exchange()
				.expectStatus().isUnauthorized();
	}

	@Test
	void postBlogForbidden(){
		BlogEntity blog = new BlogEntity().setTitle("Test").setBody("Hello");

		webTestClient.post().uri("/api/blog")
				.bodyValue(blog)
				.exchange()
				.expectStatus().isForbidden();
	}

	@Test
	void loginOk(){
		String username = "fuu";
		String password = "bar";

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));

		webTestClient.get().uri("/api/user/whoami")
				.headers(httpHeaders -> httpHeaders.addAll(headers))
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	void loginNotOk(){
		String username = "fuu";
		String password = "falsePassword";

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));

		webTestClient.get().uri("/api/user/whoami")
				.headers(httpHeaders -> httpHeaders.addAll(headers))
				.exchange()
				.expectStatus().isUnauthorized();
	}
}
