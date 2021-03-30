package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pageObject.*;
import utils.Browser;
import utils.Utils;

import java.util.Locale;
import static org.junit.Assert.*;

@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests{
    @Test
    @Story("Teste de abrir o site")
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }

    @Test
    @Story("Teste de realizar o login")
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
        System.out.println("Validou a URL da pagina minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou pagina minha conta no site");

    }

    @Test
    @Story("Teste de fazer uma pesquisa e acessar a página do produto ")
    public void testSearch(){

        String quest= "DRESS";
        String questResultQtd = "7";
        String firstDressResult = "Printed Summer Dress";
        //Inicializando os elementos
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Teste de pesquisa
        home.doSearch(quest);

        //Validando a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeadingCounter(), CoreMatchers.containsString(questResultQtd));


        //Clica no produto pesquisa e segue para pagina do produto
        search.clickFirstItemList();

        //Validação se está na página do produto pesquisado
        assertTrue(search.getTextFirstDress().contains(firstDressResult));
        assertTrue(search.getNavigationDressText().contains(firstDressResult));
        assertTrue(search.getShortDescriptionContent().contains("Long printed dress with thin adjustable straps"));

    }

    @Test
    @Story("Teste de adicionar um produto ao carrinho")
    public void testShoppingCart(){
        //Texto encontrado na pagina do carrinho
        String qtdResult = "1";
        String cartTittle = "Shopping-cart summary".toUpperCase(Locale.ROOT);

        //Iniciar as paginas
        HomePage home = new HomePage();
        CartPage cart = new CartPage();

        //Clica no 1º produto da pagina
        home.clickProduct();
        home.clickAddToCart();
        home.clickContinueShoppingBtn();

        //Validação para atestar se entramos na pagina correta
        assertTrue(cart.isCartPage());
        assertThat(cart.getTextSummaryProductsQuantity(), CoreMatchers.containsString(qtdResult));
        assertTrue(cart.getTextCartTitle().contains(cartTittle));
    }

    @Test
    @Story("Teste acessar a categoria Tshirts")
    public void testAccessCategoryTshirts(){
        //Iniciar a pagina
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        //Clicar na categoria T-Shirts
        home.clickCategoryTshirts();

        //Validar se ao clicar na categoria Tshirts ocorre o direcionamento correto
        assertTrue(category.isPageTshirts());

    }
    @Test
    @Story("Teste de adicionar e acessar a página do produto")
    public void testAddProductToProductPage(){
        //Acessar a categoria Tshirts
        testAccessCategoryTshirts();

        //Iniciar as paginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva o nome do produto na pagina do produto
        String nameProductcategory = category.getProductNameCategory();

        //Clicar em more
        category.clickProductAddToProductPage();

        //Verificar se o produto está na página de detalhes do produto
        assertTrue(pdp.getProductNamePDP().equals(nameProductcategory));

    }

    @Test
    @Story("Test de adicionar um produto ao carrinho")
    public void testAddProductToCartPage(){
        //Acessa a pagina do produto
        testAddProductToProductPage();

        //Inicia as páginas
        ProductPage pdp = new ProductPage();
        CartPage cart= new CartPage();

        //Salvar o nome na página de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Clicar no botão e adicionar no carrinho
        pdp.clickButtonAddToCart();

        //Clicar no botão proceed to checkout
        pdp.clickButtonModalProceedToCheckout();

        //Validação do nome do produto no Carrinho
        assertTrue(cart.getNameProductCart().equals(nameProductPDP));

    }


    @Test
    @Story("Teste de criaçao de uma conta")
    public void testCreateAccount(){
        //iniciar a pagina
        HomePage home = new HomePage();
        CreateAccountPage account = new CreateAccountPage();
        //Clicando na pagina de signIn
        home.clickBtnLogin();

        //Preenche o email e clica em criar conta
        account.fillEmailToCreateAccount();
        account.clickSubmitCreateBtn();

        //adiciona um tempo de espera até que esta pagina carregue
        //Browser.wait.until(ExpectedConditions.urlContains("#account-creation"));

        //Validando se estamos na pagina create account
        assertTrue(account.getTextPageSubHeading().contains("YOUR PERSONAL INFORMATION"));
        assertTrue(account.isCreateAccountPage());


        //Preenchendo os campos de usuário
        account.createAccount();

        //Validando se estamos na pagina My Account
        assertTrue(account.isAccountPage());
        assertTrue(account.isMyAccountInfo());

    }


}
