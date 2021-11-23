package or.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethos;
import org.testing.utilities.JsonparsingUsingOrgJson;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_GetAll_FetchID 
{
	@Test
	public void Testcase4() throws IOException
	{
		Properties prObject=PropertiesRead.readPropertyFile("../APIframework/URI.properties");
		HTTPMethos http=new HTTPMethos(prObject);
		Response res=http.getAll("QA_URI_APIFOLKS");
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is-----");
		System.out.println(res.asString());
		JsonparsingUsingOrgJson.jsonparson(res.asString(),"id");
	}

}
