import com.sun.xml.internal.ws.util.StringUtils;
import com.yankus.XmlJsonFileReaderAndConverter;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class XmlJsonFileReaderAndConverterTest {
    private XmlJsonFileReaderAndConverter xmlJsonFileReaderAndConverter;
    private JSONObject testJsonObject;
    private String testJsonString = "{\"CompanyName\":\"Maison Dewey\",\"Email\":\"dummy@gmail.com\",\"Address\":\"Rue Joseph-Bens 532\",\"Phone\":\"(02) 201 24 67\",\"PostalCode\":\"B-1180\",\"Country\":\"Belgium\",\"CustomerID\":\"MAISD\",\"City\":\"Bruxelles\",\"Fax\":\"(02) 201 24 68\",\"ContactName\":\"Catherine Dewey\",\"ContactTitle\":\"Sales Agent\"}\n";
    private String expectedXmlString = "<CompanyName>Maison Dewey</CompanyName><Email>dummy@gmail.com</Email><Address>Rue Joseph-Bens 532</Address><Phone>(02) 201 24 67</Phone><PostalCode>B-1180</PostalCode><Country>Belgium</Country><CustomerID>MAISD</CustomerID><City>Bruxelles</City><Fax>(02) 201 24 68</Fax><ContactName>Catherine Dewey</ContactName><ContactTitle>Sales Agent</ContactTitle>\n";
    @Before
    public void setUp() throws Exception {
        xmlJsonFileReaderAndConverter = new XmlJsonFileReaderAndConverter();
        testJsonObject = new JSONObject(testJsonString);
    }

    @Test
    public void readJsonAndConvertToXmlTest() {
        String xmlConverted = xmlJsonFileReaderAndConverter.readJsonAndConvertToXml(testJsonObject);
        assertEquals( xmlConverted.trim(),expectedXmlString.trim());
    }
}
