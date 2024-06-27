
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeRouteFilterElementReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeRouteFilterElementReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeRouteFilterElement" type="{http://www.cisco.com/AXL/API/11.5}XImeRouteFilterElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeRouteFilterElementReq", propOrder = {
    "imeRouteFilterElement"
})
public class AddImeRouteFilterElementReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeRouteFilterElement imeRouteFilterElement;

    /**
     * Gets the value of the imeRouteFilterElement property.
     * 
     * @return
     *     possible object is
     *     {@link XImeRouteFilterElement }
     *     
     */
    public XImeRouteFilterElement getImeRouteFilterElement() {
        return imeRouteFilterElement;
    }

    /**
     * Sets the value of the imeRouteFilterElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeRouteFilterElement }
     *     
     */
    public void setImeRouteFilterElement(XImeRouteFilterElement value) {
        this.imeRouteFilterElement = value;
    }

}
