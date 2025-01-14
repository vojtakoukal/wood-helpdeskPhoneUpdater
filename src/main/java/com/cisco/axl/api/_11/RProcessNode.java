
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RProcessNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RProcessNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="mac" type="{http://www.cisco.com/AXL/API/11.5}XMacAddress" minOccurs="0"/&gt;
 *         &lt;element name="ipv6Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nodeUsage" type="{http://www.cisco.com/AXL/API/11.5}XNodeUsage" minOccurs="0"/&gt;
 *         &lt;element name="lbmHubGroup" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="processNodeRole" type="{http://www.cisco.com/AXL/API/11.5}XProcessNodeRole" minOccurs="0"/&gt;
 *         &lt;element name="cupDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RProcessNode", propOrder = {
    "name",
    "description",
    "mac",
    "ipv6Name",
    "nodeUsage",
    "lbmHubGroup",
    "processNodeRole",
    "cupDomain"
})
public class RProcessNode {

    protected String name;
    protected String description;
    protected String mac;
    protected String ipv6Name;
    protected String nodeUsage;
    protected XFkType lbmHubGroup;
    protected String processNodeRole;
    protected String cupDomain;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the ipv6Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6Name() {
        return ipv6Name;
    }

    /**
     * Sets the value of the ipv6Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6Name(String value) {
        this.ipv6Name = value;
    }

    /**
     * Gets the value of the nodeUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeUsage() {
        return nodeUsage;
    }

    /**
     * Sets the value of the nodeUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeUsage(String value) {
        this.nodeUsage = value;
    }

    /**
     * Gets the value of the lbmHubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLbmHubGroup() {
        return lbmHubGroup;
    }

    /**
     * Sets the value of the lbmHubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLbmHubGroup(XFkType value) {
        this.lbmHubGroup = value;
    }

    /**
     * Gets the value of the processNodeRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessNodeRole() {
        return processNodeRole;
    }

    /**
     * Sets the value of the processNodeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessNodeRole(String value) {
        this.processNodeRole = value;
    }

    /**
     * Gets the value of the cupDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupDomain() {
        return cupDomain;
    }

    /**
     * Sets the value of the cupDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupDomain(String value) {
        this.cupDomain = value;
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
