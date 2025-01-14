
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XTODAccessMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XTODAccessMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="timeScheduleName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="accessListName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XTODAccessMember", propOrder = {
    "timeScheduleName",
    "accessListName"
})
public class XTODAccessMember {

    @XmlElementRef(name = "timeScheduleName", type = JAXBElement.class)
    protected JAXBElement<XFkType> timeScheduleName;
    @XmlElementRef(name = "accessListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> accessListName;

    /**
     * Gets the value of the timeScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getTimeScheduleName() {
        return timeScheduleName;
    }

    /**
     * Sets the value of the timeScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setTimeScheduleName(JAXBElement<XFkType> value) {
        this.timeScheduleName = value;
    }

    /**
     * Gets the value of the accessListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAccessListName() {
        return accessListName;
    }

    /**
     * Sets the value of the accessListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAccessListName(JAXBElement<XFkType> value) {
        this.accessListName = value;
    }

}
