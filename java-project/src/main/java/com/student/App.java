package com.student;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter your name:");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        reader.close();
        System.out.println(String.format("Hello, %s!", name));
    }
}
