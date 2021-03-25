package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartElementMapper {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;

    @FindBy(className = "shopping_cart")
    public WebElement shoppingCart;

    @FindBy(className = "navigation_page")
    public WebElement navigation_page;

    public WebElement summary_products_quantity;

    public WebElement cart_title;
}
