
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddApplicationToSoftkeyTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApplicationToSoftkeyTemplateReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationToSoftkeyTemplate" type="{http://www.cisco.com/AXL/API/11.5}XApplicationToSoftKeyTemplate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApplicationToSoftkeyTemplateReq", propOrder = {
    "applicationToSoftkeyTemplate"
})
public class AddApplicationToSoftkeyTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XApplicationToSoftKeyTemplate applicationToSoftkeyTemplate;

    /**
     * Gets the value of the applicationToSoftkeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicationToSoftKeyTemplate }
     *     
     */
    public XApplicationToSoftKeyTemplate getApplicationToSoftkeyTemplate() {
        return applicationToSoftkeyTemplate;
    }

    /**
     * Sets the value of the applicationToSoftkeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicationToSoftKeyTemplate }
     *     
     */
    public void setApplicationToSoftkeyTemplate(XApplicationToSoftKeyTemplate value) {
        this.applicationToSoftkeyTemplate = value;
    }

}
