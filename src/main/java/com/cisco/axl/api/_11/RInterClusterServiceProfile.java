
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RInterClusterServiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RInterClusterServiceProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="interClusterService" type="{http://www.cisco.com/AXL/API/11.5}XInterClusterService" minOccurs="0"/&gt;
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RInterClusterServiceProfile", propOrder = {
    "interClusterService",
    "isActivated",
    "sipTrunkName"
})
public class RInterClusterServiceProfile {

    protected String interClusterService;
    protected String isActivated;
    protected XFkType sipTrunkName;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the interClusterService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterClusterService() {
        return interClusterService;
    }

    /**
     * Sets the value of the interClusterService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterClusterService(String value) {
        this.interClusterService = value;
    }

    /**
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivated(String value) {
        this.isActivated = value;
    }

    /**
     * Gets the value of the sipTrunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipTrunkName() {
        return sipTrunkName;
    }

    /**
     * Sets the value of the sipTrunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipTrunkName(XFkType value) {
        this.sipTrunkName = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
