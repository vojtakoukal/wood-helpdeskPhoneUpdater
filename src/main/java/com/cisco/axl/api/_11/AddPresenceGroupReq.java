
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPresenceGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPresenceGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/11.5}XPresenceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPresenceGroupReq", propOrder = {
    "presenceGroup"
})
public class AddPresenceGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPresenceGroup presenceGroup;

    /**
     * Gets the value of the presenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XPresenceGroup }
     *     
     */
    public XPresenceGroup getPresenceGroup() {
        return presenceGroup;
    }

    /**
     * Sets the value of the presenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPresenceGroup }
     *     
     */
    public void setPresenceGroup(XPresenceGroup value) {
        this.presenceGroup = value;
    }

}
