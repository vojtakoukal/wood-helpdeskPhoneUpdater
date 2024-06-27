
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocalRouteGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLocalRouteGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localRouteGroup" type="{http://www.cisco.com/AXL/API/11.5}XLocalRouteGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocalRouteGroupReq", propOrder = {
    "localRouteGroup"
})
public class AddLocalRouteGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLocalRouteGroup localRouteGroup;

    /**
     * Gets the value of the localRouteGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLocalRouteGroup }
     *     
     */
    public XLocalRouteGroup getLocalRouteGroup() {
        return localRouteGroup;
    }

    /**
     * Sets the value of the localRouteGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLocalRouteGroup }
     *     
     */
    public void setLocalRouteGroup(XLocalRouteGroup value) {
        this.localRouteGroup = value;
    }

}
