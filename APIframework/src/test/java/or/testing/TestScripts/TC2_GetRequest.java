package or.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethos;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest 
{ 
	@Test
	public void Testcase2() throws IOException
	{
		Properties prObject=PropertiesRead.readPropertyFile("../APIframework/URI.properties");
		HTTPMethos http=new HTTPMethos(prObject);
		Response res=http.getRequest("QA_URI_APIFOLKS", TC1_PostRequest.id);
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is-----");
		System.out.println(res.asString());
		
	}

}
