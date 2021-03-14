package com.yankus;

import org.json.JSONObject;
import org.w3c.dom.Document;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //XmlToJsonConverter xmlToJsonConverter = new XmlToJsonConverter();
        JsonFileWriter jsonFileWriter = new JsonFileWriter();
        CustomerSet customerSet = new CustomerSet();
        XmlFileReaderAndConverter xmlFileReader = new XmlFileReaderAndConverter();
        JSONObject xmlDocument;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name in this directory to of the xml file to convert to json: ");
        //read in the file
        //convert the file
        //xmlDocument = xmlFileReader.readFile(scanner.nextLine());
        xmlDocument = xmlFileReader.readFile("CustomerData.xml");
        System.out.println(xmlDocument.toString());

        jsonFileWriter.write();


    }
}
