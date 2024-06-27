
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAudioCodecPreferenceListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAudioCodecPreferenceListRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/11.5}RAudioCodecPreferenceList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAudioCodecPreferenceListRes", propOrder = {
    "_return"
})
public class GetAudioCodecPreferenceListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAudioCodecPreferenceListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAudioCodecPreferenceListRes.Return }
     *     
     */
    public GetAudioCodecPreferenceListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAudioCodecPreferenceListRes.Return }
     *     
     */
    public void setReturn(GetAudioCodecPreferenceListRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/11.5}RAudioCodecPreferenceList"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "audioCodecPreferenceList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAudioCodecPreferenceList audioCodecPreferenceList;

        /**
         * Gets the value of the audioCodecPreferenceList property.
         * 
         * @return
         *     possible object is
         *     {@link RAudioCodecPreferenceList }
         *     
         */
        public RAudioCodecPreferenceList getAudioCodecPreferenceList() {
            return audioCodecPreferenceList;
        }

        /**
         * Sets the value of the audioCodecPreferenceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAudioCodecPreferenceList }
         *     
         */
        public void setAudioCodecPreferenceList(RAudioCodecPreferenceList value) {
            this.audioCodecPreferenceList = value;
        }

    }

}