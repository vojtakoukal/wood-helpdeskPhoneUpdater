
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeRouteFilterGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeRouteFilterGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeRouteFilterGroup" type="{http://www.cisco.com/AXL/API/11.5}XImeRouteFilterGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeRouteFilterGroupReq", propOrder = {
    "imeRouteFilterGroup"
})
public class AddImeRouteFilterGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeRouteFilterGroup imeRouteFilterGroup;

    /**
     * Gets the value of the imeRouteFilterGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XImeRouteFilterGroup }
     *     
     */
    public XImeRouteFilterGroup getImeRouteFilterGroup() {
        return imeRouteFilterGroup;
    }

    /**
     * Sets the value of the imeRouteFilterGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeRouteFilterGroup }
     *     
     */
    public void setImeRouteFilterGroup(XImeRouteFilterGroup value) {
        this.imeRouteFilterGroup = value;
    }

}
