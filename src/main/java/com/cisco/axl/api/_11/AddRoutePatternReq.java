
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRoutePatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routePattern" type="{http://www.cisco.com/AXL/API/11.5}XRoutePattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRoutePatternReq", propOrder = {
    "routePattern"
})
public class AddRoutePatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRoutePattern routePattern;

    /**
     * Gets the value of the routePattern property.
     * 
     * @return
     *     possible object is
     *     {@link XRoutePattern }
     *     
     */
    public XRoutePattern getRoutePattern() {
        return routePattern;
    }

    /**
     * Sets the value of the routePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRoutePattern }
     *     
     */
    public void setRoutePattern(XRoutePattern value) {
        this.routePattern = value;
    }

}
