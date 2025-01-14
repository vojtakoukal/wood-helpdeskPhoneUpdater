
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XWifiHotspot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XWifiHotspot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}UniqueString50"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="ssidPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userModifiable" type="{http://www.cisco.com/AXL/API/11.5}XWLANProfileChanges" minOccurs="0"/&gt;
 *         &lt;element name="frequencyBand" type="{http://www.cisco.com/AXL/API/11.5}XWiFiFrequency"/&gt;
 *         &lt;element name="authenticationMethod" type="{http://www.cisco.com/AXL/API/11.5}XHotspotAuthenticationMethod"/&gt;
 *         &lt;element name="hostName" type="{http://www.cisco.com/AXL/API/11.5}String64" minOccurs="0"/&gt;
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="sharedSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pskPassPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wepKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passwordDescription" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XWifiHotspot", propOrder = {
    "name",
    "description",
    "ssidPrefix",
    "userModifiable",
    "frequencyBand",
    "authenticationMethod",
    "hostName",
    "port",
    "sharedSecret",
    "pskPassPhrase",
    "wepKey",
    "passwordDescription"
})
public class XWifiHotspot {

    protected String name;
    protected String description;
    protected String ssidPrefix;
    @XmlElement(defaultValue = "Allowed")
    protected String userModifiable;
    @XmlElement(defaultValue = "Auto")
    protected String frequencyBand;
    @XmlElement(defaultValue = "None")
    protected String authenticationMethod;
    protected String hostName;
    @XmlElement(defaultValue = "1812")
    protected String port;
    @XmlElementRef(name = "sharedSecret", type = JAXBElement.class)
    protected JAXBElement<String> sharedSecret;
    @XmlElementRef(name = "pskPassPhrase", type = JAXBElement.class)
    protected JAXBElement<String> pskPassPhrase;
    @XmlElementRef(name = "wepKey", type = JAXBElement.class)
    protected JAXBElement<String> wepKey;
    protected String passwordDescription;

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
     * Gets the value of the ssidPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsidPrefix() {
        return ssidPrefix;
    }

    /**
     * Sets the value of the ssidPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsidPrefix(String value) {
        this.ssidPrefix = value;
    }

    /**
     * Gets the value of the userModifiable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserModifiable() {
        return userModifiable;
    }

    /**
     * Sets the value of the userModifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserModifiable(String value) {
        this.userModifiable = value;
    }

    /**
     * Gets the value of the frequencyBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyBand() {
        return frequencyBand;
    }

    /**
     * Sets the value of the frequencyBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyBand(String value) {
        this.frequencyBand = value;
    }

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the sharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSharedSecret() {
        return sharedSecret;
    }

    /**
     * Sets the value of the sharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSharedSecret(JAXBElement<String> value) {
        this.sharedSecret = value;
    }

    /**
     * Gets the value of the pskPassPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPskPassPhrase() {
        return pskPassPhrase;
    }

    /**
     * Sets the value of the pskPassPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPskPassPhrase(JAXBElement<String> value) {
        this.pskPassPhrase = value;
    }

    /**
     * Gets the value of the wepKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWepKey() {
        return wepKey;
    }

    /**
     * Sets the value of the wepKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWepKey(JAXBElement<String> value) {
        this.wepKey = value;
    }

    /**
     * Gets the value of the passwordDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordDescription() {
        return passwordDescription;
    }

    /**
     * Sets the value of the passwordDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordDescription(String value) {
        this.passwordDescription = value;
    }

}
