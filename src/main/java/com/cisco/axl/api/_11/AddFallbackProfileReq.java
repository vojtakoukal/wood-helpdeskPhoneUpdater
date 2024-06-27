
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddFallbackProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFallbackProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fallbackProfile" type="{http://www.cisco.com/AXL/API/11.5}XFallbackProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFallbackProfileReq", propOrder = {
    "fallbackProfile"
})
public class AddFallbackProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFallbackProfile fallbackProfile;

    /**
     * Gets the value of the fallbackProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFallbackProfile }
     *     
     */
    public XFallbackProfile getFallbackProfile() {
        return fallbackProfile;
    }

    /**
     * Sets the value of the fallbackProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFallbackProfile }
     *     
     */
    public void setFallbackProfile(XFallbackProfile value) {
        this.fallbackProfile = value;
    }

}
