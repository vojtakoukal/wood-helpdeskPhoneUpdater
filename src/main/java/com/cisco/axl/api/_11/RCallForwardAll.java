
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCallForwardAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCallForwardAll"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="forwardToVoiceMail" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="secondaryCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCallForwardAll", propOrder = {
    "forwardToVoiceMail",
    "callingSearchSpaceName",
    "secondaryCallingSearchSpaceName",
    "destination"
})
public class RCallForwardAll {

    protected String forwardToVoiceMail;
    protected XFkType callingSearchSpaceName;
    protected XFkType secondaryCallingSearchSpaceName;
    protected String destination;

    /**
     * Gets the value of the forwardToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardToVoiceMail() {
        return forwardToVoiceMail;
    }

    /**
     * Sets the value of the forwardToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardToVoiceMail(String value) {
        this.forwardToVoiceMail = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpaceName(XFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the secondaryCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecondaryCallingSearchSpaceName() {
        return secondaryCallingSearchSpaceName;
    }

    /**
     * Sets the value of the secondaryCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecondaryCallingSearchSpaceName(XFkType value) {
        this.secondaryCallingSearchSpaceName = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
