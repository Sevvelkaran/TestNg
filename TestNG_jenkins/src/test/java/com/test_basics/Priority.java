package com.test_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	
	public class Priority {
	   // WebDriver driver;


	    @Test(alwaysRun = true, groups = {"Regressiontest"})
	    public void f() {
	        System.out.println("hello");
	        }

	    @Test(alwaysRun = true, groups = {"Regressiontest","Smoketest "})
	    public void f1() {
	        System.out.println("Welcome");
	    }
	    @Test(alwaysRun = true, groups = {"Regressiontest","Smoketest", "Latencytest"})
	    public void f2() {
	        
System.out.println("Bye");	        
	    }
	}