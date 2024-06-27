
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Retrieves mobility configuration information.
 * 
 * <p>Java class for GetMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobilityReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="handoffNumber" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *           &lt;element name="DTMFNumber" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/11.5}RMobility" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobilityReq", propOrder = {
    "handoffNumber",
    "dtmfNumber",
    "returnedTags"
})
public class GetMobilityReq {

    protected XFkType handoffNumber;
    @XmlElement(name = "DTMFNumber")
    protected XFkType dtmfNumber;
    protected RMobility returnedTags;

    /**
     * Gets the value of the handoffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHandoffNumber() {
        return handoffNumber;
    }

    /**
     * Sets the value of the handoffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHandoffNumber(XFkType value) {
        this.handoffNumber = value;
    }

    /**
     * Gets the value of the dtmfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDTMFNumber() {
        return dtmfNumber;
    }

    /**
     * Sets the value of the dtmfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDTMFNumber(XFkType value) {
        this.dtmfNumber = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RMobility }
     *     
     */
    public RMobility getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMobility }
     *     
     */
    public void setReturnedTags(RMobility value) {
        this.returnedTags = value;
    }

}
