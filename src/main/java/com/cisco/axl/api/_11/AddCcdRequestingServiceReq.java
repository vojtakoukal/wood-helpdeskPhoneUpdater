
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCcdRequestingServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCcdRequestingServiceReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccdRequestingService" type="{http://www.cisco.com/AXL/API/11.5}XCcdRequestingService"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCcdRequestingServiceReq", propOrder = {
    "ccdRequestingService"
})
public class AddCcdRequestingServiceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCcdRequestingService ccdRequestingService;

    /**
     * Gets the value of the ccdRequestingService property.
     * 
     * @return
     *     possible object is
     *     {@link XCcdRequestingService }
     *     
     */
    public XCcdRequestingService getCcdRequestingService() {
        return ccdRequestingService;
    }

    /**
     * Sets the value of the ccdRequestingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCcdRequestingService }
     *     
     */
    public void setCcdRequestingService(XCcdRequestingService value) {
        this.ccdRequestingService = value;
    }

}
