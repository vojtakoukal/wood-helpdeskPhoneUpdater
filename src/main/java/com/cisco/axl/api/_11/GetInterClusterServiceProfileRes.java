
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInterClusterServiceProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInterClusterServiceProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="interClusterServiceProfile" type="{http://www.cisco.com/AXL/API/11.5}RInterClusterServiceProfile"/&gt;
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
@XmlType(name = "GetInterClusterServiceProfileRes", propOrder = {
    "_return"
})
public class GetInterClusterServiceProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetInterClusterServiceProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetInterClusterServiceProfileRes.Return }
     *     
     */
    public GetInterClusterServiceProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInterClusterServiceProfileRes.Return }
     *     
     */
    public void setReturn(GetInterClusterServiceProfileRes.Return value) {
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
     *         &lt;element name="interClusterServiceProfile" type="{http://www.cisco.com/AXL/API/11.5}RInterClusterServiceProfile"/&gt;
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
        "interClusterServiceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RInterClusterServiceProfile interClusterServiceProfile;

        /**
         * Gets the value of the interClusterServiceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RInterClusterServiceProfile }
         *     
         */
        public RInterClusterServiceProfile getInterClusterServiceProfile() {
            return interClusterServiceProfile;
        }

        /**
         * Sets the value of the interClusterServiceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RInterClusterServiceProfile }
         *     
         */
        public void setInterClusterServiceProfile(RInterClusterServiceProfile value) {
            this.interClusterServiceProfile = value;
        }

    }

}
