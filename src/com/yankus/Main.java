package com.yankus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        XmlToJsonConverter xmlToJsonConverter = new XmlToJsonConverter();
        Scanner scanner = new Scanner();
        System.out.println("Enter the file name in this directory to of the xml file to convert to json: ");
        //read in the file
        //convert the file
        xmlToJsonConverter.convert();
    }
}
