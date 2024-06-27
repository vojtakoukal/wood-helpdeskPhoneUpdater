
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSrstReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSrstReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srst" type="{http://www.cisco.com/AXL/API/11.5}XSrst"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSrstReq", propOrder = {
    "srst"
})
public class AddSrstReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSrst srst;

    /**
     * Gets the value of the srst property.
     * 
     * @return
     *     possible object is
     *     {@link XSrst }
     *     
     */
    public XSrst getSrst() {
        return srst;
    }

    /**
     * Sets the value of the srst property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSrst }
     *     
     */
    public void setSrst(XSrst value) {
        this.srst = value;
    }

}
