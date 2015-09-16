package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("/demo/src/main/java/com/demo/beans/beans.xml");
    	Person person = (Person) context.getBean("person");
        person.speak();
    }
}
