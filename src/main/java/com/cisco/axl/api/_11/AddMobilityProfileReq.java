
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMobilityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMobilityProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityProfile" type="{http://www.cisco.com/AXL/API/11.5}XMobilityProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMobilityProfileReq", propOrder = {
    "mobilityProfile"
})
public class AddMobilityProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMobilityProfile mobilityProfile;

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XMobilityProfile }
     *     
     */
    public XMobilityProfile getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMobilityProfile }
     *     
     */
    public void setMobilityProfile(XMobilityProfile value) {
        this.mobilityProfile = value;
    }

}
