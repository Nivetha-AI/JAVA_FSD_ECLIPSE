package com.hexa.Spring1.com.hexa.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     	Product p1=(Product) context.getBean("prod1");
     	Product p2=(Product) context.getBean("prod2");
     	Product p3=(Product) context.getBean("prod3");
     	
    	Cart c1=p1.getCar();
    	Cart c2=p2.getCar();
    	Cart c3=p3.getCar();
     	System.out.println(p1.toString());
     	System.out.println(c1.toString());
     	System.out.println(p2.toString());
     	System.out.println(c2.toString());
     	System.out.println(p3.toString());
     	System.out.println(c3.toString());
    }
}
