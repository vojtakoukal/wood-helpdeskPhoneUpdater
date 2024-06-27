
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeExclusionNumberReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeExclusionNumberReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeExclusionNumber" type="{http://www.cisco.com/AXL/API/11.5}XImeExclusionNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeExclusionNumberReq", propOrder = {
    "imeExclusionNumber"
})
public class AddImeExclusionNumberReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeExclusionNumber imeExclusionNumber;

    /**
     * Gets the value of the imeExclusionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XImeExclusionNumber }
     *     
     */
    public XImeExclusionNumber getImeExclusionNumber() {
        return imeExclusionNumber;
    }

    /**
     * Sets the value of the imeExclusionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeExclusionNumber }
     *     
     */
    public void setImeExclusionNumber(XImeExclusionNumber value) {
        this.imeExclusionNumber = value;
    }

}
