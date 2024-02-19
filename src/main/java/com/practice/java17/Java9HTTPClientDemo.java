package com.practice.java17;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java9HTTPClientDemo {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.google.copm")).GET().build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
	}
}
