package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */
import java.util.Scanner;

public class PrintQutoes
{
    public static void main( String[] args )
    {
        System.out.println( "What is the quote? " );

        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String speaker = input.nextLine();

        System.out.println(speaker+" says,"+"\"" +quote+ "\"");
    }
}
