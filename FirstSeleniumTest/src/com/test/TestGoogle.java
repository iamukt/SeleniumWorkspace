package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {

	@Test
	public void test() {
		
		WebDriver wd = new FirefoxDriver();
		/*wd.get("http://www.makemytrip.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[3]/a")).click();
		System.out.println(wd.getTitle());
		*/
		wd.get("http://www.cleartrip.com");
		wd.findElement(By.xpath(".//*[@id='Home']/div/aside[1]/nav/ul[1]/li[2]/a[1]")).click();;
		wd.findElement(By.className(".keyValue.span.span24.required.ui-autocomplete-input.placeholder")).sendKeys("AB");
	}

}
