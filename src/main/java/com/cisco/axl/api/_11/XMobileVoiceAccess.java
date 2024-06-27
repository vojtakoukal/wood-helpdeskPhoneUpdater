
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMobileVoiceAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMobileVoiceAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="locales"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="locale" type="{http://www.cisco.com/AXL/API/11.5}XMobileVoiceMember" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMobileVoiceAccess", propOrder = {
    "pattern",
    "routePartitionName",
    "locales"
})
public class XMobileVoiceAccess {

    protected String pattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    @XmlElementRef(name = "locales", type = JAXBElement.class)
    protected JAXBElement<XMobileVoiceAccess.Locales> locales;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the locales property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMobileVoiceAccess.Locales }{@code >}
     *     
     */
    public JAXBElement<XMobileVoiceAccess.Locales> getLocales() {
        return locales;
    }

    /**
     * Sets the value of the locales property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMobileVoiceAccess.Locales }{@code >}
     *     
     */
    public void setLocales(JAXBElement<XMobileVoiceAccess.Locales> value) {
        this.locales = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="locale" type="{http://www.cisco.com/AXL/API/11.5}XMobileVoiceMember" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locale"
    })
    public static class Locales
        extends XCommonMembersExtension
    {

        protected List<XMobileVoiceMember> locale;

        /**
         * Gets the value of the locale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMobileVoiceMember }
         * 
         * 
         */
        public List<XMobileVoiceMember> getLocale() {
            if (locale == null) {
                locale = new ArrayList<XMobileVoiceMember>();
            }
            return this.locale;
        }

    }

}
