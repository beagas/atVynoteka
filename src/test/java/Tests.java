import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;

public class Tests
{
        WebDriver _globalDriver;
    String _email = new String();

    @BeforeClass
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();
        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    @BeforeClass
    public void SetupUserDetails() {
        _email = generateRandomEmail();
    }

    @BeforeTest
    public void SetupWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        _globalDriver=new ChromeDriver();
        _globalDriver.get("https://vynoteka.lt/");
        _globalDriver.manage().window().maximize();
    }


    @Test
    public void testTC0101(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement resultText = _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[1]/p/strong"));
        Assert.assertEquals(resultText.getText(),"UŽSISAKYKITE AKCIJŲ LEIDINUKĄ");
        _globalDriver.close();
        }

    @Test
    public void testTC0102(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
        _globalDriver.close();
    }

    @Test
    public void testTC0103(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("limoncello");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement resultText = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div/div/a/span"));
        Assert.assertEquals(resultText.getText(),"Limoncello Della Scogliera Blu 0,7 L");
        _globalDriver.close();
            }

    @Test
    public void testTC0104(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/a/img[2]"));
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("limoncello");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div[3]/div/div/button")).click();//į krepšelį
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button/span[2]")).click();//prisijungti
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button")).click();//sukurti paskyrą
        _globalDriver.findElement(By.id("firstname")).sendKeys("Limoncello");
        _globalDriver.findElement(By.id("lastname")).sendKeys("Limoncello");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[8]")).click();//pasirenkami gimimo metai
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[1]")).click();//pasirenkamas gimimo mėnuo
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[1]")).click();//pasirenkama gimimo diena
        _globalDriver.findElement(By.id("email")).sendKeys(_email);
        _globalDriver.findElement(By.id("phone")).sendKeys("61234567");
        _globalDriver.findElement(By.id("password")).sendKeys("Limoncello2+");
        _globalDriver.findElement(By.id("password_repeat")).sendKeys("Limoncello2+");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span")).click();//sutikimas su taisyklemis
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    @Test
    public void testTC0105(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/a/img[2]"));
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("limoncello");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div[3]/div/div/button")).click();//į krepšelį
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button/span[2]")).click();//prisijungti
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button")).click();//sukurti paskyrą
        _globalDriver.findElement(By.id("firstname")).sendKeys("Limoncello");
        _globalDriver.findElement(By.id("lastname")).sendKeys("Limoncello");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[8]")).click();//pasirenkami gimimo metai
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[1]")).click();//pasirenkamas gimimo mėnuo
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[1]")).click();//pasirenkama gimimo diena
        _globalDriver.findElement(By.id("email")).sendKeys(_email);
        _globalDriver.findElement(By.id("phone")).sendKeys("61234567");
        _globalDriver.findElement(By.id("password")).sendKeys("Limoncello2+");
        _globalDriver.findElement(By.id("password_repeat")).sendKeys("Limoncello2+");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span")).click();//sutikimas su taisyklemis
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[2]/button")).click();//krepšelio pasirinkimas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[2]/div/div/div[3]/div[6]/button")).click();//krepšelio atidarymas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div")).click();//pristatymo atidarymas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[1]/div[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Upės g. 1, Vilnius, Vilniaus m. sav.");//adresas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();//adreso paieška
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();//adreso paieška
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/button")).click();//adreso pasirinkimas
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/button")).click();//adreso patvirtinimas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/form/div/button")).click();//kitas etapas
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[4]")).click();//pasirenkamas atvežimo laikas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[2]/button")).click();//
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div[3]/div[1]/button")).click();//peržiūrėti krepšelį
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement resultText1 = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a"));
        Assert.assertEquals(resultText1.getText(),"Limoncello Della Scogliera Blu 0,7 L");// tikrinama ar sutampa prekės pavadiniams

        WebElement resultPrice = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[3]/span"));
        String priceText = resultPrice.getText();

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a")).click();//atidaromas produkto aprašymas
        WebElement resultEuro = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/span[1]"));//išsaugojama produkto kaina
        String euroText = resultEuro.getText();

        WebElement resultPennies = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/span[2]"));
        String penniesText = resultPennies.getText();
        String fullPriceText = euroText + "." + penniesText + " €";

        Assert.assertEquals(priceText, fullPriceText);
        _globalDriver.close();
    }
}









