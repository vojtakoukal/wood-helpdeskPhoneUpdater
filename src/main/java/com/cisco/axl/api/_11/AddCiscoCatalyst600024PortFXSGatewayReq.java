
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCiscoCatalyst600024PortFXSGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCiscoCatalyst600024PortFXSGatewayReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ciscoCatalyst600024PortFXSGateway" type="{http://www.cisco.com/AXL/API/11.5}XCiscoCatalyst600024PortFXSGateway"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCiscoCatalyst600024PortFXSGatewayReq", propOrder = {
    "ciscoCatalyst600024PortFXSGateway"
})
public class AddCiscoCatalyst600024PortFXSGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCiscoCatalyst600024PortFXSGateway ciscoCatalyst600024PortFXSGateway;

    /**
     * Gets the value of the ciscoCatalyst600024PortFXSGateway property.
     * 
     * @return
     *     possible object is
     *     {@link XCiscoCatalyst600024PortFXSGateway }
     *     
     */
    public XCiscoCatalyst600024PortFXSGateway getCiscoCatalyst600024PortFXSGateway() {
        return ciscoCatalyst600024PortFXSGateway;
    }

    /**
     * Sets the value of the ciscoCatalyst600024PortFXSGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst600024PortFXSGateway }
     *     
     */
    public void setCiscoCatalyst600024PortFXSGateway(XCiscoCatalyst600024PortFXSGateway value) {
        this.ciscoCatalyst600024PortFXSGateway = value;
    }

}
