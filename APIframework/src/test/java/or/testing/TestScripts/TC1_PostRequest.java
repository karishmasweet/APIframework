package or.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.teststeps.HTTPMethos;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomData;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.jsonParsing;
import org.testng.annotations.Test;

import com.github.fge.jsonschema.main.cli.Main;

import io.restassured.response.Response;

//before calling the http method
//we should have the body data
//we should have the properties object

public class TC1_PostRequest 
{

static String id;
@Test
public void firstTC() throws IOException 
{
	Properties prObject=PropertiesRead.readPropertyFile("../APIframework/URI.properties");
	String bodydata=JsonRead.ReadJsonData("../APIframework/src/test/java/org/testing/Resources/RequestPayload.json");
	bodydata=VariableReplacement.variableValue(bodydata,"id", RandomData.randomNo().toString());
	HTTPMethos http=new HTTPMethos(prObject);
	Response res=http.PostRequest(bodydata, "QA_URI_APIFOLKS");
	System.out.println("status code is "+res.statusCode());
	System.out.println("DATA IS");
	System.out.println(res.asString());
	id=res.jsonPath().get("id");
	
	
	ResponseValidation.statusCodeValidation(201, res);
	System.out.println("****************************");
	
	
	
}
	
	


}
