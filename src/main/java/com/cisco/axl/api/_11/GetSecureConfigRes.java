
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSecureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSecureConfigRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="secureConfig" type="{http://www.cisco.com/AXL/API/11.5}RSecureConfig"/&gt;
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
@XmlType(name = "GetSecureConfigRes", propOrder = {
    "_return"
})
public class GetSecureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSecureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSecureConfigRes.Return }
     *     
     */
    public GetSecureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSecureConfigRes.Return }
     *     
     */
    public void setReturn(GetSecureConfigRes.Return value) {
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
     *         &lt;element name="secureConfig" type="{http://www.cisco.com/AXL/API/11.5}RSecureConfig"/&gt;
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
        "secureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSecureConfig secureConfig;

        /**
         * Gets the value of the secureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RSecureConfig }
         *     
         */
        public RSecureConfig getSecureConfig() {
            return secureConfig;
        }

        /**
         * Sets the value of the secureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSecureConfig }
         *     
         */
        public void setSecureConfig(RSecureConfig value) {
            this.secureConfig = value;
        }

    }

}
