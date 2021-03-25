package pageObject;

import elementMapper.CategoryElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryElementMapper {

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public boolean isPageTshirts(){
        return getAuthenticationPageTshirts().contains("T-SHIRTS");
    }

    public String getAuthenticationPageTshirts(){
       return nameCategoryTshirts.getText();
    }

    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    public String getProductNameCategory(){
        return productNameCategory.getText();
    }

}
