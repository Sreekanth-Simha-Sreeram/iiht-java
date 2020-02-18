package com.stock.hibernet.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.hibernet.service.AdminService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Stock!" );
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
        AdminService adminservice = (AdminService) context.getBean("adminService");
       
    }
}
