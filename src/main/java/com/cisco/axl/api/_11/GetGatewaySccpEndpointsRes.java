
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewaySccpEndpointsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewaySccpEndpointsRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gatewaySccpEndpoints" type="{http://www.cisco.com/AXL/API/11.5}RGatewaySccpEndpoints"/&gt;
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
@XmlType(name = "GetGatewaySccpEndpointsRes", propOrder = {
    "_return"
})
public class GetGatewaySccpEndpointsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewaySccpEndpointsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewaySccpEndpointsRes.Return }
     *     
     */
    public GetGatewaySccpEndpointsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewaySccpEndpointsRes.Return }
     *     
     */
    public void setReturn(GetGatewaySccpEndpointsRes.Return value) {
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
     *         &lt;element name="gatewaySccpEndpoints" type="{http://www.cisco.com/AXL/API/11.5}RGatewaySccpEndpoints"/&gt;
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
        "gatewaySccpEndpoints"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewaySccpEndpoints gatewaySccpEndpoints;

        /**
         * Gets the value of the gatewaySccpEndpoints property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewaySccpEndpoints }
         *     
         */
        public RGatewaySccpEndpoints getGatewaySccpEndpoints() {
            return gatewaySccpEndpoints;
        }

        /**
         * Sets the value of the gatewaySccpEndpoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewaySccpEndpoints }
         *     
         */
        public void setGatewaySccpEndpoints(RGatewaySccpEndpoints value) {
            this.gatewaySccpEndpoints = value;
        }

    }

}
