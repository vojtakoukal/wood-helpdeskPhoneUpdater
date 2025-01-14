
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDirectoryUri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDirectoryUri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="isPrimary" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="uri" type="{http://www.cisco.com/AXL/API/11.5}String128"/&gt;
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="advertiseGloballyViaIls" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XDirectoryUri", propOrder = {
    "isPrimary",
    "uri",
    "partition",
    "advertiseGloballyViaIls"
})
public class XDirectoryUri {

    protected String isPrimary;
    @XmlElementRef(name = "uri", type = JAXBElement.class)
    protected JAXBElement<String> uri;
    @XmlElementRef(name = "partition", type = JAXBElement.class)
    protected JAXBElement<XFkType> partition;
    @XmlElement(defaultValue = "true")
    protected String advertiseGloballyViaIls;

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimary(String value) {
        this.isPrimary = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUri(JAXBElement<String> value) {
        this.uri = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPartition(JAXBElement<XFkType> value) {
        this.partition = value;
    }

    /**
     * Gets the value of the advertiseGloballyViaIls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiseGloballyViaIls() {
        return advertiseGloballyViaIls;
    }

    /**
     * Sets the value of the advertiseGloballyViaIls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiseGloballyViaIls(String value) {
        this.advertiseGloballyViaIls = value;
    }

}
