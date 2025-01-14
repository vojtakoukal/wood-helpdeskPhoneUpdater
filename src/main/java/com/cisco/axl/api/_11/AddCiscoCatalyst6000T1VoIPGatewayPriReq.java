
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCiscoCatalyst6000T1VoIPGatewayPriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCiscoCatalyst6000T1VoIPGatewayPriReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/11.5}XCiscoCatalyst6000T1VoIPGatewayPri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCiscoCatalyst6000T1VoIPGatewayPriReq", propOrder = {
    "ciscoCatalyst6000T1VoIPGatewayPri"
})
public class AddCiscoCatalyst6000T1VoIPGatewayPriReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCiscoCatalyst6000T1VoIPGatewayPri ciscoCatalyst6000T1VoIPGatewayPri;

    /**
     * Gets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
     * 
     * @return
     *     possible object is
     *     {@link XCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public XCiscoCatalyst6000T1VoIPGatewayPri getCiscoCatalyst6000T1VoIPGatewayPri() {
        return ciscoCatalyst6000T1VoIPGatewayPri;
    }

    /**
     * Sets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public void setCiscoCatalyst6000T1VoIPGatewayPri(XCiscoCatalyst6000T1VoIPGatewayPri value) {
        this.ciscoCatalyst6000T1VoIPGatewayPri = value;
    }

}
