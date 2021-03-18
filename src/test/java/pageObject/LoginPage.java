package pageObject;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {
    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void fillEmail(){
       email.sendKeys("leubass@gmail.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("penJig-4vedgy-jebfat");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }
}
