
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSafForwarderReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSafForwarderReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="safForwarder" type="{http://www.cisco.com/AXL/API/11.5}XSafForwarder"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSafForwarderReq", propOrder = {
    "safForwarder"
})
public class AddSafForwarderReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSafForwarder safForwarder;

    /**
     * Gets the value of the safForwarder property.
     * 
     * @return
     *     possible object is
     *     {@link XSafForwarder }
     *     
     */
    public XSafForwarder getSafForwarder() {
        return safForwarder;
    }

    /**
     * Sets the value of the safForwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafForwarder }
     *     
     */
    public void setSafForwarder(XSafForwarder value) {
        this.safForwarder = value;
    }

}
