
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMediaResourceGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMediaResourceGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaResourceGroup" type="{http://www.cisco.com/AXL/API/11.5}XMediaResourceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMediaResourceGroupReq", propOrder = {
    "mediaResourceGroup"
})
public class AddMediaResourceGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMediaResourceGroup mediaResourceGroup;

    /**
     * Gets the value of the mediaResourceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XMediaResourceGroup }
     *     
     */
    public XMediaResourceGroup getMediaResourceGroup() {
        return mediaResourceGroup;
    }

    /**
     * Sets the value of the mediaResourceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMediaResourceGroup }
     *     
     */
    public void setMediaResourceGroup(XMediaResourceGroup value) {
        this.mediaResourceGroup = value;
    }

}
