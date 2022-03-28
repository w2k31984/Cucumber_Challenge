package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNexflixLogin {
    //Inicializamos la variable driver
    WebDriver driver;
    //Pegamos el codigo que genera al correr el archivo feature.
    @Given("que estoy en la página de Netflix")
    public void que_estoy_en_la_página_de_netflix() {
        // Hacemos la llamada a nuestre WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        //Hacemos que se maximize la pagina
        driver.manage().window().maximize();
        //Hacemos que nos imprima el titulo de la pagina
        System.out.println("Titulo de la pagina:" + driver.getTitle());
    }
    @When("hago click en “Iniciar Sesión”")
    public void hago_click_en_iniciar_sesión() {
        // Buscando el elemento boton para iniciar sesion
        WebElement btninicarsesion = driver.findElement(By.linkText("Iniciar sesión"));
        //Dando click al elemento
        btninicarsesion.click();

    }
    @Then("accedo a la página de login")
    public void accedo_a_la_página_de_login() {
        //Accesando a la pagina de login de Nexflix
        System.out.println("URL" + driver.getCurrentUrl());
        System.out.println("Titulo de la pagina:" + driver.getTitle());

        //Validacion del test con Assert es la escencia de los test

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.netflix.com/sv/login");
        Assert.assertEquals(driver.getTitle(),"Netflix");
        /*Haciendo que falle nuestro test
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.netflix.com/login");*/

        //Testeando una condicion de tipo Booleana si existe un campo con nombre login
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }
    @Then("completo el campo de email")
    public void completo_el_campo_de_email() {
        //Identificando el campo de correo electronico
        WebElement fieldEmailUser = driver.findElement(By.name("userLoginId"));
        //Completando la informacion del campo email
        fieldEmailUser.sendKeys("juan@juan.com");

    }
    @Then("completo el campo de password")
    public void completo_el_campo_de_password() {
        // Identificando el campo de contraseña
        WebElement fieldPasswordUser = driver.findElement(By.id("id_password"));
        //Completando la informacion del campo email
        fieldPasswordUser.sendKeys("holahola");
    driver.quit();
    }
}
