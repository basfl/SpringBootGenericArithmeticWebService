package com;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gen.GetAddRequest;
import com.gen.GetAddResponse;
import com.gen.GetDivRequest;
import com.gen.GetDivResponse;
import com.gen.GetMulRequest;
import com.gen.GetMulResponse;
import com.gen.GetSubRequest;
import com.gen.GetSubResponse;
import com.generic.arithmetic.Arithmetic;

@Endpoint
public class EndPoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	Arithmetic arithmetic;

	@SuppressWarnings("static-access")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAddRequest")
	@ResponsePayload
	public GetAddResponse getAdd(@RequestPayload GetAddRequest request) {
		System.out.println("*******************************************");
		GetAddResponse response = new GetAddResponse();
		String test = arithmetic.add(Integer.parseInt(request.getBase().trim().intern()), request.getNumber1(),
				request.getNumber2());
		response.setResult(test);
		return response;
	}
	@SuppressWarnings("static-access")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSubRequest")
	@ResponsePayload
	public GetSubResponse getSub(@RequestPayload GetSubRequest request) {
		System.out.println("*******************************************");
		GetSubResponse response = new GetSubResponse();
		String test = arithmetic.subtract(Integer.parseInt(request.getBase().trim().intern()), request.getNumber1(),
				request.getNumber2());
		response.setResult(test);
		return response;
	}
	@SuppressWarnings("static-access")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMulRequest")
	@ResponsePayload
	public GetMulResponse getMul(@RequestPayload GetMulRequest request) {
		System.out.println("*******************************************");
		GetMulResponse response = new GetMulResponse();
		String test = arithmetic.multiply(Integer.parseInt(request.getBase().trim().intern()), request.getNumber1(),
				request.getNumber2());
		response.setResult(test);
		return response;
	}
	@SuppressWarnings("static-access")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDivRequest")
	@ResponsePayload
	public GetDivResponse getDiv(@RequestPayload GetDivRequest request) {
		System.out.println("*******************************************");
		GetDivResponse response = new GetDivResponse();
		String test = arithmetic.divide(Integer.parseInt(request.getBase().trim().intern()), request.getNumber1(),
				request.getNumber2());
		response.setResult(test);
		return response;
	}
}
