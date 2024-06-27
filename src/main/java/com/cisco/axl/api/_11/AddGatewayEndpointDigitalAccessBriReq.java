
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayEndpointDigitalAccessBriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayEndpointDigitalAccessBriReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gatewayEndpointDigitalAccessBri" type="{http://www.cisco.com/AXL/API/11.5}XGatewayEndpointDigitalAccessBri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayEndpointDigitalAccessBriReq", propOrder = {
    "gatewayEndpointDigitalAccessBri"
})
public class AddGatewayEndpointDigitalAccessBriReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewayEndpointDigitalAccessBri gatewayEndpointDigitalAccessBri;

    /**
     * Gets the value of the gatewayEndpointDigitalAccessBri property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalAccessBri }
     *     
     */
    public XGatewayEndpointDigitalAccessBri getGatewayEndpointDigitalAccessBri() {
        return gatewayEndpointDigitalAccessBri;
    }

    /**
     * Sets the value of the gatewayEndpointDigitalAccessBri property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalAccessBri }
     *     
     */
    public void setGatewayEndpointDigitalAccessBri(XGatewayEndpointDigitalAccessBri value) {
        this.gatewayEndpointDigitalAccessBri = value;
    }

}
