package org.example.untitled.sites;

import org.example.untitled.settings.chromedriver;
import org.openqa.selenium.WebDriver;

public class eetp extends chromedriver {
    WebDriver driver;

    public eetp(WebDriver driver) {
        this.driver = driver;
    }

    public yandex Yandex() {
        return new yandex(driver);
    }

    public rosseltorg Rosseltorg() {
        return new rosseltorg(driver);
    }

    public registracia Registracia() { return new registracia(driver); }
}
