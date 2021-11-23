package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement 
{
	public static String variableValue(String jsonData,String variableName,String variableValue)
	{
		String replacedValue=jsonData.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		
		return replacedValue;
		
	}

}
