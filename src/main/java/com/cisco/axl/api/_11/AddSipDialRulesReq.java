
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipDialRulesReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sipDialRules" type="{http://www.cisco.com/AXL/API/11.5}XSipDialRules"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipDialRulesReq", propOrder = {
    "sipDialRules"
})
public class AddSipDialRulesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipDialRules sipDialRules;

    /**
     * Gets the value of the sipDialRules property.
     * 
     * @return
     *     possible object is
     *     {@link XSipDialRules }
     *     
     */
    public XSipDialRules getSipDialRules() {
        return sipDialRules;
    }

    /**
     * Sets the value of the sipDialRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipDialRules }
     *     
     */
    public void setSipDialRules(XSipDialRules value) {
        this.sipDialRules = value;
    }

}
