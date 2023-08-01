package com.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Test.ConfigFileReader;

public class Trigonometric_Expressions 
{

	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public Trigonometric_Expressions(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	public void open(String url) {
        driver.get(url);
    }
	
	public void Testcase1() {
		driver.findElement(By.linkText("Triginometry and Calculus")).click();
        driver.findElement(By.linkText("Trigonometric Expressions")).click();
        driver.findElement(By.name("s")).sendKeys("sin(x)^2+cos(x)^2");
        driver.findElement(By.xpath(configFileReader.Xpath1())).click();
    }
	
	public void Testcase2() {
        driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).sendKeys("nbwdeytuv23");
        driver.findElement(By.xpath(configFileReader.Xpath1())).click();
    }
	
	public void Testcase3() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).sendKeys("[sin^4(x) - cos^4(x)] / [sin^2(x) - cos^2(x)]");
        driver.findElement(By.xpath(configFileReader.Xpath1())).click();
    }
	
	public void Testcase4() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).sendKeys("");//blank data
        driver.findElement(By.xpath(configFileReader.Xpath1())).click();
    }
	////////////
	public void Testcase5() {
		driver.findElement(By.linkText("Triginometry and Calculus")).click();
        driver.findElement(By.linkText("Right Triangles")).click();
        driver.findElement(By.name("c")).sendKeys("12");
        driver.findElement(By.name("e")).sendKeys("30");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("12");
        driver.findElement(By.name("a")).sendKeys("2");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase6() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("12");
        driver.findElement(By.name("e")).sendKeys("30");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("12");
        driver.findElement(By.name("a")).sendKeys("2");
        driver.findElement(By.xpath(configFileReader.Xpath3())).click();
    }
	
	public void Testcase7() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("2");
        driver.findElement(By.name("e")).sendKeys("12");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("30");
        driver.findElement(By.name("a")).sendKeys("20");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase8() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("w");
        driver.findElement(By.name("e")).sendKeys("ed");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("23");
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase9() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("");
        driver.findElement(By.name("e")).sendKeys("");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("");
        driver.findElement(By.name("a")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase10() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("");
        driver.findElement(By.name("e")).sendKeys("");
        driver.findElement(By.name("b")).sendKeys("2");
        driver.findElement(By.name("d")).sendKeys("4");
        driver.findElement(By.name("a")).sendKeys("2");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase11() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("c")).sendKeys("");
        driver.findElement(By.name("e")).sendKeys("30");
        driver.findElement(By.name("b")).sendKeys("");
        driver.findElement(By.name("d")).sendKeys("4");
        driver.findElement(By.name("a")).sendKeys("2");
        driver.findElement(By.xpath(configFileReader.Xpath2())).click();
    }
	
	public void Testcase12() {
		driver.findElement(By.linkText("Triginometry and Calculus")).click();
        driver.findElement(By.linkText("Derivatives")).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("2x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase13() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("2x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("y");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase14() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("2x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase15() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase16() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase17() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("2x^2+y");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("y");
        driver.findElement(By.xpath(configFileReader.Xpath4())).click();
        
    }
	
	public void Testcase18() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.linkText("I need to differentiate a big fraction")).click();
        driver.findElement(By.name("top")).clear();
        driver.findElement(By.name("top")).sendKeys("x+1");
        driver.findElement(By.name("bottom")).clear();
        driver.findElement(By.name("bottom")).sendKeys("x^2+5");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath5())).click();
        
    }
	
	public void Testcase19() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("top")).clear();
        driver.findElement(By.name("top")).sendKeys("x+1");
        driver.findElement(By.name("bottom")).clear();
        driver.findElement(By.name("bottom")).sendKeys("x^2+5");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath5())).click();
        
    }
	
	public void Testcase20() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("top")).clear();
        driver.findElement(By.name("top")).sendKeys("");
        driver.findElement(By.name("bottom")).clear();
        driver.findElement(By.name("bottom")).sendKeys("x^2+5");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath5())).click();
        
    }
	
	public void Testcase21() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("top")).clear();
        driver.findElement(By.name("top")).sendKeys("x+1");
        driver.findElement(By.name("bottom")).clear();
        driver.findElement(By.name("bottom")).sendKeys("");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath5())).click();
        
    }
	
	public void Testcase22() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("top")).clear();
        driver.findElement(By.name("top")).sendKeys("x+1");
        driver.findElement(By.name("bottom")).clear();
        driver.findElement(By.name("bottom")).sendKeys("x^2+5");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("y");
        driver.findElement(By.xpath(configFileReader.Xpath5())).click();
        
    }
	
	public void Testcase23() {
		driver.findElement(By.linkText("Triginometry and Calculus")).click();
        driver.findElement(By.linkText("Integration")).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("8x^3");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath6())).click();
        
    }
	
	public void Testcase24() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath6())).click();
        
    }
	
	public void Testcase25() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("8x");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath6())).click();
        
    }
	
	public void Testcase26() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("?>");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.xpath(configFileReader.Xpath6())).click();
        
    }
	
	public void Testcase27() {
		driver.findElement(By.linkText("Triginometry and Calculus")).click();
        driver.findElement(By.linkText("Numerical Answer to Integral")).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("1");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("0");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
	
	public void Testcase28() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("0");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
	
	public void Testcase29() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("1");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
	
	public void Testcase30() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("1");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("x^2");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("0");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
	
	public void Testcase31() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("1");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("0");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
	
	public void Testcase32() {
		driver.findElement(By.cssSelector(configFileReader.cssSelector1())).click();
        driver.findElement(By.name("upper")).clear();
        driver.findElement(By.name("upper")).sendKeys("1");
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("?>");
        driver.findElement(By.name("wrt")).clear();
        driver.findElement(By.name("wrt")).sendKeys("x");
        driver.findElement(By.name("lower")).clear();
        driver.findElement(By.name("lower")).sendKeys("0");
        driver.findElement(By.xpath(configFileReader.Xpath7())).click();
        
    }
}
