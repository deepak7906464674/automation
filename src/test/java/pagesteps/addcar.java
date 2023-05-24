package pagesteps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import helper.Base;

public class addcar extends Base {

	public void check_basket_is_empty() throws Exception {
		Thread.sleep(6500);
		WebElement basket = driver.findElement(
				By.xpath("//button[@class='cartTrigger-trigger-3Ke cartTrigger-trigger-2w8 clickable-root-2gB']"));
		String s = basket.getText();
		System.out.println(s);
		// System.out.println(s.contains("0.00"));
		if (!s.contains("0.00")) {
			basket.click();
			List<WebElement> list = driver.findElements(By.xpath("//button[@class='item-deleteButton-3Eu']"));
			//System.out.println(list);

			for (WebElement ele : list) {
				//System.out.println("hii");
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", ele);
			}
			Thread.sleep(1400);
			WebElement back = driver.findElement(By.xpath("//span[@class='miniCart-minicartToggle-1ny']"));
			back.click();
		}

	}

	// if(!s.contains("0.00"))

	public void search_epod() throws Exception {
		Thread.sleep(4000);
		WebElement epod = driver.findElement(By.xpath("//input[@name='search_query']"));
		epod.sendKeys("epod");
		pressenter();

	}

	public void select_product() {
		WebElement addproduct = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", addproduct);
	}

	public void validate_basket_product() throws Exception {
		Thread.sleep(3000);
		WebElement validate1 = driver.findElement(By.xpath("//span[text()='Basket Total: ']"));
		assertTrue(validate1.isDisplayed());
	}

	public void click_product() {
		WebElement cproduct = driver.findElement(By.xpath("(//section[@class='productCompactDetail-title-kHJ'])[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", cproduct);
		
	}

	public void add_to_basket() {
		WebElement basket = driver.findElement(
				By.xpath("//button[@class='cartTrigger-trigger-3Ke cartTrigger-trigger-2w8 clickable-root-2gB']"));
		basket.click();
		
		
		WebElement addp = driver.findElement(By.xpath("//button[@type='submit']"));
		addp.click();

	}

}
