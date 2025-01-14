
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRemoteClusterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRemoteClusterRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="remoteCluster" type="{http://www.cisco.com/AXL/API/11.5}RRemoteCluster"/&gt;
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
@XmlType(name = "GetRemoteClusterRes", propOrder = {
    "_return"
})
public class GetRemoteClusterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRemoteClusterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRemoteClusterRes.Return }
     *     
     */
    public GetRemoteClusterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRemoteClusterRes.Return }
     *     
     */
    public void setReturn(GetRemoteClusterRes.Return value) {
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
     *         &lt;element name="remoteCluster" type="{http://www.cisco.com/AXL/API/11.5}RRemoteCluster"/&gt;
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
        "remoteCluster"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRemoteCluster remoteCluster;

        /**
         * Gets the value of the remoteCluster property.
         * 
         * @return
         *     possible object is
         *     {@link RRemoteCluster }
         *     
         */
        public RRemoteCluster getRemoteCluster() {
            return remoteCluster;
        }

        /**
         * Sets the value of the remoteCluster property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRemoteCluster }
         *     
         */
        public void setRemoteCluster(RRemoteCluster value) {
            this.remoteCluster = value;
        }

    }

}
