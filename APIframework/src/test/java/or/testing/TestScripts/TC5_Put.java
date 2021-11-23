package or.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.teststeps.HTTPMethos;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.jsonParsing;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_Put 
{
	@Test
	public void Tsetcase5() throws IOException
	{
		Properties prObject=PropertiesRead.readPropertyFile("../APIframework/URI.properties");
		JSONObject obj= new JSONObject();
		obj.put("id",TC1_PostRequest.id);
		obj.put("firstname", "Rajni");
		obj.put("lastname", "Malhotranew");
		obj.put("designation","senior QA Manger");
		
		HTTPMethos http=new HTTPMethos(prObject);
		Response res=http.putRequest("QA_URI_APIFOLKS",TC1_PostRequest.id,obj.toString());
		System.out.println("-------------PutRequest-----------");
		System.out.println("status code is ");
		System.out.println(res.getStatusCode());
		System.out.println("Response data is-----");
		System.out.println(res.asString());
		
		System.out.println("Designation= " + jsonParsing.jsonParingUsingJsonPath("designation", res));
		ResponseValidation.DataValidate("Rajni", res, "firstname");
	    System.out.println("---------------------------");
		
	}

}
