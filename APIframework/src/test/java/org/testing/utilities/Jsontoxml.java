package org.testing.utilities;
import org.json.JSONObject;
import org.json.XML;

public class Jsontoxml 
{
	public String conversionJsontoxml(String json)
	{
		JSONObject obj=new JSONObject(json);
		String xml_data=XML.toString(obj);
		return xml_data;
	}

}
