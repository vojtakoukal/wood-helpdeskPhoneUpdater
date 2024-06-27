
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LUserProfileProvision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LUserProfileProvision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="allowProvision" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="limitProvision" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="defaultUserProfile" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
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
@XmlType(name = "LUserProfileProvision", propOrder = {
    "name",
    "description",
    "allowProvision",
    "limitProvision",
    "defaultUserProfile"
})
public class LUserProfileProvision {

    protected String name;
    protected String description;
    protected String allowProvision;
    protected String limitProvision;
    protected XFkType defaultUserProfile;
    @XmlAttribute(name = "uuid")
    protected String uuid;

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
     * Gets the value of the allowProvision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowProvision() {
        return allowProvision;
    }

    /**
     * Sets the value of the allowProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowProvision(String value) {
        this.allowProvision = value;
    }

    /**
     * Gets the value of the limitProvision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitProvision() {
        return limitProvision;
    }

    /**
     * Sets the value of the limitProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitProvision(String value) {
        this.limitProvision = value;
    }

    /**
     * Gets the value of the defaultUserProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultUserProfile() {
        return defaultUserProfile;
    }

    /**
     * Sets the value of the defaultUserProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultUserProfile(XFkType value) {
        this.defaultUserProfile = value;
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
