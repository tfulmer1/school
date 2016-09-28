
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void main(String[] args) {
        //Setting up the webdriver by establishing OS type and driver paths
        String OS = System.getProperty("os.name");
        System.out.println(OS);
        String path = ("Unknown");
        if(OS.startsWith("Windows")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriver.exe");
        }
        if(OS.startsWith("Linux")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriver");
        }
        if(OS.startsWith("mac")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriverMac");
        }

        if(path == "Unknown"){
            System.out.println("Unable to determine your OS, exiting gracefully");
            System.exit(0);
        }

        //Enabling webdriver
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        //testing the driver functions
        driver.get("http://blueberryandme.com/");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}