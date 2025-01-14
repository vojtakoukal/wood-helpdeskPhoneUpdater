
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHuntForwardInfoBusy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHuntForwardInfoBusy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="maxHuntduration" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHuntForwardInfoBusy", propOrder = {
    "usePersonalPreferences",
    "callingSearchSpaceName",
    "destination",
    "maxHuntduration"
})
public class RHuntForwardInfoBusy {

    protected String usePersonalPreferences;
    protected XFkType callingSearchSpaceName;
    protected String destination;
    protected String maxHuntduration;

    /**
     * Gets the value of the usePersonalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePersonalPreferences() {
        return usePersonalPreferences;
    }

    /**
     * Sets the value of the usePersonalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePersonalPreferences(String value) {
        this.usePersonalPreferences = value;
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

    /**
     * Gets the value of the maxHuntduration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHuntduration() {
        return maxHuntduration;
    }

    /**
     * Sets the value of the maxHuntduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHuntduration(String value) {
        this.maxHuntduration = value;
    }

}
