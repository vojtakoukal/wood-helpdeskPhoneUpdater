
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVpnProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateVpnProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoNetworkDetection" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mtu" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="failToConnect" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="clientAuthentication" type="{http://www.cisco.com/AXL/API/11.5}XVPNClientAuthentication" minOccurs="0"/&gt;
 *         &lt;element name="pwdPersistant" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableHostIdCheck" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVpnProfileReq", propOrder = {
    "newName",
    "description",
    "autoNetworkDetection",
    "mtu",
    "failToConnect",
    "clientAuthentication",
    "pwdPersistant",
    "enableHostIdCheck"
})
public class UpdateVpnProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String autoNetworkDetection;
    @XmlElement(defaultValue = "1290")
    protected String mtu;
    @XmlElement(defaultValue = "30")
    protected String failToConnect;
    @XmlElement(defaultValue = "User and Password")
    protected String clientAuthentication;
    protected String pwdPersistant;
    protected String enableHostIdCheck;

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
     * Gets the value of the autoNetworkDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoNetworkDetection() {
        return autoNetworkDetection;
    }

    /**
     * Sets the value of the autoNetworkDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoNetworkDetection(String value) {
        this.autoNetworkDetection = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtu(String value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the failToConnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailToConnect() {
        return failToConnect;
    }

    /**
     * Sets the value of the failToConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailToConnect(String value) {
        this.failToConnect = value;
    }

    /**
     * Gets the value of the clientAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * Sets the value of the clientAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAuthentication(String value) {
        this.clientAuthentication = value;
    }

    /**
     * Gets the value of the pwdPersistant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwdPersistant() {
        return pwdPersistant;
    }

    /**
     * Sets the value of the pwdPersistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdPersistant(String value) {
        this.pwdPersistant = value;
    }

    /**
     * Gets the value of the enableHostIdCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableHostIdCheck() {
        return enableHostIdCheck;
    }

    /**
     * Sets the value of the enableHostIdCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableHostIdCheck(String value) {
        this.enableHostIdCheck = value;
    }

}
