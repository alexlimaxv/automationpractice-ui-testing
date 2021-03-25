package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountElementMapper {
    public WebElement email_create;

    public WebElement SubmitCreate;

    public WebElement id_state;

    @FindBy(css = "#noSlide .page-heading")
    public WebElement pageHeading;

    @FindBy(css = ".account_creation h3.page-subheading")
    public WebElement pageSubHeading;

    public WebElement id_gender1;

    public WebElement customer_firstname;

    public WebElement customer_lastname;

    public WebElement passwd;

    public WebElement address1;

    public WebElement address2;

    public WebElement city;

    public WebElement postcode;

    public WebElement phone_mobile;

    public WebElement alias;

    public WebElement submitAccount;

    @FindBy(css = "#center_column .page-heading")
    public WebElement accountPageHeadingName;

    @FindBy(className = "info-account")
    public WebElement accountInfoAccount;
}
