
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSystemRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSystemRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ldapSystem" type="{http://www.cisco.com/AXL/API/11.5}XLdapSystem"/&gt;
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
@XmlType(name = "GetLdapSystemRes", propOrder = {
    "_return"
})
public class GetLdapSystemRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSystemRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSystemRes.Return }
     *     
     */
    public GetLdapSystemRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSystemRes.Return }
     *     
     */
    public void setReturn(GetLdapSystemRes.Return value) {
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
     *         &lt;element name="ldapSystem" type="{http://www.cisco.com/AXL/API/11.5}XLdapSystem"/&gt;
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
        "ldapSystem"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XLdapSystem ldapSystem;

        /**
         * Gets the value of the ldapSystem property.
         * 
         * @return
         *     possible object is
         *     {@link XLdapSystem }
         *     
         */
        public XLdapSystem getLdapSystem() {
            return ldapSystem;
        }

        /**
         * Sets the value of the ldapSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link XLdapSystem }
         *     
         */
        public void setLdapSystem(XLdapSystem value) {
            this.ldapSystem = value;
        }

    }

}
