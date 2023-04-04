package testcases;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.ScreenshotOptions;

public class TestMouseOver {

	public static void main(String[] args) {


		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();
		page.navigate("https://www.way2automation.com/");

		
		page.locator("//*[@id=\"menu-item-27580\"]/a/span[2]").hover();
		page.screenshot(new ScreenshotOptions().setPath(Paths.get("D:\\eclipse-workspace\\PlaywrightSeries\\screensho\\screenshot.png")));

		page.locator("//*[@id=\"menu-item-27592\"]/a").screenshot(new Locator. ScreenshotOptions().setPath(Paths.get("D:\\eclipse-workspace\\PlaywrightSeries\\screenshot\\screenshot.png")));
	

	}

}
