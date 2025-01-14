
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVg224Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVg224Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vg224" type="{http://www.cisco.com/AXL/API/11.5}XVg224"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVg224Req", propOrder = {
    "vg224"
})
public class AddVg224Req
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVg224 vg224;

    /**
     * Gets the value of the vg224 property.
     * 
     * @return
     *     possible object is
     *     {@link XVg224 }
     *     
     */
    public XVg224 getVg224() {
        return vg224;
    }

    /**
     * Sets the value of the vg224 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVg224 }
     *     
     */
    public void setVg224(XVg224 value) {
        this.vg224 = value;
    }

}
