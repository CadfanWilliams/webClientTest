package org.example.webclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientTestApplication.class, args);
        getApi();
    }

    public static void getApi(){
        WebClient client = WebClient.builder().baseUrl("http://example.com").build();
        System.out.println(client.get().retrieve().bodyToMono(String.class).block());
    }
}
