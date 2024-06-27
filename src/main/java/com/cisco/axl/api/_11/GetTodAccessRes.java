
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTodAccessRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTodAccessRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="todAccess" type="{http://www.cisco.com/AXL/API/11.5}RTodAccess"/&gt;
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
@XmlType(name = "GetTodAccessRes", propOrder = {
    "_return"
})
public class GetTodAccessRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTodAccessRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTodAccessRes.Return }
     *     
     */
    public GetTodAccessRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTodAccessRes.Return }
     *     
     */
    public void setReturn(GetTodAccessRes.Return value) {
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
     *         &lt;element name="todAccess" type="{http://www.cisco.com/AXL/API/11.5}RTodAccess"/&gt;
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
        "todAccess"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTodAccess todAccess;

        /**
         * Gets the value of the todAccess property.
         * 
         * @return
         *     possible object is
         *     {@link RTodAccess }
         *     
         */
        public RTodAccess getTodAccess() {
            return todAccess;
        }

        /**
         * Sets the value of the todAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTodAccess }
         *     
         */
        public void setTodAccess(RTodAccess value) {
            this.todAccess = value;
        }

    }

}