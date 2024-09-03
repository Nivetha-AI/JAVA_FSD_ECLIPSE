package com.hexa.Springannotation.com.hexa.Springannotation;

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
        ApplicationContext anno= new AnnotationConfigApplicationContext(StudentConfig.class);
        Student s1 = (Student) anno.getBean("stud1");
        Result res1= s1.getRes();
        System.out.println(s1.toString());
        System.out.println(res1.toString());
        
        Student s2 = (Student) anno.getBean("stud2");
        ////Result res2= s2.getRes();
        System.out.println(s2.toString());
        //System.out.println(res2.toString());
        
        ((AbstractApplicationContext) anno).close();
    }
}
