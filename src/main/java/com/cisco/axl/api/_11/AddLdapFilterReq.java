
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLdapFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLdapFilterReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/11.5}XLdapFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLdapFilterReq", propOrder = {
    "ldapFilter"
})
public class AddLdapFilterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLdapFilter ldapFilter;

    /**
     * Gets the value of the ldapFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapFilter }
     *     
     */
    public XLdapFilter getLdapFilter() {
        return ldapFilter;
    }

    /**
     * Sets the value of the ldapFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapFilter }
     *     
     */
    public void setLdapFilter(XLdapFilter value) {
        this.ldapFilter = value;
    }

}
