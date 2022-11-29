package com.MVNProject;

import org.openqa.selenium.WebElement;

public class Pomtesting extends AppBase{

	public static void main(String[] args) {
		getdriver("chrome");
		maximize();
		driver.get("http://adactinhotelapp.com/");
		
		// function1
		AppPOMfun1 connect = new AppPOMfun1(driver);
		sendkey(connect.getUsername(), "Chitrapun");
		sendkey(connect.getPasswrd(), "chitra#pun#");
		connect.getLogin().click();
		
		//funtion2
		
		AppPOMfun2 connect1 = new AppPOMfun2(driver);
		WebElement a = connect1.getLocation();
		connect1.getLocation().click();
		dropdown(a, "visibletext", "London");
		mouseAction("click", a);
		WebElement b = connect1.getHotels();
		connect1.getHotels().click();
		dropdown(b, "value", "Hotel Sunshine");
		mouseAction("click", b);
		WebElement c = connect1.getRoomtype();
		connect1.getRoomtype().click();
		dropdown(c, "indexing", "1");
		mouseAction("click", c);
		WebElement d = connect1.getRoomNo();
		connect1.getRoomNo().click();
		dropdown(d, "indexing", "2");
		mouseAction("click", d);
		WebElement e = connect1.getDateIn();
		connect1.getDateIn().clear();
		sendkey(e, "28/11/2022");
		WebElement f = connect1.getDateOut();
		connect1.getDateOut().clear();
		sendkey(f, "30/11/2022");
		WebElement g = connect1.getAdultRoom();
		connect1.getAdultRoom().click();
		dropdown(g, "indexing", "1");
		mouseAction("click", g);
		WebElement h = connect1.getChildRoom();
		connect1.getChildRoom().click();
		dropdown(h, "indexing", "2");
		mouseAction("click", h);
		connect1.getSubmit().click();
	}

}
