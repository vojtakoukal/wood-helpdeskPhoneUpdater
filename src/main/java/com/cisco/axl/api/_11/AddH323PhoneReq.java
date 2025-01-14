
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddH323PhoneReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddH323PhoneReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="h323Phone" type="{http://www.cisco.com/AXL/API/11.5}XH323Phone"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddH323PhoneReq", propOrder = {
    "h323Phone"
})
public class AddH323PhoneReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XH323Phone h323Phone;

    /**
     * Gets the value of the h323Phone property.
     * 
     * @return
     *     possible object is
     *     {@link XH323Phone }
     *     
     */
    public XH323Phone getH323Phone() {
        return h323Phone;
    }

    /**
     * Sets the value of the h323Phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XH323Phone }
     *     
     */
    public void setH323Phone(XH323Phone value) {
        this.h323Phone = value;
    }

}
