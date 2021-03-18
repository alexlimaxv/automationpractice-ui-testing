package tests;


import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.HomePage;
import pageObject.LoginPage;
import utils.Browser;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{
    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }

    @Test
    public void testLogin(){
        //iniciando a pagina

        HomePage home = new HomePage();
        home.clickBtnLogin();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("Validou se está na pagina de login");

        //iniciando o login

        LoginPage login = new LoginPage();
        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em signin");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a URL da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta site");


        //primeira versão sem padronizaçao de projeto

//        Browser.getCurrentDriver().findElement(By.className("login")).click();
//        System.out.println("Clicou na pagina de login");
//        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("leubass@gmail.com");
//        System.out.println("Preencheu o email");
//        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("penJig-4vedgy-jebfat");
//        System.out.println("Preencheu a senha");
//        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
//        System.out.println("Clicou em signin");
//        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
//        System.out.println("Validou a URL da minha conta");
//        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
//        System.out.println("Validou minha conta site");

    }

}
