
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPhoneSecurityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPhoneSecurityProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="phoneType" type="{http://www.cisco.com/AXL/API/11.5}XModel" minOccurs="0"/&gt;
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/11.5}XDeviceProtocol" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceSecurityMode" type="{http://www.cisco.com/AXL/API/11.5}XDeviceSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/11.5}XAuthenticationMode" minOccurs="0"/&gt;
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/11.5}XKeySize" minOccurs="0"/&gt;
 *         &lt;element name="keyOrder" type="{http://www.cisco.com/AXL/API/11.5}XKeyOrder" minOccurs="0"/&gt;
 *         &lt;element name="ecKeySize" type="{http://www.cisco.com/AXL/API/11.5}XECKeySize" minOccurs="0"/&gt;
 *         &lt;element name="tftpEncryptedConfig" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nonceValidityTime" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="transportType" type="{http://www.cisco.com/AXL/API/11.5}XTransport" minOccurs="0"/&gt;
 *         &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="enableDigestAuthentication" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="excludeDigestCredentials" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "RPhoneSecurityProfile", propOrder = {
    "phoneType",
    "protocol",
    "name",
    "description",
    "deviceSecurityMode",
    "authenticationMode",
    "keySize",
    "keyOrder",
    "ecKeySize",
    "tftpEncryptedConfig",
    "nonceValidityTime",
    "transportType",
    "sipPhonePort",
    "enableDigestAuthentication",
    "excludeDigestCredentials"
})
public class RPhoneSecurityProfile {

    protected String phoneType;
    protected String protocol;
    protected String name;
    protected String description;
    protected String deviceSecurityMode;
    protected String authenticationMode;
    protected String keySize;
    protected String keyOrder;
    protected String ecKeySize;
    protected String tftpEncryptedConfig;
    protected String nonceValidityTime;
    protected String transportType;
    protected String sipPhonePort;
    protected String enableDigestAuthentication;
    protected String excludeDigestCredentials;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

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
     * Gets the value of the deviceSecurityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSecurityMode() {
        return deviceSecurityMode;
    }

    /**
     * Sets the value of the deviceSecurityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSecurityMode(String value) {
        this.deviceSecurityMode = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the keyOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyOrder() {
        return keyOrder;
    }

    /**
     * Sets the value of the keyOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyOrder(String value) {
        this.keyOrder = value;
    }

    /**
     * Gets the value of the ecKeySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcKeySize() {
        return ecKeySize;
    }

    /**
     * Sets the value of the ecKeySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcKeySize(String value) {
        this.ecKeySize = value;
    }

    /**
     * Gets the value of the tftpEncryptedConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTftpEncryptedConfig() {
        return tftpEncryptedConfig;
    }

    /**
     * Sets the value of the tftpEncryptedConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTftpEncryptedConfig(String value) {
        this.tftpEncryptedConfig = value;
    }

    /**
     * Gets the value of the nonceValidityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonceValidityTime() {
        return nonceValidityTime;
    }

    /**
     * Sets the value of the nonceValidityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonceValidityTime(String value) {
        this.nonceValidityTime = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the sipPhonePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipPhonePort() {
        return sipPhonePort;
    }

    /**
     * Sets the value of the sipPhonePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipPhonePort(String value) {
        this.sipPhonePort = value;
    }

    /**
     * Gets the value of the enableDigestAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDigestAuthentication() {
        return enableDigestAuthentication;
    }

    /**
     * Sets the value of the enableDigestAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDigestAuthentication(String value) {
        this.enableDigestAuthentication = value;
    }

    /**
     * Gets the value of the excludeDigestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeDigestCredentials() {
        return excludeDigestCredentials;
    }

    /**
     * Sets the value of the excludeDigestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeDigestCredentials(String value) {
        this.excludeDigestCredentials = value;
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
