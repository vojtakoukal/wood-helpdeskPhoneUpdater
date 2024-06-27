
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeviceMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeviceMobilityReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceMobility" type="{http://www.cisco.com/AXL/API/11.5}XDeviceMobility"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeviceMobilityReq", propOrder = {
    "deviceMobility"
})
public class AddDeviceMobilityReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDeviceMobility deviceMobility;

    /**
     * Gets the value of the deviceMobility property.
     * 
     * @return
     *     possible object is
     *     {@link XDeviceMobility }
     *     
     */
    public XDeviceMobility getDeviceMobility() {
        return deviceMobility;
    }

    /**
     * Sets the value of the deviceMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeviceMobility }
     *     
     */
    public void setDeviceMobility(XDeviceMobility value) {
        this.deviceMobility = value;
    }

}
