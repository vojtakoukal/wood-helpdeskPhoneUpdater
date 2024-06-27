
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTranscoderReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTranscoderReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transcoder" type="{http://www.cisco.com/AXL/API/11.5}XTranscoder"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTranscoderReq", propOrder = {
    "transcoder"
})
public class AddTranscoderReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTranscoder transcoder;

    /**
     * Gets the value of the transcoder property.
     * 
     * @return
     *     possible object is
     *     {@link XTranscoder }
     *     
     */
    public XTranscoder getTranscoder() {
        return transcoder;
    }

    /**
     * Sets the value of the transcoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTranscoder }
     *     
     */
    public void setTranscoder(XTranscoder value) {
        this.transcoder = value;
    }

}
