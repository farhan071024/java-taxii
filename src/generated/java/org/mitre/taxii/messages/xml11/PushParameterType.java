
package org.mitre.taxii.messages.xml11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Parameters describing how Data Collection content is to be pushed to a Consumer's Inbox Service.
 * 
 * <p>Java class for PushParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PushParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Protocol_Binding" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message_Binding" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushParameterType", propOrder = {
    "protocolBinding",
    "address",
    "messageBinding"
})
public class PushParameterType {

    @XmlElement(name = "Protocol_Binding", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String protocolBinding;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Message_Binding", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String messageBinding;

    /**
     * Gets the value of the protocolBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolBinding() {
        return protocolBinding;
    }

    /**
     * Sets the value of the protocolBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolBinding(String value) {
        this.protocolBinding = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the messageBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageBinding() {
        return messageBinding;
    }

    /**
     * Sets the value of the messageBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageBinding(String value) {
        this.messageBinding = value;
    }

}