
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeClientReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeClientReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeClient" type="{http://www.cisco.com/AXL/API/11.5}XImeClient"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeClientReq", propOrder = {
    "imeClient"
})
public class AddImeClientReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeClient imeClient;

    /**
     * Gets the value of the imeClient property.
     * 
     * @return
     *     possible object is
     *     {@link XImeClient }
     *     
     */
    public XImeClient getImeClient() {
        return imeClient;
    }

    /**
     * Sets the value of the imeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeClient }
     *     
     */
    public void setImeClient(XImeClient value) {
        this.imeClient = value;
    }

}
