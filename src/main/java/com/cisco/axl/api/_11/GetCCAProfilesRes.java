
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCCAProfilesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCCAProfilesRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cCAProfiles" type="{http://www.cisco.com/AXL/API/11.5}RCCAProfiles"/&gt;
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
@XmlType(name = "GetCCAProfilesRes", propOrder = {
    "_return"
})
public class GetCCAProfilesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCCAProfilesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCCAProfilesRes.Return }
     *     
     */
    public GetCCAProfilesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCCAProfilesRes.Return }
     *     
     */
    public void setReturn(GetCCAProfilesRes.Return value) {
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
     *         &lt;element name="cCAProfiles" type="{http://www.cisco.com/AXL/API/11.5}RCCAProfiles"/&gt;
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
        "ccaProfiles"
    })
    public static class Return {

        @XmlElement(name = "cCAProfiles", required = true)
        protected RCCAProfiles ccaProfiles;

        /**
         * Gets the value of the ccaProfiles property.
         * 
         * @return
         *     possible object is
         *     {@link RCCAProfiles }
         *     
         */
        public RCCAProfiles getCCAProfiles() {
            return ccaProfiles;
        }

        /**
         * Sets the value of the ccaProfiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCCAProfiles }
         *     
         */
        public void setCCAProfiles(RCCAProfiles value) {
            this.ccaProfiles = value;
        }

    }

}
