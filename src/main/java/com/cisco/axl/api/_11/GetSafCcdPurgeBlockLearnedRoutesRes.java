
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSafCcdPurgeBlockLearnedRoutesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSafCcdPurgeBlockLearnedRoutesRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="safCcdPurgeBlockLearnedRoutes" type="{http://www.cisco.com/AXL/API/11.5}RSafCcdPurgeBlockLearnedRoutes"/&gt;
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
@XmlType(name = "GetSafCcdPurgeBlockLearnedRoutesRes", propOrder = {
    "_return"
})
public class GetSafCcdPurgeBlockLearnedRoutesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSafCcdPurgeBlockLearnedRoutesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSafCcdPurgeBlockLearnedRoutesRes.Return }
     *     
     */
    public GetSafCcdPurgeBlockLearnedRoutesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSafCcdPurgeBlockLearnedRoutesRes.Return }
     *     
     */
    public void setReturn(GetSafCcdPurgeBlockLearnedRoutesRes.Return value) {
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
     *         &lt;element name="safCcdPurgeBlockLearnedRoutes" type="{http://www.cisco.com/AXL/API/11.5}RSafCcdPurgeBlockLearnedRoutes"/&gt;
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
        "safCcdPurgeBlockLearnedRoutes"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSafCcdPurgeBlockLearnedRoutes safCcdPurgeBlockLearnedRoutes;

        /**
         * Gets the value of the safCcdPurgeBlockLearnedRoutes property.
         * 
         * @return
         *     possible object is
         *     {@link RSafCcdPurgeBlockLearnedRoutes }
         *     
         */
        public RSafCcdPurgeBlockLearnedRoutes getSafCcdPurgeBlockLearnedRoutes() {
            return safCcdPurgeBlockLearnedRoutes;
        }

        /**
         * Sets the value of the safCcdPurgeBlockLearnedRoutes property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSafCcdPurgeBlockLearnedRoutes }
         *     
         */
        public void setSafCcdPurgeBlockLearnedRoutes(RSafCcdPurgeBlockLearnedRoutes value) {
            this.safCcdPurgeBlockLearnedRoutes = value;
        }

    }

}
