
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XGatewayEndpointDigitalAccessT1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewayEndpointDigitalAccessT1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="gatewayUuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="unit" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="subunit" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/11.5}XGatewayEndpointDigitalT1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatewayEndpointDigitalAccessT1", propOrder = {
    "domainName",
    "gatewayUuid",
    "unit",
    "subunit",
    "endpoint"
})
public class XGatewayEndpointDigitalAccessT1 {

    protected String domainName;
    protected String gatewayUuid;
    protected String unit;
    protected String subunit;
    protected XGatewayEndpointDigitalT1 endpoint;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the gatewayUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayUuid() {
        return gatewayUuid;
    }

    /**
     * Sets the value of the gatewayUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayUuid(String value) {
        this.gatewayUuid = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the subunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubunit() {
        return subunit;
    }

    /**
     * Sets the value of the subunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubunit(String value) {
        this.subunit = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalT1 }
     *     
     */
    public XGatewayEndpointDigitalT1 getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalT1 }
     *     
     */
    public void setEndpoint(XGatewayEndpointDigitalT1 value) {
        this.endpoint = value;
    }

}
