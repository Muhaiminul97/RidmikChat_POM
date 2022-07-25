package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;


import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {
	

	public static Properties prop;
	public static WebEventListener eventListener;
	public static AppiumDriver driver = null;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");
			prop.load(ip);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){

	}
	
	
	
	
	
	
	
	

}
