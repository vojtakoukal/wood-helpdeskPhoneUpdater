
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeE164TransformationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeE164TransformationRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeE164Transformation" type="{http://www.cisco.com/AXL/API/11.5}RImeE164Transformation"/&gt;
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
@XmlType(name = "GetImeE164TransformationRes", propOrder = {
    "_return"
})
public class GetImeE164TransformationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeE164TransformationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeE164TransformationRes.Return }
     *     
     */
    public GetImeE164TransformationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeE164TransformationRes.Return }
     *     
     */
    public void setReturn(GetImeE164TransformationRes.Return value) {
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
     *         &lt;element name="imeE164Transformation" type="{http://www.cisco.com/AXL/API/11.5}RImeE164Transformation"/&gt;
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
        "imeE164Transformation"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeE164Transformation imeE164Transformation;

        /**
         * Gets the value of the imeE164Transformation property.
         * 
         * @return
         *     possible object is
         *     {@link RImeE164Transformation }
         *     
         */
        public RImeE164Transformation getImeE164Transformation() {
            return imeE164Transformation;
        }

        /**
         * Sets the value of the imeE164Transformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeE164Transformation }
         *     
         */
        public void setImeE164Transformation(RImeE164Transformation value) {
            this.imeE164Transformation = value;
        }

    }

}
