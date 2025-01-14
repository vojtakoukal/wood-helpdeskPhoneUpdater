
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatekeeperReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatekeeperReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gatekeeper" type="{http://www.cisco.com/AXL/API/11.5}XGatekeeper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatekeeperReq", propOrder = {
    "gatekeeper"
})
public class AddGatekeeperReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatekeeper gatekeeper;

    /**
     * Gets the value of the gatekeeper property.
     * 
     * @return
     *     possible object is
     *     {@link XGatekeeper }
     *     
     */
    public XGatekeeper getGatekeeper() {
        return gatekeeper;
    }

    /**
     * Sets the value of the gatekeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatekeeper }
     *     
     */
    public void setGatekeeper(XGatekeeper value) {
        this.gatekeeper = value;
    }

}
