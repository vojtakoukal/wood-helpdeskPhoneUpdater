
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCredentialPolicyDefault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCredentialPolicyDefault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="credentialUser" type="{http://www.cisco.com/AXL/API/11.5}XCredentialUser" minOccurs="0"/&gt;
 *         &lt;element name="credentialType" type="{http://www.cisco.com/AXL/API/11.5}XCredential" minOccurs="0"/&gt;
 *         &lt;element name="credPolicyName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="credentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credUserCantChange" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="credUserMustChange" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="credDoesNotExpire" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCredentialPolicyDefault", propOrder = {
    "credentialUser",
    "credentialType",
    "credPolicyName",
    "credentials",
    "confirmCredentials",
    "credUserCantChange",
    "credUserMustChange",
    "credDoesNotExpire"
})
public class XCredentialPolicyDefault {

    protected String credentialUser;
    protected String credentialType;
    protected XFkType credPolicyName;
    @XmlElementRef(name = "credentials", type = JAXBElement.class)
    protected JAXBElement<String> credentials;
    protected String confirmCredentials;
    @XmlElement(defaultValue = "false")
    protected String credUserCantChange;
    @XmlElement(defaultValue = "true")
    protected String credUserMustChange;
    @XmlElement(defaultValue = "false")
    protected String credDoesNotExpire;

    /**
     * Gets the value of the credentialUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialUser() {
        return credentialUser;
    }

    /**
     * Sets the value of the credentialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialUser(String value) {
        this.credentialUser = value;
    }

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialType(String value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the credPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCredPolicyName() {
        return credPolicyName;
    }

    /**
     * Sets the value of the credPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCredPolicyName(XFkType value) {
        this.credPolicyName = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentials(JAXBElement<String> value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the confirmCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmCredentials() {
        return confirmCredentials;
    }

    /**
     * Sets the value of the confirmCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmCredentials(String value) {
        this.confirmCredentials = value;
    }

    /**
     * Gets the value of the credUserCantChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredUserCantChange() {
        return credUserCantChange;
    }

    /**
     * Sets the value of the credUserCantChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredUserCantChange(String value) {
        this.credUserCantChange = value;
    }

    /**
     * Gets the value of the credUserMustChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredUserMustChange() {
        return credUserMustChange;
    }

    /**
     * Sets the value of the credUserMustChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredUserMustChange(String value) {
        this.credUserMustChange = value;
    }

    /**
     * Gets the value of the credDoesNotExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredDoesNotExpire() {
        return credDoesNotExpire;
    }

    /**
     * Sets the value of the credDoesNotExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredDoesNotExpire(String value) {
        this.credDoesNotExpire = value;
    }

}
