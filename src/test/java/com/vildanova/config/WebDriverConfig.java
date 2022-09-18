package com.vildanova.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${typeConnection}.properties"})

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("versionBrowser")
    @DefaultValue("100.0")
    String versionBrowser();

    @Key("remoteUrl")
    String remoteUrl();
}
