
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMobilityReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobility" type="{http://www.cisco.com/AXL/API/11.5}XMobility"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMobilityReq", propOrder = {
    "mobility"
})
public class AddMobilityReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMobility mobility;

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link XMobility }
     *     
     */
    public XMobility getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMobility }
     *     
     */
    public void setMobility(XMobility value) {
        this.mobility = value;
    }

}
