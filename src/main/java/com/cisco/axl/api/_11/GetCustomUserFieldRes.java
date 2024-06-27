
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomUserFieldRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomUserFieldRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/11.5}RCustomUserField"/&gt;
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
@XmlType(name = "GetCustomUserFieldRes", propOrder = {
    "_return"
})
public class GetCustomUserFieldRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCustomUserFieldRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomUserFieldRes.Return }
     *     
     */
    public GetCustomUserFieldRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomUserFieldRes.Return }
     *     
     */
    public void setReturn(GetCustomUserFieldRes.Return value) {
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
     *         &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/11.5}RCustomUserField"/&gt;
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
        "customUserField"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCustomUserField customUserField;

        /**
         * Gets the value of the customUserField property.
         * 
         * @return
         *     possible object is
         *     {@link RCustomUserField }
         *     
         */
        public RCustomUserField getCustomUserField() {
            return customUserField;
        }

        /**
         * Sets the value of the customUserField property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCustomUserField }
         *     
         */
        public void setCustomUserField(RCustomUserField value) {
            this.customUserField = value;
        }

    }

}
