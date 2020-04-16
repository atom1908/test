package org.example.untitled.sites;

import org.example.untitled.settings.chromedriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class rosseltorg extends chromedriver {
    @FindBy(xpath = "//div[@class='header__auth auth-menu']/button[text()='Регистрация']")
    WebElement registration; // Локатор кнопки Регистрация
    @FindBy(xpath = "//div[@class='auth-window__select-pane']/a/p[text()='Поставщик']")
    WebElement post_button; // Локатор кнопки поставщик
    @FindBy(xpath = "//a[@href='https://etp.roseltorg.ru/authentication/register']")
    WebElement fz223; // Локатор (на форме регистрации ) Единая аккредитация для участия

    public rosseltorg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkTabs() { //Переключаемся в новую вкладку
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        assertAdvertisingBlog();
    }

    private void assertAdvertisingBlog() {
        assertEquals("Единая электронная торговая площадка (Росэлторг, АО ЕЭТП), национальный оператор электронных торгов", driver.getTitle());
    }

    public void openRegistration() {
        System.out.println(driver.getTitle());
        try {
            registration.click();
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
    }

    public void getSupplier() { // Перешли в раздел Поставщик
        post_button.click();
    }

    public void akkredClick() { fz223.click();
    }

    public void equalsTest() {
        checkTabs();
        System.out.println("Переход на новую вкладку");
        openRegistration();
        System.out.println("Переход в раздел Регистрация");
        getSupplier();
        System.out.println("Переход в раздел Поставщик");
        akkredClick();
        System.out.println("Выбор регистрации в качестве Единая аккредитация для участия в корпоративных закупках и закупках субъектов 223-ФЗ");
    }

}
