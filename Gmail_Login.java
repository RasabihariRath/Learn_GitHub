import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
/**

* @param args

*/
      public static void main(String[] args) {
            

// objects and variables instantiation
              WebDriver driver = new FirefoxDriver();
              String appUrl = "https://accounts.google.com";

// launch the firefox browser and open the application url
              driver.get(appUrl);
// maximize the browser window
              driver.manage().window().maximize();
// declare and initialize the variable to store the expected title of the webpage.

              String expectedTitle = "Sign in - Google Accounts";

// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();

// compare the expected title of the page with the actual title of the page and print the result
              if (expectedTitle.equals(actualTitle))
              {
                     System.out.println("Verification Successful - The correct title is displayed on the web page.");
              }

             else
              {
                     System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
              }

// enter a valid username in the email textbox
              WebElement username = driver.findElement(By.id("Email"));

              username.clear();
    username.sendKeys("sarithacharya");
//Click on Next Button
    
              WebElement nextbutton = driver.findElement(By.id("next"));
                nextbutton.click();

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
// enter a valid password in the password textbox
              WebElement password = driver.findElement(By.id("Passwd"));
              password.clear();
              password.sendKeys("Saritha#23");

// click on the Sign in button
              WebElement SignInButton = driver.findElement(By.id("signIn"));
              SignInButton.click();
// click on icon for signout option
              WebElement signoutoption = driver.findElement(By.xpath("//a[@class='gb_b gb_7a gb_R']"));
              signoutoption.click();
// click on signout button
              WebElement SignoutButton = driver.findElement(By.xpath("//a[@class='gb_Ea gb_oe gb_ve gb_qb']"));
              SignoutButton.click();
// close the web browser
              driver.close();
              System.out.println("Test script to login and Logout executed successfully.");

// terminate the program

              System.exit(0);

       }
}