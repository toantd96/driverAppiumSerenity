package utils;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;

public class EnvironmentConfig {
    public static EnvironmentVariables env;

    public static final String URL = EnvironmentSpecificConfiguration.from(env)
            .getProperty("url");
    public static final String APP_PATH = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.app");
    public static final String DEVICE_NAME = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.deviceName");
    public static final String APP_PACKAGE = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.appPackage");
    public static final String APP_ACTIVITY = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.appActivity");
    public static final String PLATFORM_NAME = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.platformName");
    public static final String AUTOMATION_NAME = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.platformName");
    public static final String URL_APPIUM = EnvironmentSpecificConfiguration.from(env)
            .getProperty("android.url");
}
