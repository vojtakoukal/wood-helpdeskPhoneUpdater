
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoutePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRoutePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="dnOrPattern" type="{http://www.cisco.com/AXL/API/11.5}String255"/&gt;
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="type" type="{http://www.cisco.com/AXL/API/11.5}XPatternUsage"/&gt;
 *         &lt;element name="routeDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoutePlan", propOrder = {
    "dnOrPattern",
    "partition",
    "type",
    "routeDetail"
})
public class XRoutePlan {

    protected String dnOrPattern;
    @XmlElementRef(name = "partition", type = JAXBElement.class)
    protected JAXBElement<XFkType> partition;
    protected String type;
    protected String routeDetail;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPartition(JAXBElement<XFkType> value) {
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

}
