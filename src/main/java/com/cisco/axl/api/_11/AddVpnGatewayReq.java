
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVpnGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVpnGatewayReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vpnGateway" type="{http://www.cisco.com/AXL/API/11.5}XVpnGateway"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVpnGatewayReq", propOrder = {
    "vpnGateway"
})
public class AddVpnGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVpnGateway vpnGateway;

    /**
     * Gets the value of the vpnGateway property.
     * 
     * @return
     *     possible object is
     *     {@link XVpnGateway }
     *     
     */
    public XVpnGateway getVpnGateway() {
        return vpnGateway;
    }

    /**
     * Sets the value of the vpnGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVpnGateway }
     *     
     */
    public void setVpnGateway(XVpnGateway value) {
        this.vpnGateway = value;
    }

}
