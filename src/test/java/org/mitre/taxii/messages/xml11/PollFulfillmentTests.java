package org.mitre.taxii.messages.xml11;

import java.io.IOException;
import java.math.BigInteger;
import javax.xml.bind.JAXBException;
import org.junit.Test;
import org.xml.sax.SAXException;

/**
 *
 * @author jasenj1
 */
public class PollFulfillmentTests {
    private final ObjectFactory factory = new ObjectFactory();
    private final TaxiiXmlFactory txf = new TaxiiXmlFactory();
    private final TaxiiXml taxiiXml;
    
    public PollFulfillmentTests() {
       taxiiXml = txf.createTaxiiXml();
    }

    @Test
    public void pollFulfillment1() throws JAXBException, SAXException, IOException {
        PollFulfillment pf = factory.createPollFulfillment()
                                .withMessageId("pf1")
                                .withCollectionName("1-800-collection")
                                .withResultId("123")
                                .withResultPartNumber(BigInteger.ONE);
        
        TestUtil.roundTripMessage(taxiiXml, pf);                                        
    }
}
