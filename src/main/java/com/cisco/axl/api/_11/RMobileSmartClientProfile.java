
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMobileSmartClientProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMobileSmartClientProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileSmartClient" type="{http://www.cisco.com/AXL/API/11.5}XMobileSmartClient" minOccurs="0"/&gt;
 *         &lt;element name="enableSnrUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enableCFAUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handOffUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RMobileSmartClientProfile", propOrder = {
    "name",
    "mobileSmartClient",
    "enableSnrUri",
    "enableCFAUri",
    "handOffUri"
})
public class RMobileSmartClientProfile {

    protected String name;
    protected String mobileSmartClient;
    protected String enableSnrUri;
    protected String enableCFAUri;
    protected String handOffUri;
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
     * Gets the value of the mobileSmartClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileSmartClient() {
        return mobileSmartClient;
    }

    /**
     * Sets the value of the mobileSmartClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileSmartClient(String value) {
        this.mobileSmartClient = value;
    }

    /**
     * Gets the value of the enableSnrUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSnrUri() {
        return enableSnrUri;
    }

    /**
     * Sets the value of the enableSnrUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSnrUri(String value) {
        this.enableSnrUri = value;
    }

    /**
     * Gets the value of the enableCFAUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCFAUri() {
        return enableCFAUri;
    }

    /**
     * Sets the value of the enableCFAUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCFAUri(String value) {
        this.enableCFAUri = value;
    }

    /**
     * Gets the value of the handOffUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOffUri() {
        return handOffUri;
    }

    /**
     * Sets the value of the handOffUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOffUri(String value) {
        this.handOffUri = value;
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
