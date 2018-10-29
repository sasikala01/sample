package sampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
@Test
public void loginTest() throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Driver\\lib1\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.bing.com/");
	WebElement input=wd.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
	input.sendKeys("abc");
	input.submit();
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\eclipse\\GithubTest\\screen\\sasi\\sample.jpeg"));
}
}
