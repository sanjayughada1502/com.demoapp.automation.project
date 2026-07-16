package com.ufoframez.testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ufoframez.listeners.Listerners_Implimentations;
import com.ufoframez.testBase.TestBase;

@Listeners(Listerners_Implimentations.class)
public class Manage_Advertiser extends TestBase{

	@Test(priority = 1, groups = {"Functional", "Regression"})
	public void MA01_Verify_Advertiser_Creation() {
		System.out.println("Setup is Running..........");
	}
}
