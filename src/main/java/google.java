import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    static WebDriver driver;
    public static void main(String aregs[])
    {
         driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }

}
