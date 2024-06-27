
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="sortOrder" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="routePartition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linePrimaryUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XExtension", propOrder = {
    "sortOrder",
    "pattern",
    "routePartition",
    "linePrimaryUri",
    "partition"
})
public class XExtension {

    @XmlElementRef(name = "sortOrder", type = JAXBElement.class)
    protected JAXBElement<String> sortOrder;
    protected XFkType pattern;
    protected String routePartition;
    @XmlElementRef(name = "linePrimaryUri", type = JAXBElement.class)
    protected JAXBElement<String> linePrimaryUri;
    @XmlElementRef(name = "partition", type = JAXBElement.class)
    protected JAXBElement<XFkType> partition;

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortOrder(JAXBElement<String> value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPattern(XFkType value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePartition(String value) {
        this.routePartition = value;
    }

    /**
     * Gets the value of the linePrimaryUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinePrimaryUri() {
        return linePrimaryUri;
    }

    /**
     * Sets the value of the linePrimaryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinePrimaryUri(JAXBElement<String> value) {
        this.linePrimaryUri = value;
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

}
