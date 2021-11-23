package org.testing.utilities;

import io.restassured.response.Response;

public class jsonParsing 
{
	public static String jsonParingUsingJsonPath(String jsonPath,Response res)
	{
		return res.jsonPath().get(jsonPath).toString();
	}

}
