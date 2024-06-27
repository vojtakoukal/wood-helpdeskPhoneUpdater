
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RLdapSyncCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RLdapSyncCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="ldapConfigurationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customUserField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ldapUserField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RLdapSyncCustomField", propOrder = {
    "ldapConfigurationName",
    "customUserField",
    "ldapUserField"
})
public class RLdapSyncCustomField {

    protected String ldapConfigurationName;
    protected String customUserField;
    protected String ldapUserField;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the ldapConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapConfigurationName() {
        return ldapConfigurationName;
    }

    /**
     * Sets the value of the ldapConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapConfigurationName(String value) {
        this.ldapConfigurationName = value;
    }

    /**
     * Gets the value of the customUserField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomUserField() {
        return customUserField;
    }

    /**
     * Sets the value of the customUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomUserField(String value) {
        this.customUserField = value;
    }

    /**
     * Gets the value of the ldapUserField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapUserField() {
        return ldapUserField;
    }

    /**
     * Sets the value of the ldapUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapUserField(String value) {
        this.ldapUserField = value;
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
