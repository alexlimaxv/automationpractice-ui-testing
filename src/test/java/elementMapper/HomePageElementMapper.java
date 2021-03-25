package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {
    @FindBy (className = "login")
    public WebElement login;

    public WebElement search_query_top;

    //Busca elemento pelo nome
    //public WebElement submit_search;

   //Busca Elemento pelo xpath
    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    public WebElement submit_search;

//    //Busca Elemento pelo css selector
//    @FindBy(css = "button.btn.btn-default.button-search")
//    public WebElement submit_search;

    //Clica no produto na pagina home
    @FindBy(css = "#homefeatured li:nth-child(1) div div.right-block h5 a")
    public WebElement clickProduct;

    //Adiciona o produto ao carrinho
    public WebElement add_to_cart;

    //Segue para a pagina do carrinho
    @FindBy(css = "a.btn.btn-default.button.button-medium")
    public WebElement proceedToCheckoutBtn;

    @FindBy(css = "#block_top_menu .sf-menu li:nth-child(3) a[title=T-shirts]")
    public WebElement menuTshirts;




}
