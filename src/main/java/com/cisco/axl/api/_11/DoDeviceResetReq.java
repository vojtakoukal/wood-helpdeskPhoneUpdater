
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Performs either a hard or soft reset on the specified device. If resetting an MGCP box, then set isMGCP attribute to true.
 * 
 * <p>Java class for DoDeviceResetReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoDeviceResetReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="isHardReset" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *           &lt;element name="deviceResetType" type="{http://www.cisco.com/AXL/API/11.5}XReset"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isMGCP" type="{http://www.cisco.com/AXL/API/11.5}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoDeviceResetReq", propOrder = {
    "deviceName",
    "isHardReset",
    "deviceResetType"
})
public class DoDeviceResetReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFkType deviceName;
    protected String isHardReset;
    protected String deviceResetType;
    @XmlAttribute(name = "isMGCP")
    protected String isMGCP;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDeviceName(XFkType value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the isHardReset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHardReset() {
        return isHardReset;
    }

    /**
     * Sets the value of the isHardReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHardReset(String value) {
        this.isHardReset = value;
    }

    /**
     * Gets the value of the deviceResetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceResetType() {
        return deviceResetType;
    }

    /**
     * Sets the value of the deviceResetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceResetType(String value) {
        this.deviceResetType = value;
    }

    /**
     * Gets the value of the isMGCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMGCP() {
        if (isMGCP == null) {
            return "false";
        } else {
            return isMGCP;
        }
    }

    /**
     * Sets the value of the isMGCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMGCP(String value) {
        this.isMGCP = value;
    }

}
