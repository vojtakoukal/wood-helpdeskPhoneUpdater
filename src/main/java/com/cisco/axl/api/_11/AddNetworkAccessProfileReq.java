
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNetworkAccessProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNetworkAccessProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/11.5}XNetworkAccessProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNetworkAccessProfileReq", propOrder = {
    "networkAccessProfile"
})
public class AddNetworkAccessProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XNetworkAccessProfile networkAccessProfile;

    /**
     * Gets the value of the networkAccessProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XNetworkAccessProfile }
     *     
     */
    public XNetworkAccessProfile getNetworkAccessProfile() {
        return networkAccessProfile;
    }

    /**
     * Sets the value of the networkAccessProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XNetworkAccessProfile }
     *     
     */
    public void setNetworkAccessProfile(XNetworkAccessProfile value) {
        this.networkAccessProfile = value;
    }

}
