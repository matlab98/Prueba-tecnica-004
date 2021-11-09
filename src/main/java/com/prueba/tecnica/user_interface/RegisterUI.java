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

    public static final Target BOTON_SIGUIENTE_1 = Target.the("Next")
            .locatedBy("//div/a[@class='btn btn-blue']");

    public static final Target CIUDAD = Target.the("City")
            .locatedBy("//input[@id='city']");

    public static final Target ZIP = Target.the("Zip")
            .locatedBy("//input[@id='zip']");

    public static final Target PAIS = Target.the("Country")
            .locatedBy("//div[@name='countryId']");

    public static final Target BOTON_SIGUIENTE_2 = Target.the("Next")
            .locatedBy("//div/a[@class='btn btn-blue pull-right']");

    public static final Target ELEGIR_BRAND = Target.the("Select Brand")
            .locatedBy("//div/div[@placeholder='Select Brand']");

    public static final Target MODEL = Target.the("Select a Model")
            .locatedBy("//div/div[@placeholder='Select a Model']");

    public static final Target ELEGIR_OS = Target.the("Select OS")
            .locatedBy("//div/div[@placeholder='Select OS']");

    public static final Target VERSION = Target.the("Select a Version")
            .locatedBy("//div/div[@placeholder='Select a Version']");

    public static final Target OS_LENGUAJE = Target.the("Select OS language")
            .locatedBy("//div/div[@placeholder='Select OS language']");

    public static final Target BOTON_SIGUIENTE_3 = Target.the("Next")
            .locatedBy("//div/a[@aria-label='Next - final step']");

    public static final Target CLAVE = Target.the("Password")
            .locatedBy("//input[@name='password']");

    public static final Target CLAVE_VALIDAR = Target.the("Confirm assword")
            .locatedBy("//input[@name='confirmPassword']");

    public static final Target OK_CONSENT = Target.the("checkmark signup-consent__checkbox error")
            .locatedBy("//span[@class='checkmark signup-consent__checkbox error']");

    public static final Target BOTON_FINAL = Target.the("Complete Setup")
            .locatedBy("//div/a[@aria-label='Complete Setup']");

}


