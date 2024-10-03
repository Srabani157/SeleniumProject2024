package com.inetbanking.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {


    public static void main(String[] args) throws IOException {

        //System.out.println(System.getProperty("user.dir"));
        FileReader fileReader = new FileReader("src/test/resources/config/config.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("browser"));
    }
}
