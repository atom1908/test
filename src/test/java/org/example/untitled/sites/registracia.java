package org.example.untitled.sites;

import org.example.untitled.settings.chromedriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registracia extends chromedriver {
        @FindBy(css = "[method] .x-panel:nth-of-type(1) .x-panel:nth-of-type(1) b")
        WebElement infoTabLocator; //Информационное окно
        String text = "Внимание! С 1 января 2019 регистрация поставщиков для участия в закупках по 44-ФЗ, " +
                "МСП и ПП РФ №615,  производится в Едином Реестре Участников Закупок. " +
                "Данная форма регистрации поставщиков предназначена только для участия в коммерческих закупках, " +
                "регистрации иностранных поставщиков, а также для регистрации заявителей для участия в торгах по продаже и аренде имущества.";

        public registracia(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void waitInfo() {
            try {
                infoTabLocator.getText().equals(text);
                System.out.println("Текст присутствует");
                System.out.println(infoTabLocator.getText());
            } catch (Exception e) {
                System.out.println("Текст отсутствует");
            }

        }

    }
