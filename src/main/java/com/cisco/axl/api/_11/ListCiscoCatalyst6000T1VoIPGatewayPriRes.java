
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCiscoCatalyst6000T1VoIPGatewayPriRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCiscoCatalyst6000T1VoIPGatewayPriRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/11.5}LCiscoCatalyst6000T1VoIPGatewayPri" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ListCiscoCatalyst6000T1VoIPGatewayPriRes", propOrder = {
    "_return"
})
public class ListCiscoCatalyst6000T1VoIPGatewayPriRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCiscoCatalyst6000T1VoIPGatewayPriRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public ListCiscoCatalyst6000T1VoIPGatewayPriRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public void setReturn(ListCiscoCatalyst6000T1VoIPGatewayPriRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/11.5}LCiscoCatalyst6000T1VoIPGatewayPri" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ciscoCatalyst6000T1VoIPGatewayPri"
    })
    public static class Return {

        protected List<LCiscoCatalyst6000T1VoIPGatewayPri> ciscoCatalyst6000T1VoIPGatewayPri;

        /**
         * Gets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCiscoCatalyst6000T1VoIPGatewayPri().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCiscoCatalyst6000T1VoIPGatewayPri }
         * 
         * 
         */
        public List<LCiscoCatalyst6000T1VoIPGatewayPri> getCiscoCatalyst6000T1VoIPGatewayPri() {
            if (ciscoCatalyst6000T1VoIPGatewayPri == null) {
                ciscoCatalyst6000T1VoIPGatewayPri = new ArrayList<LCiscoCatalyst6000T1VoIPGatewayPri>();
            }
            return this.ciscoCatalyst6000T1VoIPGatewayPri;
        }

    }

}
