
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDeviceMobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDeviceMobility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subNet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subNetMaskSz" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
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
@XmlType(name = "LDeviceMobility", propOrder = {
    "name",
    "subNet",
    "subNetMaskSz"
})
public class LDeviceMobility {

    protected String name;
    protected String subNet;
    protected String subNetMaskSz;
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
     * Gets the value of the subNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNet() {
        return subNet;
    }

    /**
     * Sets the value of the subNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNet(String value) {
        this.subNet = value;
    }

    /**
     * Gets the value of the subNetMaskSz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNetMaskSz() {
        return subNetMaskSz;
    }

    /**
     * Sets the value of the subNetMaskSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNetMaskSz(String value) {
        this.subNetMaskSz = value;
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
