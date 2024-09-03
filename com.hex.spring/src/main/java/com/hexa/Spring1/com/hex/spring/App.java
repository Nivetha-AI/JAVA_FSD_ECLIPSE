package com.hexa.Spring1.com.hex.spring;

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
    	// by using property
//    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    	Student s1=(Student) context.getBean("Stud1");
//    	Student s2=(Student) context.getBean("Stud2");
//    	Student s3=(Student) context.getBean("Stud3");
//    	Student s4=(Student) context.getBean("Stud4");
//    	
//    	
//    	Result res=s1.getRes();
//    	Result res1=s2.getRes();
//    	Result res2=s3.getRes();
//    	Result res3=s4.getRes();
//    	System.out.println( s1.toString() );
//    	System.out.println( res.toString() );
//    	System.out.println( s2.toString() );
//    	System.out.println( res1.toString() );
//    	System.out.println( s3.toString() );
//    	System.out.println( res2.toString() );
//    	System.out.println( s4.toString() );
//    	System.out.println( res3.toString() );
    // by using constructor
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     	Book b1=(Book) context.getBean("book1");
    	Book b2=(Book) context.getBean("book2");
     	System.out.println(b1.toString());
     	System.out.println(b2.toString());
    }
}
