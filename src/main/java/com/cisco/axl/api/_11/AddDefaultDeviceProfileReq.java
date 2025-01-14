
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDefaultDeviceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDefaultDeviceProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultDeviceProfile" type="{http://www.cisco.com/AXL/API/11.5}XDefaultDeviceProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDefaultDeviceProfileReq", propOrder = {
    "defaultDeviceProfile"
})
public class AddDefaultDeviceProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDefaultDeviceProfile defaultDeviceProfile;

    /**
     * Gets the value of the defaultDeviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XDefaultDeviceProfile }
     *     
     */
    public XDefaultDeviceProfile getDefaultDeviceProfile() {
        return defaultDeviceProfile;
    }

    /**
     * Sets the value of the defaultDeviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDefaultDeviceProfile }
     *     
     */
    public void setDefaultDeviceProfile(XDefaultDeviceProfile value) {
        this.defaultDeviceProfile = value;
    }

}
