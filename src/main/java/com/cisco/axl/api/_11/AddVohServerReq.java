
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVohServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVohServerReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vohServer" type="{http://www.cisco.com/AXL/API/11.5}XVohServer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVohServerReq", propOrder = {
    "vohServer"
})
public class AddVohServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVohServer vohServer;

    /**
     * Gets the value of the vohServer property.
     * 
     * @return
     *     possible object is
     *     {@link XVohServer }
     *     
     */
    public XVohServer getVohServer() {
        return vohServer;
    }

    /**
     * Sets the value of the vohServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVohServer }
     *     
     */
    public void setVohServer(XVohServer value) {
        this.vohServer = value;
    }

}
