package or.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethos;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetAll 
{
	@Test
	public void Testcase3() throws IOException
	{
		Properties prObject=PropertiesRead.readPropertyFile("../APIframework/URI.properties");
		HTTPMethos http=new HTTPMethos(prObject);
		Response res=http.getAll("QA_URI_APIFOLKS");
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is-----");
		System.out.println(res.asString());
		
	}
}
