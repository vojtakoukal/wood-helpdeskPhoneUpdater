
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAudioCodecPreferenceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAudioCodecPreferenceListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/11.5}XAudioCodecPreferenceList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAudioCodecPreferenceListReq", propOrder = {
    "audioCodecPreferenceList"
})
public class AddAudioCodecPreferenceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAudioCodecPreferenceList audioCodecPreferenceList;

    /**
     * Gets the value of the audioCodecPreferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link XAudioCodecPreferenceList }
     *     
     */
    public XAudioCodecPreferenceList getAudioCodecPreferenceList() {
        return audioCodecPreferenceList;
    }

    /**
     * Sets the value of the audioCodecPreferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAudioCodecPreferenceList }
     *     
     */
    public void setAudioCodecPreferenceList(XAudioCodecPreferenceList value) {
        this.audioCodecPreferenceList = value;
    }

}
