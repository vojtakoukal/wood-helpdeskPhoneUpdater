
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddBlockedLearnedPatternsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBlockedLearnedPatternsReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blockedLearnedPatterns" type="{http://www.cisco.com/AXL/API/11.5}XBlockedLearnedPatterns"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBlockedLearnedPatternsReq", propOrder = {
    "blockedLearnedPatterns"
})
public class AddBlockedLearnedPatternsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XBlockedLearnedPatterns blockedLearnedPatterns;

    /**
     * Gets the value of the blockedLearnedPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link XBlockedLearnedPatterns }
     *     
     */
    public XBlockedLearnedPatterns getBlockedLearnedPatterns() {
        return blockedLearnedPatterns;
    }

    /**
     * Sets the value of the blockedLearnedPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XBlockedLearnedPatterns }
     *     
     */
    public void setBlockedLearnedPatterns(XBlockedLearnedPatterns value) {
        this.blockedLearnedPatterns = value;
    }

}
