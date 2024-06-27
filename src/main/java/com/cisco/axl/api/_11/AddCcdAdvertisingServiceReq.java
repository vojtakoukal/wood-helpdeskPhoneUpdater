
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCcdAdvertisingServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCcdAdvertisingServiceReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccdAdvertisingService" type="{http://www.cisco.com/AXL/API/11.5}XCcdAdvertisingService"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCcdAdvertisingServiceReq", propOrder = {
    "ccdAdvertisingService"
})
public class AddCcdAdvertisingServiceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCcdAdvertisingService ccdAdvertisingService;

    /**
     * Gets the value of the ccdAdvertisingService property.
     * 
     * @return
     *     possible object is
     *     {@link XCcdAdvertisingService }
     *     
     */
    public XCcdAdvertisingService getCcdAdvertisingService() {
        return ccdAdvertisingService;
    }

    /**
     * Sets the value of the ccdAdvertisingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCcdAdvertisingService }
     *     
     */
    public void setCcdAdvertisingService(XCcdAdvertisingService value) {
        this.ccdAdvertisingService = value;
    }

}
