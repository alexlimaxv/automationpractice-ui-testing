package pageObject;

import elementMapper.ProductElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductElementMapper {

    public ProductPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNamePDP(){
        return productNamePDP.getText();
    }

    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    public void clickButtonModalProceedToCheckout(){
        buttonModalProceedToCheckout.click();
    }
}
