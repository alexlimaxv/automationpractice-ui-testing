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

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    public WebElement searchListElementOne;

    //Buscando o elemento pelo css selector
//    @FindBy(css = "#center_column  ul  li:nth-child(1)  div  div.right-block  h5  a")
//    public WebElement searchListElementOne;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
    public WebElement dressPageElement;

    //This selector get the text from <a> tag at the top left of the page
    //This gets the text Summer Dresses
//    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a[4]")
//    public WebElement navigationDressPage;

    //This selector get the text from <a> tag at the top left of the page
    //This gets the text Printed Summer Dress
    @FindBy(css = "div.breadcrumb.clearfix")
    public WebElement navigationDressPage;


    public WebElement short_description_content;

}
