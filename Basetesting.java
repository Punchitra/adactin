package com.MVNProject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Basetesting extends AppBase{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		getdriver("MSedge");
		geturl("alertbutton");
		maximize();
	driver.findElement(By.id("promtButton")).click();
	driver.switchTo().alert().sendKeys("chitra");
		alert("ok");
		WebElement a = driver.findElement(By.name("email"));
		sendkey(a, "Chitrapun");
		screenshot("sampleimp");
		
		
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
//		WebElement a  = driver.findElement(By.cssSelector("[id=\"searchDropdownBox\"]"));
//		a.click();
//		dropdown(a, "Books");
//		a.submit();
		
		WebElement a1 = driver.findElement(By.cssSelector("[class=\"nav-a  \"]"));
		sleep(3000);
		mouseAction("click", a1);
		sleep(3000);
		mouseRobotnewtab();
	}

}
