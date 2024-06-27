
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLineGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLineGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineGroup" type="{http://www.cisco.com/AXL/API/11.5}XLineGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLineGroupReq", propOrder = {
    "lineGroup"
})
public class AddLineGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLineGroup lineGroup;

    /**
     * Gets the value of the lineGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLineGroup }
     *     
     */
    public XLineGroup getLineGroup() {
        return lineGroup;
    }

    /**
     * Sets the value of the lineGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLineGroup }
     *     
     */
    public void setLineGroup(XLineGroup value) {
        this.lineGroup = value;
    }

}
