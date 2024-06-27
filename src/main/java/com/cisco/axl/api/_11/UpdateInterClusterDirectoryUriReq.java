
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInterClusterDirectoryUriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInterClusterDirectoryUriReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchangeDirectoryUri" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="routeString" type="{http://www.cisco.com/AXL/API/11.5}String50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInterClusterDirectoryUriReq", propOrder = {
    "exchangeDirectoryUri",
    "routeString"
})
public class UpdateInterClusterDirectoryUriReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String exchangeDirectoryUri;
    @XmlElement(required = true)
    protected String routeString;

    /**
     * Gets the value of the exchangeDirectoryUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDirectoryUri() {
        return exchangeDirectoryUri;
    }

    /**
     * Sets the value of the exchangeDirectoryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDirectoryUri(String value) {
        this.exchangeDirectoryUri = value;
    }

    /**
     * Gets the value of the routeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteString() {
        return routeString;
    }

    /**
     * Sets the value of the routeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteString(String value) {
        this.routeString = value;
    }

}
