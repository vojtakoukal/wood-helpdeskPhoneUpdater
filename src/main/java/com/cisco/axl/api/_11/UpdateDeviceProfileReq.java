
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDeviceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDeviceProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/11.5}UniqueString128" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/11.5}XMOHAudioSourceId" minOccurs="0"/&gt;
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/11.5}XVendorConfig" minOccurs="0"/&gt;
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/11.5}XPreemption" minOccurs="0"/&gt;
 *         &lt;element name="lines" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="line" type="{http://www.cisco.com/AXL/API/11.5}XPhoneLine" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/11.5}XNumplanIdentifier" maxOccurs="unbounded"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="speeddials" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/11.5}XSpeeddial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="busyLampFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/11.5}XBusyLampField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="blfDirectedCallParks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/11.5}XBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addOnModules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/11.5}XAddOnModule" maxOccurs="2" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/11.5}XUserLocale" minOccurs="0"/&gt;
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/11.5}XBarge" minOccurs="0"/&gt;
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="loginUserId" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/11.5}XDNDOption" minOccurs="0"/&gt;
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/11.5}XRingSetting" minOccurs="0"/&gt;
 *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="emccCallingSearchSpace" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="services" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/11.5}XSubscribedService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDeviceProfileReq", propOrder = {
    "newName",
    "description",
    "userHoldMohAudioSourceId",
    "vendorConfig",
    "mlppDomainId",
    "mlppIndicationStatus",
    "preemption",
    "lines",
    "phoneTemplateName",
    "speeddials",
    "busyLampFields",
    "blfDirectedCallParks",
    "addOnModules",
    "userLocale",
    "singleButtonBarge",
    "joinAcrossLines",
    "loginUserId",
    "ignorePresentationIndicators",
    "dndOption",
    "dndRingSetting",
    "dndStatus",
    "emccCallingSearchSpace",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "softkeyTemplateName",
    "callInfoPrivacyStatus",
    "services",
    "featureControlPolicy"
})
public class UpdateDeviceProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    protected XVendorConfig vendorConfig;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<String> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    protected UpdateDeviceProfileReq.Lines lines;
    @XmlElementRef(name = "phoneTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> phoneTemplateName;
    protected UpdateDeviceProfileReq.Speeddials speeddials;
    protected UpdateDeviceProfileReq.BusyLampFields busyLampFields;
    protected UpdateDeviceProfileReq.BlfDirectedCallParks blfDirectedCallParks;
    protected UpdateDeviceProfileReq.AddOnModules addOnModules;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    @XmlElement(defaultValue = "Default")
    protected String singleButtonBarge;
    @XmlElement(defaultValue = "Default")
    protected String joinAcrossLines;
    @XmlElementRef(name = "loginUserId", type = JAXBElement.class)
    protected JAXBElement<XFkType> loginUserId;
    @XmlElement(defaultValue = "false")
    protected String ignorePresentationIndicators;
    @XmlElement(defaultValue = "Ringer Off")
    protected String dndOption;
    @XmlElementRef(name = "dndRingSetting", type = JAXBElement.class)
    protected JAXBElement<String> dndRingSetting;
    protected String dndStatus;
    @XmlElementRef(name = "emccCallingSearchSpace", type = JAXBElement.class)
    protected JAXBElement<XFkType> emccCallingSearchSpace;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLine;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLineForVoiceMessage;
    @XmlElementRef(name = "softkeyTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> softkeyTemplateName;
    @XmlElement(defaultValue = "Default")
    protected String callInfoPrivacyStatus;
    protected UpdateDeviceProfileReq.Services services;
    @XmlElementRef(name = "featureControlPolicy", type = JAXBElement.class)
    protected JAXBElement<XFkType> featureControlPolicy;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHoldMohAudioSourceId(JAXBElement<String> value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
    }

    /**
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppDomainId(JAXBElement<String> value) {
        this.mlppDomainId = value;
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.Lines }
     *     
     */
    public UpdateDeviceProfileReq.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.Lines }
     *     
     */
    public void setLines(UpdateDeviceProfileReq.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPhoneTemplateName(JAXBElement<XFkType> value) {
        this.phoneTemplateName = value;
    }

    /**
     * Gets the value of the speeddials property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.Speeddials }
     *     
     */
    public UpdateDeviceProfileReq.Speeddials getSpeeddials() {
        return speeddials;
    }

    /**
     * Sets the value of the speeddials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.Speeddials }
     *     
     */
    public void setSpeeddials(UpdateDeviceProfileReq.Speeddials value) {
        this.speeddials = value;
    }

    /**
     * Gets the value of the busyLampFields property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.BusyLampFields }
     *     
     */
    public UpdateDeviceProfileReq.BusyLampFields getBusyLampFields() {
        return busyLampFields;
    }

    /**
     * Sets the value of the busyLampFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.BusyLampFields }
     *     
     */
    public void setBusyLampFields(UpdateDeviceProfileReq.BusyLampFields value) {
        this.busyLampFields = value;
    }

    /**
     * Gets the value of the blfDirectedCallParks property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.BlfDirectedCallParks }
     *     
     */
    public UpdateDeviceProfileReq.BlfDirectedCallParks getBlfDirectedCallParks() {
        return blfDirectedCallParks;
    }

    /**
     * Sets the value of the blfDirectedCallParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.BlfDirectedCallParks }
     *     
     */
    public void setBlfDirectedCallParks(UpdateDeviceProfileReq.BlfDirectedCallParks value) {
        this.blfDirectedCallParks = value;
    }

    /**
     * Gets the value of the addOnModules property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.AddOnModules }
     *     
     */
    public UpdateDeviceProfileReq.AddOnModules getAddOnModules() {
        return addOnModules;
    }

    /**
     * Sets the value of the addOnModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.AddOnModules }
     *     
     */
    public void setAddOnModules(UpdateDeviceProfileReq.AddOnModules value) {
        this.addOnModules = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocale(JAXBElement<String> value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the singleButtonBarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleButtonBarge() {
        return singleButtonBarge;
    }

    /**
     * Sets the value of the singleButtonBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleButtonBarge(String value) {
        this.singleButtonBarge = value;
    }

    /**
     * Gets the value of the joinAcrossLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinAcrossLines() {
        return joinAcrossLines;
    }

    /**
     * Sets the value of the joinAcrossLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinAcrossLines(String value) {
        this.joinAcrossLines = value;
    }

    /**
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLoginUserId(JAXBElement<XFkType> value) {
        this.loginUserId = value;
    }

    /**
     * Gets the value of the ignorePresentationIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnorePresentationIndicators() {
        return ignorePresentationIndicators;
    }

    /**
     * Sets the value of the ignorePresentationIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnorePresentationIndicators(String value) {
        this.ignorePresentationIndicators = value;
    }

    /**
     * Gets the value of the dndOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndOption() {
        return dndOption;
    }

    /**
     * Sets the value of the dndOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndOption(String value) {
        this.dndOption = value;
    }

    /**
     * Gets the value of the dndRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDndRingSetting(JAXBElement<String> value) {
        this.dndRingSetting = value;
    }

    /**
     * Gets the value of the dndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndStatus() {
        return dndStatus;
    }

    /**
     * Sets the value of the dndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndStatus(String value) {
        this.dndStatus = value;
    }

    /**
     * Gets the value of the emccCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getEmccCallingSearchSpace() {
        return emccCallingSearchSpace;
    }

    /**
     * Sets the value of the emccCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setEmccCallingSearchSpace(JAXBElement<XFkType> value) {
        this.emccCallingSearchSpace = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLine() {
        return alwaysUsePrimeLine;
    }

    /**
     * Sets the value of the alwaysUsePrimeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLine(String value) {
        this.alwaysUsePrimeLine = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLineForVoiceMessage() {
        return alwaysUsePrimeLineForVoiceMessage;
    }

    /**
     * Sets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLineForVoiceMessage(String value) {
        this.alwaysUsePrimeLineForVoiceMessage = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSoftkeyTemplateName(JAXBElement<XFkType> value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the callInfoPrivacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallInfoPrivacyStatus() {
        return callInfoPrivacyStatus;
    }

    /**
     * Sets the value of the callInfoPrivacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallInfoPrivacyStatus(String value) {
        this.callInfoPrivacyStatus = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDeviceProfileReq.Services }
     *     
     */
    public UpdateDeviceProfileReq.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDeviceProfileReq.Services }
     *     
     */
    public void setServices(UpdateDeviceProfileReq.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setFeatureControlPolicy(JAXBElement<XFkType> value) {
        this.featureControlPolicy = value;
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
     *         &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/11.5}XAddOnModule" maxOccurs="2" minOccurs="0"/&gt;
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
        "addOnModule"
    })
    public static class AddOnModules {

        protected List<XAddOnModule> addOnModule;

        /**
         * Gets the value of the addOnModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOnModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOnModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAddOnModule }
         * 
         * 
         */
        public List<XAddOnModule> getAddOnModule() {
            if (addOnModule == null) {
                addOnModule = new ArrayList<XAddOnModule>();
            }
            return this.addOnModule;
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
     *         &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/11.5}XBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "blfDirectedCallPark"
    })
    public static class BlfDirectedCallParks {

        protected List<XBLFDirectedCallPark> blfDirectedCallPark;

        /**
         * Gets the value of the blfDirectedCallPark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blfDirectedCallPark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlfDirectedCallPark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XBLFDirectedCallPark }
         * 
         * 
         */
        public List<XBLFDirectedCallPark> getBlfDirectedCallPark() {
            if (blfDirectedCallPark == null) {
                blfDirectedCallPark = new ArrayList<XBLFDirectedCallPark>();
            }
            return this.blfDirectedCallPark;
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
     *         &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/11.5}XBusyLampField" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "busyLampField"
    })
    public static class BusyLampFields {

        protected List<XBusyLampField> busyLampField;

        /**
         * Gets the value of the busyLampField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the busyLampField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusyLampField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XBusyLampField }
         * 
         * 
         */
        public List<XBusyLampField> getBusyLampField() {
            if (busyLampField == null) {
                busyLampField = new ArrayList<XBusyLampField>();
            }
            return this.busyLampField;
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
     *       &lt;choice&gt;
     *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/11.5}XPhoneLine" maxOccurs="unbounded"/&gt;
     *         &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/11.5}XNumplanIdentifier" maxOccurs="unbounded"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line",
        "lineIdentifier"
    })
    public static class Lines {

        protected List<XPhoneLine> line;
        protected List<XNumplanIdentifier> lineIdentifier;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPhoneLine }
         * 
         * 
         */
        public List<XPhoneLine> getLine() {
            if (line == null) {
                line = new ArrayList<XPhoneLine>();
            }
            return this.line;
        }

        /**
         * Gets the value of the lineIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XNumplanIdentifier }
         * 
         * 
         */
        public List<XNumplanIdentifier> getLineIdentifier() {
            if (lineIdentifier == null) {
                lineIdentifier = new ArrayList<XNumplanIdentifier>();
            }
            return this.lineIdentifier;
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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/11.5}XSubscribedService" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "service"
    })
    public static class Services {

        protected List<XSubscribedService> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSubscribedService }
         * 
         * 
         */
        public List<XSubscribedService> getService() {
            if (service == null) {
                service = new ArrayList<XSubscribedService>();
            }
            return this.service;
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
     *         &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/11.5}XSpeeddial" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "speeddial"
    })
    public static class Speeddials {

        protected List<XSpeeddial> speeddial;

        /**
         * Gets the value of the speeddial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the speeddial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpeeddial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSpeeddial }
         * 
         * 
         */
        public List<XSpeeddial> getSpeeddial() {
            if (speeddial == null) {
                speeddial = new ArrayList<XSpeeddial>();
            }
            return this.speeddial;
        }

    }

}
