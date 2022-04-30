package com.m2i.itinera.rest;

import java.util.HashMap;
import java.util.Map;

public class RestResponse {
	private static String SUCCESS_MESSAGE;
	private static String ERROR_MESSAGE;
	//HashMap is an object which includes a key for every values
	//It is really close to JSON format, so it is easy to create the response from it
	private static Map<String, Object> retour;
	
	static {
		SUCCESS_MESSAGE = "success";
		ERROR_MESSAGE = "error";
		retour = new HashMap<String, Object>();
	}

	//The http response this api will send in case of success
	public static Map<String, Object> returnSuccess(Object obj){
		retour.clear();
		retour.put("message", SUCCESS_MESSAGE);
		retour.put("response", obj);
		retour.put("status", "ok");
		return retour;
	}
	
	//The http response this api will send in case of error
	public static Map<String, Object> returnError(Object obj){
		retour.clear();
		retour.put("message", ERROR_MESSAGE);
		retour.put("response", obj);
		retour.put("status", "ko");
		return retour;
	}
}
