
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSipRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSipRoutePatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="newPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newRoutePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="blockEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="dnOrPatternIpv6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeOnUserPart" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useCallerCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="domainRoutingCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSipRoutePatternReq", propOrder = {
    "uuid",
    "pattern",
    "routePartitionName",
    "newPattern",
    "description",
    "newRoutePartitionName",
    "blockEnable",
    "callingPartyTransformationMask",
    "useCallingPartyPhoneMask",
    "callingPartyPrefixDigits",
    "callingLinePresentationBit",
    "callingNamePresentationBit",
    "connectedLinePresentationBit",
    "connectedNamePresentationBit",
    "sipTrunkName",
    "dnOrPatternIpv6",
    "routeOnUserPart",
    "useCallerCss",
    "domainRoutingCssName"
})
public class UpdateSipRoutePatternReq
    extends APIRequest
{

    protected String uuid;
    protected String pattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected String newPattern;
    protected String description;
    @XmlElementRef(name = "newRoutePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRoutePartitionName;
    protected String blockEnable;
    @XmlElementRef(name = "callingPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyTransformationMask;
    @XmlElement(defaultValue = "Default")
    protected String useCallingPartyPhoneMask;
    @XmlElementRef(name = "callingPartyPrefixDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyPrefixDigits;
    @XmlElement(defaultValue = "Default")
    protected String callingLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String callingNamePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedNamePresentationBit;
    protected XFkType sipTrunkName;
    protected String dnOrPatternIpv6;
    protected String routeOnUserPart;
    protected String useCallerCss;
    @XmlElementRef(name = "domainRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> domainRoutingCssName;

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
     * Gets the value of the newPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPattern() {
        return newPattern;
    }

    /**
     * Sets the value of the newPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPattern(String value) {
        this.newPattern = value;
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
     * Gets the value of the newRoutePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewRoutePartitionName() {
        return newRoutePartitionName;
    }

    /**
     * Sets the value of the newRoutePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewRoutePartitionName(JAXBElement<XFkType> value) {
        this.newRoutePartitionName = value;
    }

    /**
     * Gets the value of the blockEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockEnable() {
        return blockEnable;
    }

    /**
     * Sets the value of the blockEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockEnable(String value) {
        this.blockEnable = value;
    }

    /**
     * Gets the value of the callingPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyTransformationMask() {
        return callingPartyTransformationMask;
    }

    /**
     * Sets the value of the callingPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyTransformationMask(JAXBElement<String> value) {
        this.callingPartyTransformationMask = value;
    }

    /**
     * Gets the value of the useCallingPartyPhoneMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCallingPartyPhoneMask() {
        return useCallingPartyPhoneMask;
    }

    /**
     * Sets the value of the useCallingPartyPhoneMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCallingPartyPhoneMask(String value) {
        this.useCallingPartyPhoneMask = value;
    }

    /**
     * Gets the value of the callingPartyPrefixDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyPrefixDigits() {
        return callingPartyPrefixDigits;
    }

    /**
     * Sets the value of the callingPartyPrefixDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyPrefixDigits(JAXBElement<String> value) {
        this.callingPartyPrefixDigits = value;
    }

    /**
     * Gets the value of the callingLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLinePresentationBit() {
        return callingLinePresentationBit;
    }

    /**
     * Sets the value of the callingLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLinePresentationBit(String value) {
        this.callingLinePresentationBit = value;
    }

    /**
     * Gets the value of the callingNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNamePresentationBit() {
        return callingNamePresentationBit;
    }

    /**
     * Sets the value of the callingNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNamePresentationBit(String value) {
        this.callingNamePresentationBit = value;
    }

    /**
     * Gets the value of the connectedLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedLinePresentationBit() {
        return connectedLinePresentationBit;
    }

    /**
     * Sets the value of the connectedLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedLinePresentationBit(String value) {
        this.connectedLinePresentationBit = value;
    }

    /**
     * Gets the value of the connectedNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedNamePresentationBit() {
        return connectedNamePresentationBit;
    }

    /**
     * Sets the value of the connectedNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedNamePresentationBit(String value) {
        this.connectedNamePresentationBit = value;
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
     * Gets the value of the dnOrPatternIpv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnOrPatternIpv6() {
        return dnOrPatternIpv6;
    }

    /**
     * Sets the value of the dnOrPatternIpv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnOrPatternIpv6(String value) {
        this.dnOrPatternIpv6 = value;
    }

    /**
     * Gets the value of the routeOnUserPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOnUserPart() {
        return routeOnUserPart;
    }

    /**
     * Sets the value of the routeOnUserPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOnUserPart(String value) {
        this.routeOnUserPart = value;
    }

    /**
     * Gets the value of the useCallerCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCallerCss() {
        return useCallerCss;
    }

    /**
     * Sets the value of the useCallerCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCallerCss(String value) {
        this.useCallerCss = value;
    }

    /**
     * Gets the value of the domainRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDomainRoutingCssName() {
        return domainRoutingCssName;
    }

    /**
     * Sets the value of the domainRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDomainRoutingCssName(JAXBElement<XFkType> value) {
        this.domainRoutingCssName = value;
    }

}
