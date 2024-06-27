
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateIlsConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateIlsConfigReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activateIls" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="synchronizeClustersEvery" type="{http://www.cisco.com/AXL/API/11.5}String50"/&gt;
 *         &lt;element name="activatedServers" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deactivatedServers" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useTls" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="enableUsePassword" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="usePassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIlsConfigReq", propOrder = {
    "role",
    "registrationServer",
    "activateIls",
    "synchronizeClustersEvery",
    "activatedServers",
    "deactivatedServers",
    "useTls",
    "enableUsePassword",
    "usePassword"
})
public class UpdateIlsConfigReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String role;
    @XmlElement(required = true)
    protected String registrationServer;
    @XmlElement(required = true)
    protected String activateIls;
    @XmlElement(required = true)
    protected String synchronizeClustersEvery;
    @XmlElement(required = true)
    protected String activatedServers;
    @XmlElement(required = true)
    protected String deactivatedServers;
    @XmlElement(required = true)
    protected String useTls;
    @XmlElement(required = true)
    protected String enableUsePassword;
    @XmlElement(required = true)
    protected String usePassword;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the registrationServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationServer() {
        return registrationServer;
    }

    /**
     * Sets the value of the registrationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationServer(String value) {
        this.registrationServer = value;
    }

    /**
     * Gets the value of the activateIls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateIls() {
        return activateIls;
    }

    /**
     * Sets the value of the activateIls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateIls(String value) {
        this.activateIls = value;
    }

    /**
     * Gets the value of the synchronizeClustersEvery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchronizeClustersEvery() {
        return synchronizeClustersEvery;
    }

    /**
     * Sets the value of the synchronizeClustersEvery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchronizeClustersEvery(String value) {
        this.synchronizeClustersEvery = value;
    }

    /**
     * Gets the value of the activatedServers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivatedServers() {
        return activatedServers;
    }

    /**
     * Sets the value of the activatedServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedServers(String value) {
        this.activatedServers = value;
    }

    /**
     * Gets the value of the deactivatedServers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivatedServers() {
        return deactivatedServers;
    }

    /**
     * Sets the value of the deactivatedServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivatedServers(String value) {
        this.deactivatedServers = value;
    }

    /**
     * Gets the value of the useTls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTls() {
        return useTls;
    }

    /**
     * Sets the value of the useTls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTls(String value) {
        this.useTls = value;
    }

    /**
     * Gets the value of the enableUsePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableUsePassword() {
        return enableUsePassword;
    }

    /**
     * Sets the value of the enableUsePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableUsePassword(String value) {
        this.enableUsePassword = value;
    }

    /**
     * Gets the value of the usePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePassword() {
        return usePassword;
    }

    /**
     * Sets the value of the usePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePassword(String value) {
        this.usePassword = value;
    }

}
