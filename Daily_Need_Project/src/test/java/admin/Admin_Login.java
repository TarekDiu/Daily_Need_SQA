package admin;


import org.testng.annotations.Test;

import base.Base;

public class Admin_Login extends Base {

	@Test
	public static void adminLogin() throws InterruptedException {

		page.navigate("https://dailyneed.prodevsltd.xyz/admin-login");

		System.out.println(page.title());
		
		Thread.sleep(1000);
		
		page.locator("//input[@id = 'email']").fill("admin@gmail.com");
		Thread.sleep(3000);
		page.locator("//input[@id = 'password']").fill("admin12345");
		Thread.sleep(3000);
		page.locator("//button[@class = 'btn btn-primary btn-lg btn-block']").click();
		
		
		

	}

}
