
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransPatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *             &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *             &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="newPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newRoutePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="blockEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="newDialPlanName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="patternUrgency" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="prefixDigitsOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newRouteFilterName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/11.5}XPatternPrecedence" minOccurs="0"/&gt;
 *         &lt;element name="provideOutsideDialtone" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/11.5}XNumberingPlan" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/11.5}XPriOfNumber" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/11.5}XNumberingPlan" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/11.5}XPriOfNumber" minOccurs="0"/&gt;
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="resourcePriorityNamespaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="routeNextHopByCgpn" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="routeClass" type="{http://www.cisco.com/AXL/API/11.5}XPatternRouteClass" minOccurs="0"/&gt;
 *         &lt;element name="callInterceptProfileName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/11.5}XReleaseCauseValue" minOccurs="0"/&gt;
 *         &lt;element name="useOriginatorCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dontWaitForIDTOnSubsequentHops" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isEmergencyServiceNumber" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransPatternReq", propOrder = {
    "uuid",
    "pattern",
    "routePartitionName",
    "dialPlanName",
    "routeFilterName",
    "newPattern",
    "description",
    "newRoutePartitionName",
    "blockEnable",
    "calledPartyTransformationMask",
    "callingPartyTransformationMask",
    "useCallingPartyPhoneMask",
    "callingPartyPrefixDigits",
    "newDialPlanName",
    "digitDiscardInstructionName",
    "patternUrgency",
    "prefixDigitsOut",
    "newRouteFilterName",
    "callingLinePresentationBit",
    "callingNamePresentationBit",
    "connectedLinePresentationBit",
    "connectedNamePresentationBit",
    "patternPrecedence",
    "provideOutsideDialtone",
    "callingPartyNumberingPlan",
    "callingPartyNumberType",
    "calledPartyNumberingPlan",
    "calledPartyNumberType",
    "callingSearchSpaceName",
    "resourcePriorityNamespaceName",
    "routeNextHopByCgpn",
    "routeClass",
    "callInterceptProfileName",
    "releaseClause",
    "useOriginatorCss",
    "dontWaitForIDTOnSubsequentHops",
    "isEmergencyServiceNumber"
})
public class UpdateTransPatternReq
    extends APIRequest
{

    protected String uuid;
    protected String pattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    @XmlElementRef(name = "dialPlanName", type = JAXBElement.class)
    protected JAXBElement<XFkType> dialPlanName;
    @XmlElementRef(name = "routeFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routeFilterName;
    protected String newPattern;
    protected String description;
    @XmlElementRef(name = "newRoutePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRoutePartitionName;
    protected String blockEnable;
    @XmlElementRef(name = "calledPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyTransformationMask;
    @XmlElementRef(name = "callingPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyTransformationMask;
    @XmlElement(defaultValue = "Default")
    protected String useCallingPartyPhoneMask;
    @XmlElementRef(name = "callingPartyPrefixDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyPrefixDigits;
    @XmlElementRef(name = "newDialPlanName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newDialPlanName;
    @XmlElementRef(name = "digitDiscardInstructionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> digitDiscardInstructionName;
    protected String patternUrgency;
    @XmlElementRef(name = "prefixDigitsOut", type = JAXBElement.class)
    protected JAXBElement<String> prefixDigitsOut;
    @XmlElementRef(name = "newRouteFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRouteFilterName;
    @XmlElement(defaultValue = "Default")
    protected String callingLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String callingNamePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedNamePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String patternPrecedence;
    @XmlElement(defaultValue = "true")
    protected String provideOutsideDialtone;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberType;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberType;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "resourcePriorityNamespaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> resourcePriorityNamespaceName;
    @XmlElement(defaultValue = "false")
    protected String routeNextHopByCgpn;
    @XmlElement(defaultValue = "Default")
    protected String routeClass;
    @XmlElementRef(name = "callInterceptProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callInterceptProfileName;
    @XmlElement(defaultValue = "No Error")
    protected String releaseClause;
    @XmlElement(defaultValue = "false")
    protected String useOriginatorCss;
    @XmlElement(defaultValue = "false")
    protected String dontWaitForIDTOnSubsequentHops;
    @XmlElement(defaultValue = "false")
    protected String isEmergencyServiceNumber;

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
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDialPlanName(JAXBElement<XFkType> value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the routeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRouteFilterName() {
        return routeFilterName;
    }

    /**
     * Sets the value of the routeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRouteFilterName(JAXBElement<XFkType> value) {
        this.routeFilterName = value;
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
     * Gets the value of the calledPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyTransformationMask() {
        return calledPartyTransformationMask;
    }

    /**
     * Sets the value of the calledPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyTransformationMask(JAXBElement<String> value) {
        this.calledPartyTransformationMask = value;
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
     * Gets the value of the newDialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewDialPlanName() {
        return newDialPlanName;
    }

    /**
     * Sets the value of the newDialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewDialPlanName(JAXBElement<XFkType> value) {
        this.newDialPlanName = value;
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDigitDiscardInstructionName(JAXBElement<XFkType> value) {
        this.digitDiscardInstructionName = value;
    }

    /**
     * Gets the value of the patternUrgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternUrgency() {
        return patternUrgency;
    }

    /**
     * Sets the value of the patternUrgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternUrgency(String value) {
        this.patternUrgency = value;
    }

    /**
     * Gets the value of the prefixDigitsOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefixDigitsOut() {
        return prefixDigitsOut;
    }

    /**
     * Sets the value of the prefixDigitsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefixDigitsOut(JAXBElement<String> value) {
        this.prefixDigitsOut = value;
    }

    /**
     * Gets the value of the newRouteFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewRouteFilterName() {
        return newRouteFilterName;
    }

    /**
     * Sets the value of the newRouteFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewRouteFilterName(JAXBElement<XFkType> value) {
        this.newRouteFilterName = value;
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
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPrecedence(String value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the provideOutsideDialtone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideOutsideDialtone() {
        return provideOutsideDialtone;
    }

    /**
     * Sets the value of the provideOutsideDialtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideOutsideDialtone(String value) {
        this.provideOutsideDialtone = value;
    }

    /**
     * Gets the value of the callingPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberingPlan() {
        return callingPartyNumberingPlan;
    }

    /**
     * Sets the value of the callingPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberingPlan(String value) {
        this.callingPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the callingPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberType() {
        return callingPartyNumberType;
    }

    /**
     * Sets the value of the callingPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberType(String value) {
        this.callingPartyNumberType = value;
    }

    /**
     * Gets the value of the calledPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberingPlan() {
        return calledPartyNumberingPlan;
    }

    /**
     * Sets the value of the calledPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberingPlan(String value) {
        this.calledPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the calledPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberType() {
        return calledPartyNumberType;
    }

    /**
     * Sets the value of the calledPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberType(String value) {
        this.calledPartyNumberType = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getResourcePriorityNamespaceName() {
        return resourcePriorityNamespaceName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setResourcePriorityNamespaceName(JAXBElement<XFkType> value) {
        this.resourcePriorityNamespaceName = value;
    }

    /**
     * Gets the value of the routeNextHopByCgpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNextHopByCgpn() {
        return routeNextHopByCgpn;
    }

    /**
     * Sets the value of the routeNextHopByCgpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNextHopByCgpn(String value) {
        this.routeNextHopByCgpn = value;
    }

    /**
     * Gets the value of the routeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteClass() {
        return routeClass;
    }

    /**
     * Sets the value of the routeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteClass(String value) {
        this.routeClass = value;
    }

    /**
     * Gets the value of the callInterceptProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallInterceptProfileName() {
        return callInterceptProfileName;
    }

    /**
     * Sets the value of the callInterceptProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallInterceptProfileName(JAXBElement<XFkType> value) {
        this.callInterceptProfileName = value;
    }

    /**
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseClause(String value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the useOriginatorCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseOriginatorCss() {
        return useOriginatorCss;
    }

    /**
     * Sets the value of the useOriginatorCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseOriginatorCss(String value) {
        this.useOriginatorCss = value;
    }

    /**
     * Gets the value of the dontWaitForIDTOnSubsequentHops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontWaitForIDTOnSubsequentHops() {
        return dontWaitForIDTOnSubsequentHops;
    }

    /**
     * Sets the value of the dontWaitForIDTOnSubsequentHops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontWaitForIDTOnSubsequentHops(String value) {
        this.dontWaitForIDTOnSubsequentHops = value;
    }

    /**
     * Gets the value of the isEmergencyServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEmergencyServiceNumber() {
        return isEmergencyServiceNumber;
    }

    /**
     * Sets the value of the isEmergencyServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEmergencyServiceNumber(String value) {
        this.isEmergencyServiceNumber = value;
    }

}
