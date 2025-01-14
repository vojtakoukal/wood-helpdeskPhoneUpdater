
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AXLError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AXLError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axlcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="axlmessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AXLError", propOrder = {
    "axlcode",
    "axlmessage",
    "request"
})
public class AXLError {

    protected int axlcode;
    @XmlElement(required = true)
    protected String axlmessage;
    @XmlElement(required = true)
    protected String request;

    /**
     * Gets the value of the axlcode property.
     * 
     */
    public int getAxlcode() {
        return axlcode;
    }

    /**
     * Sets the value of the axlcode property.
     * 
     */
    public void setAxlcode(int value) {
        this.axlcode = value;
    }

    /**
     * Gets the value of the axlmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxlmessage() {
        return axlmessage;
    }

    /**
     * Sets the value of the axlmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxlmessage(String value) {
        this.axlmessage = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

}
