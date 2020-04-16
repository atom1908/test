package org.example.untitled;

import org.example.untitled.settings.chromedriver;
import org.example.untitled.sites.eetp;
import org.junit.Test;

public class MainPageTest extends chromedriver {
    eetp Eetp;
    @Test
    public void Test() throws Exception {
            Eetp = new eetp(driver);
            Eetp.Yandex().fieldSearch();
            Eetp.Rosseltorg().equalsTest();
            Eetp.Registracia().waitInfo();
        }

    }