package com.swing.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Restcall {
     
	public String post(String input)
	{
		HttpResponse response=null;
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
			        .uri(URI.create("http://localhost:8080/vaild"))
			        .POST(HttpRequest.BodyPublishers.ofString(input))
			        .header("Accept", "application/json")
			        .build();
			response = client.send(request, HttpResponse.BodyHandlers.ofString());

			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return response.body().toString();
	}


}
