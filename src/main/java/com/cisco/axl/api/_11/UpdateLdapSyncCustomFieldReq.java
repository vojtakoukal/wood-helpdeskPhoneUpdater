
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLdapSyncCustomFieldReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLdapSyncCustomFieldReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ldapConfigurationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="customUserField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ldapUserField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLdapSyncCustomFieldReq", propOrder = {
    "uuid",
    "ldapConfigurationName",
    "customUserField",
    "ldapUserField"
})
public class UpdateLdapSyncCustomFieldReq
    extends APIRequest
{

    protected String uuid;
    protected String ldapConfigurationName;
    protected String customUserField;
    protected String ldapUserField;

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

}
