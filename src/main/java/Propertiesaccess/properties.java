package Propertiesaccess;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;



public class properties {



public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub



Properties prop=new Properties();

FileInputStream fis =new FileInputStream("C:\\Users\\Codes Orbit\\eclipse-workspace\\MySeleniumCourcePractice\\src\\main\\java\\data.properties");

prop.load(fis);

System.out.println(prop.getProperty("browser"));

System.out.println(prop.getProperty("url"));

prop.setProperty("browser", "firefox");

System.out.println(prop.getProperty("browser"));

FileOutputStream fos =new FileOutputStream("C:\\Users\\Codes Orbit\\eclipse-workspace\\MySeleniumCourcePractice\\src\\main\\java\\data.properties");

prop.store(fos, null);

}



}

