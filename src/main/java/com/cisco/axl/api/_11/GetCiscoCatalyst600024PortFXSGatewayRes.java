
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCiscoCatalyst600024PortFXSGatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCiscoCatalyst600024PortFXSGatewayRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ciscoCatalyst600024PortFXSGateway" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst600024PortFXSGateway"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCiscoCatalyst600024PortFXSGatewayRes", propOrder = {
    "_return"
})
public class GetCiscoCatalyst600024PortFXSGatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCiscoCatalyst600024PortFXSGatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCiscoCatalyst600024PortFXSGatewayRes.Return }
     *     
     */
    public GetCiscoCatalyst600024PortFXSGatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCiscoCatalyst600024PortFXSGatewayRes.Return }
     *     
     */
    public void setReturn(GetCiscoCatalyst600024PortFXSGatewayRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ciscoCatalyst600024PortFXSGateway" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst600024PortFXSGateway"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ciscoCatalyst600024PortFXSGateway"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCiscoCatalyst600024PortFXSGateway ciscoCatalyst600024PortFXSGateway;

        /**
         * Gets the value of the ciscoCatalyst600024PortFXSGateway property.
         * 
         * @return
         *     possible object is
         *     {@link RCiscoCatalyst600024PortFXSGateway }
         *     
         */
        public RCiscoCatalyst600024PortFXSGateway getCiscoCatalyst600024PortFXSGateway() {
            return ciscoCatalyst600024PortFXSGateway;
        }

        /**
         * Sets the value of the ciscoCatalyst600024PortFXSGateway property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCiscoCatalyst600024PortFXSGateway }
         *     
         */
        public void setCiscoCatalyst600024PortFXSGateway(RCiscoCatalyst600024PortFXSGateway value) {
            this.ciscoCatalyst600024PortFXSGateway = value;
        }

    }

}
