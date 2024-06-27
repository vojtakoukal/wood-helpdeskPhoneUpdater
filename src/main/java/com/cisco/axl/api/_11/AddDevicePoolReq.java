
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDevicePoolReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDevicePoolReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/11.5}XDevicePool"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDevicePoolReq", propOrder = {
    "devicePool"
})
public class AddDevicePoolReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDevicePool devicePool;

    /**
     * Gets the value of the devicePool property.
     * 
     * @return
     *     possible object is
     *     {@link XDevicePool }
     *     
     */
    public XDevicePool getDevicePool() {
        return devicePool;
    }

    /**
     * Sets the value of the devicePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDevicePool }
     *     
     */
    public void setDevicePool(XDevicePool value) {
        this.devicePool = value;
    }

}
