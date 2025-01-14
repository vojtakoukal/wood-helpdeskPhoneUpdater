
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSNMPUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSNMPUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authRequired" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="authPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="privacyRequired" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="privacyPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="privacyProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accessPrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrayOfHosts" type="{http://www.cisco.com/AXL/API/11.5}RArrayOfHosts"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSNMPUser", propOrder = {
    "userName",
    "authRequired",
    "authPassword",
    "authProtocol",
    "privacyRequired",
    "privacyPassword",
    "privacyProtocol",
    "accessPrivilege",
    "arrayOfHosts"
})
public class RSNMPUser {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String authRequired;
    @XmlElement(required = true)
    protected String authPassword;
    @XmlElement(required = true)
    protected String authProtocol;
    @XmlElement(required = true)
    protected String privacyRequired;
    @XmlElement(required = true)
    protected String privacyPassword;
    @XmlElement(required = true)
    protected String privacyProtocol;
    @XmlElement(required = true)
    protected String accessPrivilege;
    @XmlElement(name = "ArrayOfHosts", required = true)
    protected RArrayOfHosts arrayOfHosts;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the authRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequired() {
        return authRequired;
    }

    /**
     * Sets the value of the authRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequired(String value) {
        this.authRequired = value;
    }

    /**
     * Gets the value of the authPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPassword() {
        return authPassword;
    }

    /**
     * Sets the value of the authPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPassword(String value) {
        this.authPassword = value;
    }

    /**
     * Gets the value of the authProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthProtocol() {
        return authProtocol;
    }

    /**
     * Sets the value of the authProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthProtocol(String value) {
        this.authProtocol = value;
    }

    /**
     * Gets the value of the privacyRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyRequired() {
        return privacyRequired;
    }

    /**
     * Sets the value of the privacyRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyRequired(String value) {
        this.privacyRequired = value;
    }

    /**
     * Gets the value of the privacyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyPassword() {
        return privacyPassword;
    }

    /**
     * Sets the value of the privacyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyPassword(String value) {
        this.privacyPassword = value;
    }

    /**
     * Gets the value of the privacyProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyProtocol() {
        return privacyProtocol;
    }

    /**
     * Sets the value of the privacyProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyProtocol(String value) {
        this.privacyProtocol = value;
    }

    /**
     * Gets the value of the accessPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPrivilege() {
        return accessPrivilege;
    }

    /**
     * Sets the value of the accessPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPrivilege(String value) {
        this.accessPrivilege = value;
    }

    /**
     * Gets the value of the arrayOfHosts property.
     * 
     * @return
     *     possible object is
     *     {@link RArrayOfHosts }
     *     
     */
    public RArrayOfHosts getArrayOfHosts() {
        return arrayOfHosts;
    }

    /**
     * Sets the value of the arrayOfHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RArrayOfHosts }
     *     
     */
    public void setArrayOfHosts(RArrayOfHosts value) {
        this.arrayOfHosts = value;
    }

}
