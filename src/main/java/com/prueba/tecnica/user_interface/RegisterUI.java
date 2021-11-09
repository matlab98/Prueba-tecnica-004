package com.prueba.tecnica.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterUI {

    public static final Target JOIN_TODAY = Target.the("Join Today")
            .locatedBy("//ul/li/a[@class='unauthenticated-nav-bar__sign-up']");

    public static final Target FIRST_NAME = Target.the("First Name")
            .locatedBy("#firstName");

    public static final Target LAST_NAME = Target.the("Last Name")
            .locatedBy("#lastName");

    public static final Target EMAIL = Target.the("EMAIL")
            .locatedBy("#email");

    public static final Target FECHA_ANIO = Target.the("Year")
            .locatedBy("#birthYear");

    public static final Target FECHA_MES = Target.the("Month")
            .locatedBy("#birthMonth");

    public static final Target FECHA_DIA = Target.the("Day")
            .locatedBy("#birthDay");

    public static final Target BOTON_CALENDARIO_SALIDA = Target.the("el botón para seleccionar la fecha de salida")
            .locatedBy("//*[@id='vuelos']/form/div[3]/div[4]/div[1]/div[1]/div/div/span/button");

    public static final Target FECHA_DE_SALIDA = Target.the("la fecha de salida")
            .locatedBy("//td[contains(@data-month, '{0}')]//a[.='{1}']");

    public static final Target BOTON_CONSULTA = Target.the("el botón de consulta de vuelos")
            .locatedBy("//input[@value='Buscar vuelos']");






    @FindBy(how = How.XPATH, using = "//div/a[@class='btn btn-blue']")
    private WebElement btnNext1;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//input[@id='zip']")
    private WebElement txtCode;

    @FindBy(how = How.XPATH, using = "//div[@name='countryId']")
    private WebElement txtCountry;

    @FindBy(how = How.XPATH, using = "//div/a[@class='btn btn-blue pull-right']")
    private WebElement btnNext2;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select Brand']")
    private WebElement txtBrand;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select a Model']")
    private WebElement txtModel;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select OS']")
    private WebElement txtOs;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select a Version']")
    private WebElement txtVersion;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select OS language']")
    private WebElement btnOsLanguage;

    @FindBy(how = How.XPATH, using = "//div/a[@aria-label='Next - final step']")
    private WebElement btnNext3;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
    private WebElement txtConfirmPass;

    @FindBy(how = How.XPATH, using = "//span[@class='checkmark signup-consent__checkbox error']")
    private WebElement checkConsent;

    @FindBy(how = How.XPATH, using = "//div/a[@aria-label='Complete Setup']")
    private WebElement btnNext4;

}


