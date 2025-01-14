
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLdapSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLdapSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="syncEnabled" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ldapServer" type="{http://www.cisco.com/AXL/API/11.5}XLdapServer" minOccurs="0"/&gt;
 *         &lt;element name="userIdAttribute" type="{http://www.cisco.com/AXL/API/11.5}String64" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLdapSystem", propOrder = {
    "syncEnabled",
    "ldapServer",
    "userIdAttribute"
})
public class XLdapSystem {

    protected String syncEnabled;
    @XmlElementRef(name = "ldapServer", type = JAXBElement.class)
    protected JAXBElement<String> ldapServer;
    protected String userIdAttribute;

    /**
     * Gets the value of the syncEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncEnabled() {
        return syncEnabled;
    }

    /**
     * Sets the value of the syncEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncEnabled(String value) {
        this.syncEnabled = value;
    }

    /**
     * Gets the value of the ldapServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLdapServer() {
        return ldapServer;
    }

    /**
     * Sets the value of the ldapServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLdapServer(JAXBElement<String> value) {
        this.ldapServer = value;
    }

    /**
     * Gets the value of the userIdAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdAttribute() {
        return userIdAttribute;
    }

    /**
     * Sets the value of the userIdAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdAttribute(String value) {
        this.userIdAttribute = value;
    }

}
