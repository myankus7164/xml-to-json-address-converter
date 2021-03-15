package com.yankus;

import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomerSet customerSet;
        XmlJsonFileReaderAndConverter xmlFileReader = new XmlJsonFileReaderAndConverter();
        JSONObject jsonObject;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name in this directory to of the xml file to convert to json: ");
        jsonObject = xmlFileReader.readXmlAndConvertToJSon(scanner.nextLine());
        customerSet = new CustomerSet(jsonObject);
        HashSet<Customer> customers = customerSet.getCustomers();
        System.out.println("Converting json back to xml: ");
        System.out.println(xmlFileReader.readJsonAndConvertToXml(jsonObject));

    }
}
