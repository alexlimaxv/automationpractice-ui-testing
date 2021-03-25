package pageObject;

import elementMapper.SearchElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchElementMapper {

    public SearchPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextNavigationPage(){
        return navigation_page.getText();
    }

    public String getTextLighter(){
        return  lighter.getText();
    }

    public String getTextHeadingCounter(){
        return heading_counter.getText();
    }

    public boolean isSearchPage(){
        return getTextNavigationPage().equals("Search");
    }

    public void clickFirstItemList(){
        searchListElementOne.click();
    }

    public String getTextFirstDress(){
        return dressPageElement.getText();
    }

    public String getNavigationDressText(){
        return navigationDressPage.getText();
    }

    public  String getShortDescriptionContent(){
        return short_description_content.getText();
    }

}
