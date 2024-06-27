
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XAppServerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XAppServerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="appServerName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="appServerContent" type="{http://www.cisco.com/AXL/API/11.5}XAppServerContent"/&gt;
 *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/11.5}XContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAppServerInfo", propOrder = {
    "appServerName",
    "appServerContent",
    "content"
})
public class XAppServerInfo {

    protected XFkType appServerName;
    protected String appServerContent;
    @XmlElementRef(name = "content", type = JAXBElement.class)
    protected JAXBElement<XContent> content;

    /**
     * Gets the value of the appServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAppServerName() {
        return appServerName;
    }

    /**
     * Sets the value of the appServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAppServerName(XFkType value) {
        this.appServerName = value;
    }

    /**
     * Gets the value of the appServerContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppServerContent() {
        return appServerContent;
    }

    /**
     * Sets the value of the appServerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppServerContent(String value) {
        this.appServerContent = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
     *     
     */
    public JAXBElement<XContent> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
     *     
     */
    public void setContent(JAXBElement<XContent> value) {
        this.content = value;
    }

}
