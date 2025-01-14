
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RProcessNodeService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RProcessNodeService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/11.5}XService" minOccurs="0"/&gt;
 *         &lt;element name="traceLevel" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="userCategories" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="enable" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numFiles" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxFileSize" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "RProcessNodeService", propOrder = {
    "processNodeName",
    "service",
    "traceLevel",
    "userCategories",
    "enable",
    "numFiles",
    "maxFileSize",
    "isActive"
})
public class RProcessNodeService {

    protected XFkType processNodeName;
    protected String service;
    protected String traceLevel;
    protected String userCategories;
    protected String enable;
    protected String numFiles;
    protected String maxFileSize;
    protected String isActive;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the traceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceLevel() {
        return traceLevel;
    }

    /**
     * Sets the value of the traceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceLevel(String value) {
        this.traceLevel = value;
    }

    /**
     * Gets the value of the userCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCategories() {
        return userCategories;
    }

    /**
     * Sets the value of the userCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCategories(String value) {
        this.userCategories = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnable(String value) {
        this.enable = value;
    }

    /**
     * Gets the value of the numFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFiles() {
        return numFiles;
    }

    /**
     * Sets the value of the numFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFiles(String value) {
        this.numFiles = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFileSize(String value) {
        this.maxFileSize = value;
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
