package pageObject;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }
    public String getTextPageHeading(){
        return page_heading.getText();
    }

}
