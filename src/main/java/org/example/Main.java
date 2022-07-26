package org.example;

import org.example.parser.XML;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Main
{
    private static final String INPUT_FOLDER = "src/main/java/org/example/group.xml";
    private static final String DATA_FOLDER2 = "src/main/java/org/example/group2.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        if (XML.validate(INPUT_FOLDER)) {
            System.out.println("Validate success");
            XML.parseXML(INPUT_FOLDER, DATA_FOLDER2);
        }else {
            System.out.println("Can't Validate");
        }
    }
}
