package pageObject;

import elementMapper.CreateAccountElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class CreateAccountPage extends CreateAccountElementMapper {

    public CreateAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Preenche o email para registro")
    public void fillEmailToCreateAccount(){
        email_create.sendKeys("testecttr@gmail.com");
    }
    @Step("Clica no botão create account")
    public void clickSubmitCreateBtn(){
        SubmitCreate.click();
    }

    public void clickIdGender(){
        id_gender1.click();
    }
    @Step("Preenche o campo primeiro nome")
    public void fillCustomerFirstname(){
        customer_firstname.sendKeys("Alexandro");
    }

    @Step("Preenche o campo último nome")
    public void fillCustomerLastname(){
        customer_lastname.sendKeys("CwiTester");
    }

    @Step("Preenche a senha")
    public void fillPasswd(){
        passwd.sendKeys("123456");
    }

    @Step("Preenche o endereço")
    public  void fillAddressField(){
        address1.sendKeys("Manorglen 12");
    }

    public void fillAddressComplement(){
        address2.sendKeys("Apartment 01");
    }

    @Step("Preenche o nome da cidade")
    public void fillCityName(){
        city.sendKeys("Saint Leopold");
    }

    //Criando um objeto do tipo Select para selecionar
    //Dentro do combobox o estado desejado
    @Step("Seleciona o Estado")
    public void selectStateName(){
        Select select = new Select(id_state);
        select.selectByVisibleText("California");
    }

    @Step("Preenche o cep")
    public void fillZipCode(){
        postcode.sendKeys("90224");
    }
    @Step("Preenche o numero de celular")
    public void fillMobilePhoneField(){
        phone_mobile.sendKeys("992345678");
    }
    @Step("Clica para enviar os dados e criar a conta")
    public void clickSubmitAccountBtn(){
        submitAccount.click();
    }

    public String getTextPageHeading(){
        return pageHeading.getText();
    }

    public String getTextPageSubHeading(){
        return pageSubHeading.getText();
    }

    public boolean isCreateAccountPage(){
        return getTextPageHeading().contains("CREATE AN ACCOUNT");
    }

    public String getCreateAccountPageHeadingName(){
        return accountPageHeadingName.getText();
    }


    public String getCreateAccountInfoAccount(){
        return accountInfoAccount.getText();
    }

    public boolean isAccountPage(){
        return getCreateAccountPageHeadingName().contains("MY ACCOUNT");
    }

    public boolean isMyAccountInfo(){
        return getCreateAccountInfoAccount().contains("Welcome to your account");
    }

    public void createAccount(){

        clickIdGender();
        fillCustomerFirstname();
        fillCustomerLastname();
        fillPasswd();
        fillAddressField();
        fillAddressComplement();
        fillCityName();
        selectStateName();
        fillZipCode();
        fillMobilePhoneField();
        clickSubmitAccountBtn();

    }


}
