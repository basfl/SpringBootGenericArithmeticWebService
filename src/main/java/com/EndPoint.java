package com;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gen.GetAddRequest;
import com.gen.GetAddResponse;
@Endpoint
public class EndPoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAddRequest")
	@ResponsePayload
	public GetAddResponse getAdd(@RequestPayload GetAddRequest request) {
		System.out.println("*******************************************");
		GetAddResponse response = new GetAddResponse();
		String test = request.getBase() + request.getNumber1() + request.getNumber2();
		response.setResult(test);
		System.out.println("response "+response.getResult());
		return response;
	}
}
