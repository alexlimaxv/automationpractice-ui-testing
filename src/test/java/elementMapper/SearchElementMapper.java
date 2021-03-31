package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElementMapper {

    @FindBy(className = "navigation_page")
    public  WebElement navigation_page;

    @FindBy(className = "lighter")
    public WebElement lighter;

    @FindBy(className = "heading-counter")
    public WebElement heading_counter;

    @FindBy(css = "li:nth-child(1) div.right-block a")
    public WebElement searchListElementOne;

    @FindBy(css= ".pb-center-column h1[itemprop=name]")
    public WebElement dressPageElement;

    //This selector get the text from <a> tag at the top left of the page
    //This gets the text Printed Summer Dress
    @FindBy(css = "div.breadcrumb.clearfix")
    public WebElement navigationDressPage;


    public WebElement short_description_content;

}
