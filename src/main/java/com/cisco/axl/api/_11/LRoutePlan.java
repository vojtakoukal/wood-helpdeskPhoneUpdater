
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRoutePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRoutePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="dnOrPattern" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.cisco.com/AXL/API/11.5}XPatternUsage" minOccurs="0"/&gt;
 *         &lt;element name="routeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LRoutePlan", propOrder = {
    "dnOrPattern",
    "partition",
    "type",
    "routeDetail"
})
public class LRoutePlan {

    protected String dnOrPattern;
    protected XFkType partition;
    protected String type;
    protected String routeDetail;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the dnOrPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnOrPattern() {
        return dnOrPattern;
    }

    /**
     * Sets the value of the dnOrPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnOrPattern(String value) {
        this.dnOrPattern = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPartition(XFkType value) {
        this.partition = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the routeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDetail() {
        return routeDetail;
    }

    /**
     * Sets the value of the routeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDetail(String value) {
        this.routeDetail = value;
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
