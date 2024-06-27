
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRemoteDestinationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRemoteDestinationReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remoteDestination" type="{http://www.cisco.com/AXL/API/11.5}XRemoteDestination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRemoteDestinationReq", propOrder = {
    "remoteDestination"
})
public class AddRemoteDestinationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRemoteDestination remoteDestination;

    /**
     * Gets the value of the remoteDestination property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteDestination }
     *     
     */
    public XRemoteDestination getRemoteDestination() {
        return remoteDestination;
    }

    /**
     * Sets the value of the remoteDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteDestination }
     *     
     */
    public void setRemoteDestination(XRemoteDestination value) {
        this.remoteDestination = value;
    }

}
