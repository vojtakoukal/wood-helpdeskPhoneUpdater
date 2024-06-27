
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAdvertisedPatternsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAdvertisedPatternsReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.5}XAdvertisedPatterns"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAdvertisedPatternsReq", propOrder = {
    "advertisedPatterns"
})
public class AddAdvertisedPatternsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAdvertisedPatterns advertisedPatterns;

    /**
     * Gets the value of the advertisedPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link XAdvertisedPatterns }
     *     
     */
    public XAdvertisedPatterns getAdvertisedPatterns() {
        return advertisedPatterns;
    }

    /**
     * Sets the value of the advertisedPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAdvertisedPatterns }
     *     
     */
    public void setAdvertisedPatterns(XAdvertisedPatterns value) {
        this.advertisedPatterns = value;
    }

}
