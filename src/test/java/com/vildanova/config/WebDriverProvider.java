package com.vildanova.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

import static java.lang.String.format;

public class WebDriverProvider {

    public final static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void webConfiguration() {
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.versionBrowser();

        if (System.getProperty("typeConnection").equals("remote")) {
            Configuration.remote = webConfig.remoteUrl();
        }
    }
}
