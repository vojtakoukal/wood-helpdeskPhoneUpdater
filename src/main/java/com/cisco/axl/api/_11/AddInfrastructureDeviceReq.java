
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddInfrastructureDeviceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddInfrastructureDeviceReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}XInfrastructureDevice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddInfrastructureDeviceReq", propOrder = {
    "infrastructureDevice"
})
public class AddInfrastructureDeviceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XInfrastructureDevice infrastructureDevice;

    /**
     * Gets the value of the infrastructureDevice property.
     * 
     * @return
     *     possible object is
     *     {@link XInfrastructureDevice }
     *     
     */
    public XInfrastructureDevice getInfrastructureDevice() {
        return infrastructureDevice;
    }

    /**
     * Sets the value of the infrastructureDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XInfrastructureDevice }
     *     
     */
    public void setInfrastructureDevice(XInfrastructureDevice value) {
        this.infrastructureDevice = value;
    }

}
