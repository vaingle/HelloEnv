package com.uthinkurbetterthanme.helloenv;
import java.io.InputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        try {
            String environmentFile = System.getProperty("environment.file", "default.properties");
            InputStream is = App.class.getClassLoader().getResourceAsStream(environmentFile);
            Properties props = new Properties();
            props.load(is);

            System.out.println("Hello from " + props.getProperty("environment"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
