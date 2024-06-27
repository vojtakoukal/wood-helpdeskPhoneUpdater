
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeviceMobilityGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeviceMobilityGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceMobilityGroup" type="{http://www.cisco.com/AXL/API/11.5}XDeviceMobilityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeviceMobilityGroupReq", propOrder = {
    "deviceMobilityGroup"
})
public class AddDeviceMobilityGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDeviceMobilityGroup deviceMobilityGroup;

    /**
     * Gets the value of the deviceMobilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XDeviceMobilityGroup }
     *     
     */
    public XDeviceMobilityGroup getDeviceMobilityGroup() {
        return deviceMobilityGroup;
    }

    /**
     * Sets the value of the deviceMobilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeviceMobilityGroup }
     *     
     */
    public void setDeviceMobilityGroup(XDeviceMobilityGroup value) {
        this.deviceMobilityGroup = value;
    }

}
