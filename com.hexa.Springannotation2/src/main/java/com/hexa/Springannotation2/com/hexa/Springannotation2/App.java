package com.hexa.Springannotation2.com.hexa.Springannotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext anno= new AnnotationConfigApplicationContext(ProductConfig.class);
         Product p1 = (Product) anno.getBean("prod1");
         Cart ces= p1.getCar();	 
         System.out.println(p1.toString());
         System.out.println(ces.toString());
        ((AbstractApplicationContext) anno).close();
    }
}
