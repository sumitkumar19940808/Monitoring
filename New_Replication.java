package monitoring;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class New_Replication {
  public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "/home/software-543/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.4.139/replication_monitor.php");
		File file = new File("/mnt/usernarender/automationscreenshots/Replications/repli_status.csv");
		if (file.exists()) {
			file.delete();
		}
		File file1 = new File("/mnt/usernarender/automationscreenshots/Replications/repli_status.csv");
		if (!file1.exists()) {
			file.createNewFile();
		}
		FileOutputStream fop = new FileOutputStream(file, true);
		fop.write("Mizoram Replication".getBytes());
		for(int i=1;i<=18;i++)
		{		
		String text=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
		String  color1=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getCssValue("color");
		String hex = Color.fromString(color1).asHex();
		String  color2=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getCssValue("background-color");
		System.out.println(text+"---------------------------"+color1);
		// /html/body/table/tbody/tr[3]/td[1]
	}
}
}
