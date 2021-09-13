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
        // Gets quote from user
        System.out.println( "What is the quote? " );

        //scans user input and labels it as a quote
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine(); // moves to next line

        // Gets the speaker of the quote from the user
        System.out.print("Who said it? ");
        String speaker = input.nextLine();

        // Outputs the quote with the speaker attached
        System.out.println(speaker+" says,"+"\"" +quote+ "\"");
    }
}
