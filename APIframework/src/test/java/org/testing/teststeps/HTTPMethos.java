package org.testing.teststeps;
import static io.restassured.RestAssured.*;
import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethos 
{
	Properties pr;
	public HTTPMethos(Properties pr)
	{
		this.pr=pr;
	}
	
public Response PostRequest(String bodyData,String urikey)	
{

	Response r=
			given ()
			.contentType(ContentType.JSON)
			.body(bodyData)
			.when()
			.post(pr.getProperty(urikey));
	return r;
}

public Response getRequest(String urikey,String idValue)
{
	String base=pr.getProperty(urikey);
	String uri=base+"/"+idValue;
	Response res=
			given ()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
	return res;
			
	}

public Response getAll(String urikey)
{

	Response res=
			given ()
			.contentType(ContentType.JSON)
			.when()
			.get(pr.getProperty(urikey));
	return res;
			
	}
public Response putRequest(String urikey, String id,String bodyData)
{
	String uri=pr.getProperty(urikey)+"/"+id;
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(bodyData)
			.when()
			.put(uri);
			
			return res;
	
	
}
public Response Delete(String uriKey, String id)
{
	String uri=pr.getProperty(uriKey)+"/"+id;
	System.out.println(uri);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.delete(uri);
	
	return res;
}
}
