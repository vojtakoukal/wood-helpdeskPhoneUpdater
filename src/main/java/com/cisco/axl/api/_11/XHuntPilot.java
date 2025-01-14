
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XHuntPilot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XHuntPilot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="blockEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="calledPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/11.5}XStatus"/&gt;
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="patternUrgency" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="prefixDigitsOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
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
 *         &lt;element name="huntListName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="parkMonForwardNoRetrieve" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="destination" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alertingName" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="asciiAlertingName" type="{http://www.cisco.com/AXL/API/11.5}String32" minOccurs="0"/&gt;
 *         &lt;element name="e164Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="forwardHuntNoAnswer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="forwardHuntBusy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="maxHuntduration" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/11.5}XReleaseCauseValue" minOccurs="0"/&gt;
 *         &lt;element name="displayConnectedNumber" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="queueCalls" type="{http://www.cisco.com/AXL/API/11.5}XCallsQueue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XHuntPilot", propOrder = {
    "pattern",
    "description",
    "routePartitionName",
    "blockEnable",
    "calledPartyTransformationMask",
    "callingPartyTransformationMask",
    "useCallingPartyPhoneMask",
    "callingPartyPrefixDigits",
    "dialPlanName",
    "digitDiscardInstructionName",
    "patternUrgency",
    "prefixDigitsOut",
    "routeFilterName",
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
    "huntListName",
    "parkMonForwardNoRetrieve",
    "alertingName",
    "asciiAlertingName",
    "e164Mask",
    "aarNeighborhoodName",
    "forwardHuntNoAnswer",
    "forwardHuntBusy",
    "callPickupGroupName",
    "maxHuntduration",
    "releaseClause",
    "displayConnectedNumber",
    "queueCalls"
})
public class XHuntPilot {

    protected String pattern;
    protected String description;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected String blockEnable;
    @XmlElementRef(name = "calledPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyTransformationMask;
    @XmlElementRef(name = "callingPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyTransformationMask;
    @XmlElement(defaultValue = "Default")
    protected String useCallingPartyPhoneMask;
    @XmlElementRef(name = "callingPartyPrefixDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyPrefixDigits;
    @XmlElementRef(name = "dialPlanName", type = JAXBElement.class)
    protected JAXBElement<XFkType> dialPlanName;
    @XmlElementRef(name = "digitDiscardInstructionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> digitDiscardInstructionName;
    protected String patternUrgency;
    @XmlElementRef(name = "prefixDigitsOut", type = JAXBElement.class)
    protected JAXBElement<String> prefixDigitsOut;
    @XmlElementRef(name = "routeFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routeFilterName;
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
    protected XFkType huntListName;
    protected XHuntPilot.ParkMonForwardNoRetrieve parkMonForwardNoRetrieve;
    protected String alertingName;
    protected String asciiAlertingName;
    @XmlElementRef(name = "e164Mask", type = JAXBElement.class)
    protected JAXBElement<String> e164Mask;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    protected XHuntPilot.ForwardHuntNoAnswer forwardHuntNoAnswer;
    protected XHuntPilot.ForwardHuntBusy forwardHuntBusy;
    protected XFkType callPickupGroupName;
    @XmlElementRef(name = "maxHuntduration", type = JAXBElement.class)
    protected JAXBElement<String> maxHuntduration;
    @XmlElement(defaultValue = "No Error")
    protected String releaseClause;
    @XmlElement(defaultValue = "false")
    protected String displayConnectedNumber;
    protected XCallsQueue queueCalls;

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
     * Gets the value of the huntListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHuntListName() {
        return huntListName;
    }

    /**
     * Sets the value of the huntListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHuntListName(XFkType value) {
        this.huntListName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntPilot.ParkMonForwardNoRetrieve }
     *     
     */
    public XHuntPilot.ParkMonForwardNoRetrieve getParkMonForwardNoRetrieve() {
        return parkMonForwardNoRetrieve;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntPilot.ParkMonForwardNoRetrieve }
     *     
     */
    public void setParkMonForwardNoRetrieve(XHuntPilot.ParkMonForwardNoRetrieve value) {
        this.parkMonForwardNoRetrieve = value;
    }

    /**
     * Gets the value of the alertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingName() {
        return alertingName;
    }

    /**
     * Sets the value of the alertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingName(String value) {
        this.alertingName = value;
    }

    /**
     * Gets the value of the asciiAlertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiAlertingName() {
        return asciiAlertingName;
    }

    /**
     * Sets the value of the asciiAlertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiAlertingName(String value) {
        this.asciiAlertingName = value;
    }

    /**
     * Gets the value of the e164Mask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getE164Mask() {
        return e164Mask;
    }

    /**
     * Sets the value of the e164Mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setE164Mask(JAXBElement<String> value) {
        this.e164Mask = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAarNeighborhoodName(JAXBElement<XFkType> value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the forwardHuntNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntPilot.ForwardHuntNoAnswer }
     *     
     */
    public XHuntPilot.ForwardHuntNoAnswer getForwardHuntNoAnswer() {
        return forwardHuntNoAnswer;
    }

    /**
     * Sets the value of the forwardHuntNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntPilot.ForwardHuntNoAnswer }
     *     
     */
    public void setForwardHuntNoAnswer(XHuntPilot.ForwardHuntNoAnswer value) {
        this.forwardHuntNoAnswer = value;
    }

    /**
     * Gets the value of the forwardHuntBusy property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntPilot.ForwardHuntBusy }
     *     
     */
    public XHuntPilot.ForwardHuntBusy getForwardHuntBusy() {
        return forwardHuntBusy;
    }

    /**
     * Sets the value of the forwardHuntBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntPilot.ForwardHuntBusy }
     *     
     */
    public void setForwardHuntBusy(XHuntPilot.ForwardHuntBusy value) {
        this.forwardHuntBusy = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallPickupGroupName(XFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the maxHuntduration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxHuntduration() {
        return maxHuntduration;
    }

    /**
     * Sets the value of the maxHuntduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxHuntduration(JAXBElement<String> value) {
        this.maxHuntduration = value;
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
     * Gets the value of the displayConnectedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayConnectedNumber() {
        return displayConnectedNumber;
    }

    /**
     * Sets the value of the displayConnectedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayConnectedNumber(String value) {
        this.displayConnectedNumber = value;
    }

    /**
     * Gets the value of the queueCalls property.
     * 
     * @return
     *     possible object is
     *     {@link XCallsQueue }
     *     
     */
    public XCallsQueue getQueueCalls() {
        return queueCalls;
    }

    /**
     * Sets the value of the queueCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallsQueue }
     *     
     */
    public void setQueueCalls(XCallsQueue value) {
        this.queueCalls = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ForwardHuntBusy {

        @XmlElement(defaultValue = "false")
        protected String usePersonalPreferences;
        @XmlElementRef(name = "destination", type = JAXBElement.class)
        protected JAXBElement<String> destination;
        @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
        protected JAXBElement<XFkType> callingSearchSpaceName;

        /**
         * Gets the value of the usePersonalPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsePersonalPreferences() {
            return usePersonalPreferences;
        }

        /**
         * Sets the value of the usePersonalPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsePersonalPreferences(String value) {
            this.usePersonalPreferences = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDestination(JAXBElement<String> value) {
            this.destination = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ForwardHuntNoAnswer {

        @XmlElement(defaultValue = "false")
        protected String usePersonalPreferences;
        @XmlElementRef(name = "destination", type = JAXBElement.class)
        protected JAXBElement<String> destination;
        @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
        protected JAXBElement<XFkType> callingSearchSpaceName;

        /**
         * Gets the value of the usePersonalPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsePersonalPreferences() {
            return usePersonalPreferences;
        }

        /**
         * Sets the value of the usePersonalPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsePersonalPreferences(String value) {
            this.usePersonalPreferences = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDestination(JAXBElement<String> value) {
            this.destination = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
     *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ParkMonForwardNoRetrieve {

        @XmlElement(defaultValue = "false")
        protected String usePersonalPreferences;
        @XmlElementRef(name = "destination", type = JAXBElement.class)
        protected JAXBElement<String> destination;
        @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
        protected JAXBElement<XFkType> callingSearchSpaceName;

        /**
         * Gets the value of the usePersonalPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsePersonalPreferences() {
            return usePersonalPreferences;
        }

        /**
         * Sets the value of the usePersonalPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsePersonalPreferences(String value) {
            this.usePersonalPreferences = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDestination(JAXBElement<String> value) {
            this.destination = value;
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

    }

}
