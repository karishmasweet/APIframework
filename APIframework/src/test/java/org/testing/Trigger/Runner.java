package org.testing.Trigger;

import java.io.IOException;

import org.testng.annotations.Test;

import or.testing.TestScripts.TC1_PostRequest;
import or.testing.TestScripts.TC2_GetRequest;
import or.testing.TestScripts.TC3_GetAll;
import or.testing.TestScripts.TC4_GetAll_FetchID;
import or.testing.TestScripts.TC5_Put;
import or.testing.TestScripts.TC6_Delete;

public class Runner 
{
	public static void main(String[] args) throws IOException 
	{
		
		TC1_PostRequest tc1=new TC1_PostRequest();
		tc1.firstTC();
		
		
		TC2_GetRequest tc2=new TC2_GetRequest();
		tc2.Testcase2();
		
		TC3_GetAll tc3=new TC3_GetAll();
		tc3.Testcase3();
		
		TC4_GetAll_FetchID tc4=new TC4_GetAll_FetchID();
		tc4.Testcase4();
		
		TC5_Put tc5=new TC5_Put();
		tc5.Tsetcase5();
		
//		TC6_Delete tc6=new TC6_Delete();
//		tc6.Testcase6();
		
	}

}
