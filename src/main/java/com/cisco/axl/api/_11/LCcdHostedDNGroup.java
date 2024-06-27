
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCcdHostedDNGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCcdHostedDNGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="pstnFailoverStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="pstnFailoverPrependDigits" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="usePstnFailover" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "LCcdHostedDNGroup", propOrder = {
    "name",
    "description",
    "pstnFailoverStripDigits",
    "pstnFailoverPrependDigits",
    "usePstnFailover"
})
public class LCcdHostedDNGroup {

    protected String name;
    protected String description;
    protected String pstnFailoverStripDigits;
    protected String pstnFailoverPrependDigits;
    protected String usePstnFailover;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pstnFailoverStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailoverStripDigits() {
        return pstnFailoverStripDigits;
    }

    /**
     * Sets the value of the pstnFailoverStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailoverStripDigits(String value) {
        this.pstnFailoverStripDigits = value;
    }

    /**
     * Gets the value of the pstnFailoverPrependDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailoverPrependDigits() {
        return pstnFailoverPrependDigits;
    }

    /**
     * Sets the value of the pstnFailoverPrependDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailoverPrependDigits(String value) {
        this.pstnFailoverPrependDigits = value;
    }

    /**
     * Gets the value of the usePstnFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePstnFailover() {
        return usePstnFailover;
    }

    /**
     * Sets the value of the usePstnFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePstnFailover(String value) {
        this.usePstnFailover = value;
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
