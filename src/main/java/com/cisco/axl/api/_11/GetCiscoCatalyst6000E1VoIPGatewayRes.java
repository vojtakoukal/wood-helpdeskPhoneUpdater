
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCiscoCatalyst6000E1VoIPGatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCiscoCatalyst6000E1VoIPGatewayRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ciscoCatalyst6000E1VoIPGateway" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst6000E1VoIPGateway"/&gt;
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
@XmlType(name = "GetCiscoCatalyst6000E1VoIPGatewayRes", propOrder = {
    "_return"
})
public class GetCiscoCatalyst6000E1VoIPGatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCiscoCatalyst6000E1VoIPGatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCiscoCatalyst6000E1VoIPGatewayRes.Return }
     *     
     */
    public GetCiscoCatalyst6000E1VoIPGatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCiscoCatalyst6000E1VoIPGatewayRes.Return }
     *     
     */
    public void setReturn(GetCiscoCatalyst6000E1VoIPGatewayRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000E1VoIPGateway" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst6000E1VoIPGateway"/&gt;
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
        "ciscoCatalyst6000E1VoIPGateway"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCiscoCatalyst6000E1VoIPGateway ciscoCatalyst6000E1VoIPGateway;

        /**
         * Gets the value of the ciscoCatalyst6000E1VoIPGateway property.
         * 
         * @return
         *     possible object is
         *     {@link RCiscoCatalyst6000E1VoIPGateway }
         *     
         */
        public RCiscoCatalyst6000E1VoIPGateway getCiscoCatalyst6000E1VoIPGateway() {
            return ciscoCatalyst6000E1VoIPGateway;
        }

        /**
         * Sets the value of the ciscoCatalyst6000E1VoIPGateway property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCiscoCatalyst6000E1VoIPGateway }
         *     
         */
        public void setCiscoCatalyst6000E1VoIPGateway(RCiscoCatalyst6000E1VoIPGateway value) {
            this.ciscoCatalyst6000E1VoIPGateway = value;
        }

    }

}
