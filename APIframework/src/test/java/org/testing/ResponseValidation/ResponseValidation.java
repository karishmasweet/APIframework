package org.testing.ResponseValidation;

import org.testing.utilities.jsonParsing;

import io.restassured.response.Response;

public class ResponseValidation 
{
public static void statusCodeValidation(int expectedStatusCode,Response res)
{
	 if(expectedStatusCode==res.getStatusCode())
	 {
		 System.out.println("status code is matching "+res.getStatusCode());
	 }
	 else
	 {
		 System.out.println("status code is not matching");
	 }
	}
 public static void DataValidate(String expectedData,Response res,String jsonPath)
 {
	 String actualData=jsonParsing.jsonParingUsingJsonPath(jsonPath, res);
	  if (actualData.equals(expectedData))
	  {
		 System.out.println("actual and expected data is matching"); 
	  }
	  else
	  {
		 System.out.println("actual and expected data is not matching"); 
	  }
 }
}
