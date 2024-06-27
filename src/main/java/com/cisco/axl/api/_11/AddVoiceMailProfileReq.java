
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVoiceMailProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVoiceMailProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voiceMailProfile" type="{http://www.cisco.com/AXL/API/11.5}XVoiceMailProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVoiceMailProfileReq", propOrder = {
    "voiceMailProfile"
})
public class AddVoiceMailProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVoiceMailProfile voiceMailProfile;

    /**
     * Gets the value of the voiceMailProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XVoiceMailProfile }
     *     
     */
    public XVoiceMailProfile getVoiceMailProfile() {
        return voiceMailProfile;
    }

    /**
     * Sets the value of the voiceMailProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVoiceMailProfile }
     *     
     */
    public void setVoiceMailProfile(XVoiceMailProfile value) {
        this.voiceMailProfile = value;
    }

}
