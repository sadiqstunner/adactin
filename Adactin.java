package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("mohammedsadiq125");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("4Z692U");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		WebElement location = driver.findElement(By.name("location"));
		Select l = new Select(location);
		l.selectByVisibleText("Sydney");
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select a = new Select(hotel);
		a.selectByVisibleText("Hotel Creek");
		
		WebElement room = driver.findElement(By.name("room_type"));
		Select room1 = new Select(room);
		room1.selectByVisibleText("Deluxe");
		
		WebElement no = driver.findElement(By.id("room_nos"));
		Select n = new Select(no);
		n.selectByVisibleText("1 - One");
		
		WebElement date = driver.findElement(By.name("datepick_in"));
		date.clear();
		date.sendKeys("20/01/2023");
		
		WebElement d = driver.findElement(By.id("datepick_out"));
		d.clear();
		d.sendKeys("25/01/2023");
		
		WebElement r = driver.findElement(By.id("adult_room"));
		Select r1 = new Select(r);
		r1.selectByValue("3");
		
		WebElement c = driver.findElement(By.id("child_room"));
		Select c1 = new Select(c);
		c1.selectByVisibleText("1 - One");
		
		WebElement b = driver.findElement(By.id("Submit"));
		b.click();
		
		
		WebElement s = driver.findElement(By.id("radiobutton_0"));
		s.click();
		
		WebElement e = driver.findElement(By.id("continue"));
		e.click();
		
		WebElement g = driver.findElement(By.name("first_name"));
		g.sendKeys("mohammed sadiq");
		
		WebElement h = driver.findElement(By.name("last_name"));
		h.sendKeys("M");
		
		WebElement i = driver.findElement(By.name("address"));
		i.sendKeys("13 thanthai periyar nagar, 2nd street, ayanavaram");
		
		WebElement j = driver.findElement(By.name("cc_num"));
		j.sendKeys("1234567890123456");
		
		WebElement k = driver.findElement(By.id("cc_type"));
		Select k1 = new Select(k);
		k1.selectByVisibleText("American Express");
		
		WebElement m = driver.findElement(By.id("cc_exp_month"));
		Select l1 = new Select(m);
		l1.selectByVisibleText("May");
		
		WebElement p = driver.findElement(By.id("cc_exp_year"));
		Select p1 = new Select(p);
		p1.selectByVisibleText("2015");
		
		
		WebElement q = driver.findElement(By.name("cc_cvv"));
		q.sendKeys("456");
		
		WebElement t = driver.findElement(By.name("book_now"));
		t.click();
		
		WebElement log = driver.findElement(By.id("logout"));
		log.click();
		
	}
	
}
