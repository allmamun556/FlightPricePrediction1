package flightprice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.junit.Assert;


public class FlightPricePrediction_test_selenium {

    WebDriver driver;
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium Tutorial\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://flightprice1234.herokuapp.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.id("Dep_Time")).sendKeys("");
        WebElement dateBox = driver.findElement(By.id("Dep_Time"));
        //Fill date as dd//mm/yyyy as 09/25/2013
        dateBox.sendKeys("12102021");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox.sendKeys("0245pm");

        //Thread.sleep(40000);

        WebElement dateBox2 = driver.findElement(By.id("Arrival_Time"));

        //Fill date as dd/mm/yyyy as 09/25/2013

        dateBox2.sendKeys("12102021");

        //Press tab to shift focus to time field

        dateBox2.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox2.sendKeys("0245am");

        
        // Source dropdown
        Select DrpSource=new Select(driver.findElement(By.id("Source")));
        DrpSource.selectByValue("Chennai");
        //Destination
        Select DrpDes=new Select(driver.findElement(By.id("Destination")));
        DrpDes.selectByValue("New Delhi");
        //Thread.sleep(4000);
        //Stopage
        Select stopage=new Select(driver.findElement(By.name("stops")));
        stopage.selectByValue("2");
        //Thread.sleep(4000);
        //Airlines
        Select Airlines=new Select(driver.findElement(By.id("airline")));
        Airlines.selectByValue("Air India");
        // Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
        //Thread.sleep(4000);

        String at = driver.findElement(By.tagName("h3")).getText();

        String et ="Your Flight price is Rs. 22691.45";
        //System.out.println(at);
        driver.close();
        if(at.equalsIgnoreCase(et))
        {
            System.out.println("Test Successfull");
        }
        else
        {
            System.out.println("Test Failure");
        }

    }
    public static void main(String[] args){
        // TODO Auto-generated method stub
    	FlightPricePrediction_test_selenium obj = new FlightPricePrediction_test_selenium();
        obj.launchBrowser();
    }

}
