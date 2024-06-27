
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddExternalCallControlProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddExternalCallControlProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/11.5}XExternalCallControlProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddExternalCallControlProfileReq", propOrder = {
    "externalCallControlProfile"
})
public class AddExternalCallControlProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XExternalCallControlProfile externalCallControlProfile;

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XExternalCallControlProfile }
     *     
     */
    public XExternalCallControlProfile getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XExternalCallControlProfile }
     *     
     */
    public void setExternalCallControlProfile(XExternalCallControlProfile value) {
        this.externalCallControlProfile = value;
    }

}
