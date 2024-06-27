
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUniversalLineTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUniversalLineTemplateReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/11.5}XUniversalLineTemplate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUniversalLineTemplateReq", propOrder = {
    "universalLineTemplate"
})
public class AddUniversalLineTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUniversalLineTemplate universalLineTemplate;

    /**
     * Gets the value of the universalLineTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XUniversalLineTemplate }
     *     
     */
    public XUniversalLineTemplate getUniversalLineTemplate() {
        return universalLineTemplate;
    }

    /**
     * Sets the value of the universalLineTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUniversalLineTemplate }
     *     
     */
    public void setUniversalLineTemplate(XUniversalLineTemplate value) {
        this.universalLineTemplate = value;
    }

}
