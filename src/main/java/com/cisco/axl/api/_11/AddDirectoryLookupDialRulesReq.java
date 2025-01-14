
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDirectoryLookupDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDirectoryLookupDialRulesReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directoryLookupDialRules" type="{http://www.cisco.com/AXL/API/11.5}XDirectoryLookupDialRules"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDirectoryLookupDialRulesReq", propOrder = {
    "directoryLookupDialRules"
})
public class AddDirectoryLookupDialRulesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDirectoryLookupDialRules directoryLookupDialRules;

    /**
     * Gets the value of the directoryLookupDialRules property.
     * 
     * @return
     *     possible object is
     *     {@link XDirectoryLookupDialRules }
     *     
     */
    public XDirectoryLookupDialRules getDirectoryLookupDialRules() {
        return directoryLookupDialRules;
    }

    /**
     * Sets the value of the directoryLookupDialRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirectoryLookupDialRules }
     *     
     */
    public void setDirectoryLookupDialRules(XDirectoryLookupDialRules value) {
        this.directoryLookupDialRules = value;
    }

}
