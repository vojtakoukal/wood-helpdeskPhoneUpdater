
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPMIB2ListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPMIB2ListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sysContact" type="{http://www.cisco.com/AXL/API/11.5}String32"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSNMPMIB2ListReq", propOrder = {
    "sysContact"
})
public class GetSNMPMIB2ListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String sysContact;

    /**
     * Gets the value of the sysContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysContact() {
        return sysContact;
    }

    /**
     * Sets the value of the sysContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysContact(String value) {
        this.sysContact = value;
    }

}
