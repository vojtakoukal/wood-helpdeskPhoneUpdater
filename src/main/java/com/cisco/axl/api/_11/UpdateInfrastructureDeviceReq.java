
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInfrastructureDeviceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInfrastructureDeviceReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipv4Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bssidWithMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wapLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInfrastructureDeviceReq", propOrder = {
    "uuid",
    "newName",
    "ipv4Address",
    "ipv6Address",
    "bssidWithMask",
    "wapLocation",
    "isActive"
})
public class UpdateInfrastructureDeviceReq
    extends APIRequest
{

    protected String uuid;
    protected String newName;
    protected String ipv4Address;
    @XmlElementRef(name = "ipv6Address", type = JAXBElement.class)
    protected JAXBElement<String> ipv6Address;
    @XmlElementRef(name = "bssidWithMask", type = JAXBElement.class)
    protected JAXBElement<String> bssidWithMask;
    @XmlElementRef(name = "wapLocation", type = JAXBElement.class)
    protected JAXBElement<String> wapLocation;
    @XmlElement(defaultValue = "true")
    protected String isActive;

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

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the ipv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /**
     * Sets the value of the ipv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv4Address(String value) {
        this.ipv4Address = value;
    }

    /**
     * Gets the value of the ipv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpv6Address() {
        return ipv6Address;
    }

    /**
     * Sets the value of the ipv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpv6Address(JAXBElement<String> value) {
        this.ipv6Address = value;
    }

    /**
     * Gets the value of the bssidWithMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBssidWithMask() {
        return bssidWithMask;
    }

    /**
     * Sets the value of the bssidWithMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBssidWithMask(JAXBElement<String> value) {
        this.bssidWithMask = value;
    }

    /**
     * Gets the value of the wapLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWapLocation() {
        return wapLocation;
    }

    /**
     * Sets the value of the wapLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWapLocation(JAXBElement<String> value) {
        this.wapLocation = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

}
