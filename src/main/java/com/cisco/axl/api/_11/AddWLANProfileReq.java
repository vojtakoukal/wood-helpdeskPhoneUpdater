
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWLANProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWLANProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wLANProfile" type="{http://www.cisco.com/AXL/API/11.5}XWLANProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWLANProfileReq", propOrder = {
    "wlanProfile"
})
public class AddWLANProfileReq
    extends APIRequest
{

    @XmlElement(name = "wLANProfile", required = true)
    protected XWLANProfile wlanProfile;

    /**
     * Gets the value of the wlanProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XWLANProfile }
     *     
     */
    public XWLANProfile getWLANProfile() {
        return wlanProfile;
    }

    /**
     * Sets the value of the wlanProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWLANProfile }
     *     
     */
    public void setWLANProfile(XWLANProfile value) {
        this.wlanProfile = value;
    }

}
