package org.example.untitled.sites;

import org.example.untitled.settings.chromedriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yandex extends chromedriver {
    @FindBy(xpath = "//input[@id='text']")
    WebElement inputLocator; // поле ввода
    @FindBy(xpath = "//div[@class='search2__button']/button[@role='button']")
    WebElement searchButtonLocator; // кнопка Найти
    @FindBy(xpath = "(//a[@href='https://www.Roseltorg.ru/'])[1]")
    WebElement urlLocator;

    public yandex(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fieldSearch() { // Метод ввода информации в поисковой строке яндекса
        inputLocator.sendKeys("ЕЭТП");
        System.out.println("Ввели  ЕЭТП");
        searchButtonLocator.click();
        System.out.println("Клик на поиск");
        urlLocator.click();
        System.out.println("Переход по нужной ссылке");

    }

}

