
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddH323TrunkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddH323TrunkReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="h323Trunk" type="{http://www.cisco.com/AXL/API/11.5}XH323Trunk"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddH323TrunkReq", propOrder = {
    "h323Trunk"
})
public class AddH323TrunkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XH323Trunk h323Trunk;

    /**
     * Gets the value of the h323Trunk property.
     * 
     * @return
     *     possible object is
     *     {@link XH323Trunk }
     *     
     */
    public XH323Trunk getH323Trunk() {
        return h323Trunk;
    }

    /**
     * Sets the value of the h323Trunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XH323Trunk }
     *     
     */
    public void setH323Trunk(XH323Trunk value) {
        this.h323Trunk = value;
    }

}
