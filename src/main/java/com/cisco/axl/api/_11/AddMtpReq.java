
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMtpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMtpReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mtp" type="{http://www.cisco.com/AXL/API/11.5}XMtp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMtpReq", propOrder = {
    "mtp"
})
public class AddMtpReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMtp mtp;

    /**
     * Gets the value of the mtp property.
     * 
     * @return
     *     possible object is
     *     {@link XMtp }
     *     
     */
    public XMtp getMtp() {
        return mtp;
    }

    /**
     * Sets the value of the mtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMtp }
     *     
     */
    public void setMtp(XMtp value) {
        this.mtp = value;
    }

}
