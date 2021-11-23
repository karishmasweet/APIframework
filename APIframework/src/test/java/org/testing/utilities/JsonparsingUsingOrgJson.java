package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonparsingUsingOrgJson 
{
	public static void jsonparson(String responseData,String keyName)
	{
		JSONArray data=new JSONArray(responseData);
		int length=data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj=data.getJSONObject(i);
			System.out.println("id value is "+obj.get(keyName));
			
		}
	}

}
