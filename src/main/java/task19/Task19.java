package task19;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Load the URL using get method
		driver.get("https://www.guvi.in/register");

		// Implicit wait for the element of the page to click them
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Maximise the browser view
		driver.manage().window().maximize();

		// Locating FullName text input with different locator strategies

		// driver.findElement(By.id("name")).sendKeys("Katty perry");
		driver.findElement(By.className("form-control")).sendKeys("Katty perry");
		// driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Katty
		// perry");
		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Katty perry");
//		List<WebElement> names = driver.findElements(By.tagName("input"));
//
//		for (WebElement name : names) {
//			if (name.getAttribute("id").equals("name")) {
//				name.sendKeys("Katty perry");
//			}
//		}

		// Locating Email text input with different locator strategies (class
		// name has issues)

		driver.findElement(By.id("email")).sendKeys("Kattyperry34@gmail.com");
		// driver.findElement(By.className("form-control")).sendKeys("Kattyperry34@gmail.com");
		// driver.findElement(By.cssSelector("#email")).sendKeys("Kattyperry34@gmail.com");
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kattyperry34@gmail.com");
//		List<WebElement> emails = driver.findElements(By.tagName("input"));
//
//		for (WebElement email : emails) {
//			if (email.getAttribute("id").equals("email")) {
//				email.sendKeys("Kattyperry34@gmail.com");
//			}
//		}

		// Locating password text input with different locator strategies (class
		// name has issues

		// driver.findElement(By.id("password")).sendKeys("Pastem@78");
		// driver.findElement(By.className("form-control
		// password-err")).sendKeys("Pastem@78");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Kattyperry@78");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pastem@78");
//		List<WebElement> passwords = driver.findElements(By.tagName("input"));
//
//		for (WebElement password : passwords) {
//			if (password.getAttribute("id").equals("password")) {
//				password.sendKeys("Dantay@3456");
//			}
//		}

		// Locating Mobile number text input with different locator strategies (class
		// name has issues)

		// driver.findElement(By.id("mobileNumber")).sendKeys("8678900982");
		// driver.findElement(By.className("form-control
		// countrycode-left")).sendKeys("8678900982");
		// driver.findElement(By.tagName("input")).sendKeys("8678900982");
		// driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("8678900982");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8199045082");
//		List<WebElement> numbers = driver.findElements(By.tagName("input"));
//
//		for (WebElement number : numbers) {
//			if (number.getAttribute("id").equals("mobileNumber")) {
//				number.sendKeys("9089967789");
//			}
//		}

		// Using sleep to see the click of SignUp button
		Thread.sleep(1000);

		// Locating Sign Up button with different locator strategies(class name has
		// issues)

		// driver.findElement(By.id("signup-btn")).click();
		// driver.findElement(By.className("btn signup-btn")).click();
		// driver.findElement(By.cssSelector("#signup-btn")).click();
		// driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		// driver.findElement(By.linkText("Sign Up")).click();
		// driver.findElement(By.partialLinkText("Sign")).click();
		List<WebElement> buttons = driver.findElements(By.tagName("a"));

		for (WebElement button : buttons) {
			if (button.getAttribute("id").equals("signup-btn")) {
				button.click();
			}
		}

		// Click the may be later button to proceed to Email verification screen
		driver.findElement(By.partialLinkText("May")).click();

		// Validate the page is navigated to Email verification screen
		String verifyText = driver.findElement(By.xpath("//h1[text()='Almost Done! Check Your Inbox!']")).getText();

		if (verifyText.equals("Almost Done! Check Your Inbox!")) {
			System.out.println("The page is navigated to Email verification screen successfully!!");
		} else {
			System.out.println("The page navigation to Email verification screen failed");
		}

	}

}
