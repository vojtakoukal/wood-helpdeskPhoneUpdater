
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeEnrolledPatternGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeEnrolledPatternGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeEnrolledPatternGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeEnrolledPatternGroup"/&gt;
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
@XmlType(name = "GetImeEnrolledPatternGroupRes", propOrder = {
    "_return"
})
public class GetImeEnrolledPatternGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeEnrolledPatternGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeEnrolledPatternGroupRes.Return }
     *     
     */
    public GetImeEnrolledPatternGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeEnrolledPatternGroupRes.Return }
     *     
     */
    public void setReturn(GetImeEnrolledPatternGroupRes.Return value) {
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
     *         &lt;element name="imeEnrolledPatternGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeEnrolledPatternGroup"/&gt;
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
        "imeEnrolledPatternGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeEnrolledPatternGroup imeEnrolledPatternGroup;

        /**
         * Gets the value of the imeEnrolledPatternGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeEnrolledPatternGroup }
         *     
         */
        public RImeEnrolledPatternGroup getImeEnrolledPatternGroup() {
            return imeEnrolledPatternGroup;
        }

        /**
         * Sets the value of the imeEnrolledPatternGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeEnrolledPatternGroup }
         *     
         */
        public void setImeEnrolledPatternGroup(RImeEnrolledPatternGroup value) {
            this.imeEnrolledPatternGroup = value;
        }

    }

}
