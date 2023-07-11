package com.dockerdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://www.google.com");
		Thread.sleep(2000);
		dr.get("https://www.converse.in");
		Thread.sleep(2000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[3]/header/div[1]/div[3]/div[1]/button/span/span")).click();
		Thread.sleep(2000);
		dr.findElement(By.name("email")).sendKeys("akshayaraja187@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.name("password")).sendKeys("Converse/123");
		Thread.sleep(3000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[3]/header/div[1]/div[3]/aside[1]/div/div/div/div/form/div[4]/button/span")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[3]/header/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/ul/li[1]/span[1]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[3]/header/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/ul/li[1]/span[2]/span/ul/li[1]/ul/li[1]/label[1]/ul/li[2]/a")).click();
		Thread.sleep(10000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[4]/article/div[3]/div/div[2]/section/div/div/div[2]/div/div[1]/a/div/img[2]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[2]/form/section[2]/div/div/div[3]/a/div/img[2]")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[2]/form/section[4]/div/span")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[2]/form/section[4]/div/div[1]/div/button[3]/span")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[2]/form/section[6]/button[2]/span")).click();
		
	}
	

}
