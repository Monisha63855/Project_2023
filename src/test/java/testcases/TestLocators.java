package testcases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.TypeOptions;
import com.microsoft.playwright.Playwright;

public class TestLocators {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		page.navigate("http://gmail.com");
	
		//page.locator("#identifierId").type("trainer@way2automation.com");
		//page.locator("[id='identifierId']").type("trainer@way2automation.com");
		//page.type("id=identifierId", "trainer@way2automation.com", new TypeOptions().setDelay(100));
		page.locator("[type=email]").type("trainer@way2automation.com");
		//page.click("text=Next");
		page.click("button:has-text('Next')");
		page.locator("[name=Passwd]").fill("sdfsdfdsf");
		page.click("button:has-text('Next')");
//		Thread.sleep(3000);
		System.out.println(page.locator("button:has-text('Forgot password?')").innerText());
Thread.sleep(3000);
		
		

		
		
	}

}
