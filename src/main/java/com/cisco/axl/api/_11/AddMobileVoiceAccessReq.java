
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMobileVoiceAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMobileVoiceAccessReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobileVoiceAccess" type="{http://www.cisco.com/AXL/API/11.5}XMobileVoiceAccess"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMobileVoiceAccessReq", propOrder = {
    "mobileVoiceAccess"
})
public class AddMobileVoiceAccessReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMobileVoiceAccess mobileVoiceAccess;

    /**
     * Gets the value of the mobileVoiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XMobileVoiceAccess }
     *     
     */
    public XMobileVoiceAccess getMobileVoiceAccess() {
        return mobileVoiceAccess;
    }

    /**
     * Sets the value of the mobileVoiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMobileVoiceAccess }
     *     
     */
    public void setMobileVoiceAccess(XMobileVoiceAccess value) {
        this.mobileVoiceAccess = value;
    }

}
