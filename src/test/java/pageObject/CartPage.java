package pageObject;

import elementMapper.CartElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartElementMapper {

    public CartPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getNameProductCart(){
        return productNameCart.getText();
    }

    public String getTextNavigationPage(){
        return navigation_page.getText();
    }

    public boolean isCartPage(){
        return getTextNavigationPage().equals("Your shopping cart");
    }

    public String getTextSummaryProductsQuantity(){
        return summary_products_quantity.getText();
    }

    public String getTextCartTitle(){
        return cart_title.getText();
    }

}
