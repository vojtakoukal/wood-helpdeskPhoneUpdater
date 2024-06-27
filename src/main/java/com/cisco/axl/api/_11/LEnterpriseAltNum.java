
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LEnterpriseAltNum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LEnterpriseAltNum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="numberMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addToLocalRoutePartition" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LEnterpriseAltNum", propOrder = {
    "numberMask",
    "addToLocalRoutePartition",
    "routePartition",
    "isUrgent",
    "advertiseGloballyIls"
})
public class LEnterpriseAltNum {

    protected String numberMask;
    protected String addToLocalRoutePartition;
    protected XFkType routePartition;
    protected String isUrgent;
    protected String advertiseGloballyIls;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the numberMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMask() {
        return numberMask;
    }

    /**
     * Sets the value of the numberMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMask(String value) {
        this.numberMask = value;
    }

    /**
     * Gets the value of the addToLocalRoutePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToLocalRoutePartition() {
        return addToLocalRoutePartition;
    }

    /**
     * Sets the value of the addToLocalRoutePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToLocalRoutePartition(String value) {
        this.addToLocalRoutePartition = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoutePartition(XFkType value) {
        this.routePartition = value;
    }

    /**
     * Gets the value of the isUrgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUrgent() {
        return isUrgent;
    }

    /**
     * Sets the value of the isUrgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUrgent(String value) {
        this.isUrgent = value;
    }

    /**
     * Gets the value of the advertiseGloballyIls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiseGloballyIls() {
        return advertiseGloballyIls;
    }

    /**
     * Sets the value of the advertiseGloballyIls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiseGloballyIls(String value) {
        this.advertiseGloballyIls = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
