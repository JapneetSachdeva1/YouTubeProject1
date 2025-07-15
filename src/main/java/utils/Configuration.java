package utils;

public class Configuration
{
    public static String browserName = System.getProperty("browser", "chrome");
    public static String platform = System.getProperty("platform", "local");
}
