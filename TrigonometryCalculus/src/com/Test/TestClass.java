package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Case.Trigonometric_Expressions;

public class TestClass 
{
	private WebDriver driver;
	ConfigFileReader configFileReader;
	
	
    @BeforeTest
    public void setUp() {
    	configFileReader= new ConfigFileReader();
		//System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		//driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", configFileReader.getedgeDriverPath());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
    }
    
    @Test
    public void testApp()
    {
    	Trigonometric_Expressions tri = new Trigonometric_Expressions(driver);
    	tri.open(configFileReader.getApplicationUrl());
        tri.Testcase1();
        tri.Testcase2();
        tri.Testcase3();
        tri.Testcase4();
        tri.Testcase5();
        tri.Testcase6();
        tri.Testcase7();
        tri.Testcase8();
        tri.Testcase9();
        tri.Testcase10();
        tri.Testcase11();
        tri.Testcase12();
        tri.Testcase13();
        tri.Testcase14();
        tri.Testcase15();
        tri.Testcase16();
        tri.Testcase17();
        tri.Testcase18();
        tri.Testcase19();
        tri.Testcase20();
        tri.Testcase21();
        tri.Testcase22();
        tri.Testcase23();
        tri.Testcase24();
        tri.Testcase25();
        tri.Testcase26();
        tri.Testcase27();
        tri.Testcase28();
        tri.Testcase29();
        tri.Testcase30();
        tri.Testcase31();
        tri.Testcase32();
        
    }
    
   // @AfterTest
   // public void close() {
   // 	driver.quit();
   // }

}
