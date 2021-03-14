package com.yankus;

import org.json.JSONObject;
import org.json.XML;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class XmlFileReaderAndConverter {

    public JSONObject readFile(String fileName) {

        StringBuilder stringBuilder = new StringBuilder("");

        try (Stream<String> stream = Files.lines( Paths.get(fileName), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> stringBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

            JSONObject jsondata = XML.toJSONObject(stringBuilder.toString());

        return jsondata;

    }
}
