
package com.cisco.axl.api._11;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for XGatewayEndpointDigitalBri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewayEndpointDigitalBri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}UniqueString128"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/11.5}XProduct"/&gt;
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/11.5}XClass"/&gt;
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/11.5}XDeviceProtocol"/&gt;
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/11.5}XProtocolSide"/&gt;
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/11.5}XNetworkLocation" minOccurs="0"/&gt;
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/11.5}XCountry" minOccurs="0"/&gt;
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/11.5}XVendorConfig" minOccurs="0"/&gt;
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="redirectInboundNumberIe" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="briProtocol" type="{http://www.cisco.com/AXL/API/11.5}XBriProtocol"/&gt;
 *         &lt;element name="calledPlan" type="{http://www.cisco.com/AXL/API/11.5}XNumberingPlan"/&gt;
 *         &lt;element name="calledPri" type="{http://www.cisco.com/AXL/API/11.5}XPriOfNumber"/&gt;
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/11.5}String255"/&gt;
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/11.5}XCallingPartySelection"/&gt;
 *         &lt;element name="callingPlan" type="{http://www.cisco.com/AXL/API/11.5}XNumberingPlan"/&gt;
 *         &lt;element name="callingPri" type="{http://www.cisco.com/AXL/API/11.5}XPriOfNumber"/&gt;
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/11.5}XClockReference"/&gt;
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/11.5}XCSUParam"/&gt;
 *         &lt;element name="dChannelEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="channelSelectionOrder" type="{http://www.cisco.com/AXL/API/11.5}XTrunkSelectionOrder"/&gt;
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/11.5}XEncode"/&gt;
 *         &lt;element name="firstDelay" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="intraDelay" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="redirectOutboundNumberIe" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="numDigitsToStrip" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="presentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit"/&gt;
 *         &lt;element name="sendRestart" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="setupNonIsdnPi" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="sigDigits"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;nonNegativeInteger"&gt;
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="statusPoll" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/11.5}XPacketCaptureMode" minOccurs="0"/&gt;
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="nationalStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="internationalStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="unknownStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="subscriberStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="nationalTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="internationalTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="unknownTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="subscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCgpnTransformCssNatl" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCgpnTransformCssIntl" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCgpnTransformCssUnkn" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCgpnTransformCssSubs" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GClearEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="calledPartyNationalPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyInternationalPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyUnknownPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="calledPartySubscriberPrefix" type="{http://www.cisco.com/AXL/API/11.5}String16" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyNationalStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyInternationalStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyUnknownStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="calledPartySubscriberStripDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyNationalTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyInternationalTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="calledPartyUnknownTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="calledPartySubscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCalledCssNatl" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCalledCssIntl" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCalledCssUnkn" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDevicePoolCalledCssSubs" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="connectCallBeforePlayingAnnouncement" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatewayEndpointDigitalBri", propOrder = {
    "index",
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "networkLocale",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "vendorConfig",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "redirectInboundNumberIe",
    "briProtocol",
    "calledPlan",
    "calledPri",
    "callerIdDn",
    "callingPartySelection",
    "callingPlan",
    "callingPri",
    "clockReference",
    "csuParam",
    "dChannelEnable",
    "channelSelectionOrder",
    "pcmType",
    "firstDelay",
    "intraDelay",
    "redirectOutboundNumberIe",
    "numDigitsToStrip",
    "prefix",
    "presentationBit",
    "sendRestart",
    "setupNonIsdnPi",
    "sigDigits",
    "statusPoll",
    "packetCaptureMode",
    "packetCaptureDuration",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "geoLocationFilterName",
    "nationalPrefix",
    "internationalPrefix",
    "unknownPrefix",
    "subscriberPrefix",
    "nationalStripDigits",
    "internationalStripDigits",
    "unknownStripDigits",
    "subscriberStripDigits",
    "nationalTransformationCssName",
    "internationalTransformationCssName",
    "unknownTransformationCssName",
    "subscriberTransformationCssName",
    "pstnAccess",
    "imeE164TransformationName",
    "useDevicePoolCgpnTransformCssNatl",
    "useDevicePoolCgpnTransformCssIntl",
    "useDevicePoolCgpnTransformCssUnkn",
    "useDevicePoolCgpnTransformCssSubs",
    "gClearEnable",
    "calledPartyNationalPrefix",
    "calledPartyInternationalPrefix",
    "calledPartyUnknownPrefix",
    "calledPartySubscriberPrefix",
    "calledPartyNationalStripDigits",
    "calledPartyInternationalStripDigits",
    "calledPartyUnknownStripDigits",
    "calledPartySubscriberStripDigits",
    "calledPartyNationalTransformationCssName",
    "calledPartyInternationalTransformationCssName",
    "calledPartyUnknownTransformationCssName",
    "calledPartySubscriberTransformationCssName",
    "useDevicePoolCalledCssNatl",
    "useDevicePoolCalledCssIntl",
    "useDevicePoolCalledCssUnkn",
    "useDevicePoolCalledCssSubs",
    "connectCallBeforePlayingAnnouncement"
})
public class XGatewayEndpointDigitalBri {

    @XmlElement(defaultValue = "0")
    protected String index;
    protected String name;
    protected String description;
    protected String product;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    @XmlElement(defaultValue = "User")
    protected String protocolSide;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class)
    protected JAXBElement<XFkType> devicePoolName;
    @XmlElementRef(name = "commonDeviceConfigName", type = JAXBElement.class)
    protected JAXBElement<XFkType> commonDeviceConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    protected XVendorConfig vendorConfig;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    protected String redirectInboundNumberIe;
    protected String briProtocol;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPri;
    @XmlElementRef(name = "callerIdDn", type = JAXBElement.class)
    protected JAXBElement<String> callerIdDn;
    protected String callingPartySelection;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPri;
    protected String clockReference;
    protected String csuParam;
    protected String dChannelEnable;
    @XmlElement(defaultValue = "Top Down")
    protected String channelSelectionOrder;
    protected String pcmType;
    protected String firstDelay;
    protected String intraDelay;
    protected String redirectOutboundNumberIe;
    protected String numDigitsToStrip;
    @XmlElementRef(name = "prefix", type = JAXBElement.class)
    protected JAXBElement<String> prefix;
    protected String presentationBit;
    protected String sendRestart;
    protected String setupNonIsdnPi;
    protected XGatewayEndpointDigitalBri.SigDigits sigDigits;
    protected String statusPoll;
    @XmlElement(defaultValue = "None")
    protected String packetCaptureMode;
    @XmlElementRef(name = "packetCaptureDuration", type = JAXBElement.class)
    protected JAXBElement<String> packetCaptureDuration;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCdpnTransformCss;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    @XmlElementRef(name = "nationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> nationalStripDigits;
    @XmlElementRef(name = "internationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> internationalStripDigits;
    @XmlElementRef(name = "unknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> unknownStripDigits;
    @XmlElementRef(name = "subscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> subscriberStripDigits;
    @XmlElementRef(name = "nationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> nationalTransformationCssName;
    @XmlElementRef(name = "internationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> internationalTransformationCssName;
    @XmlElementRef(name = "unknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> unknownTransformationCssName;
    @XmlElementRef(name = "subscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscriberTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String pstnAccess;
    @XmlElementRef(name = "imeE164TransformationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> imeE164TransformationName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssNatl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssIntl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssUnkn;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssSubs;
    @XmlElement(name = "GClearEnable")
    protected String gClearEnable;
    protected String calledPartyNationalPrefix;
    protected String calledPartyInternationalPrefix;
    protected String calledPartyUnknownPrefix;
    protected String calledPartySubscriberPrefix;
    @XmlElementRef(name = "calledPartyNationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyNationalStripDigits;
    @XmlElementRef(name = "calledPartyInternationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyInternationalStripDigits;
    @XmlElementRef(name = "calledPartyUnknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyUnknownStripDigits;
    @XmlElementRef(name = "calledPartySubscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartySubscriberStripDigits;
    @XmlElementRef(name = "calledPartyNationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyNationalTransformationCssName;
    @XmlElementRef(name = "calledPartyInternationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyInternationalTransformationCssName;
    @XmlElementRef(name = "calledPartyUnknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyUnknownTransformationCssName;
    @XmlElementRef(name = "calledPartySubscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartySubscriberTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssNatl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssIntl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssUnkn;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssSubs;
    protected String connectCallBeforePlayingAnnouncement;
    @XmlAttribute(name = "ctiid")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolSide(String value) {
        this.protocolSide = value;
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
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDevicePoolName(JAXBElement<XFkType> value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCommonDeviceConfigName(JAXBElement<XFkType> value) {
        this.commonDeviceConfigName = value;
    }

    /**
     * Gets the value of the networkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocation() {
        return networkLocation;
    }

    /**
     * Sets the value of the networkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocation(String value) {
        this.networkLocation = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMediaResourceListName(JAXBElement<XFkType> value) {
        this.mediaResourceListName = value;
    }

    /**
     * Gets the value of the networkLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkLocale(JAXBElement<String> value) {
        this.networkLocale = value;
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAutomatedAlternateRoutingCssName(JAXBElement<XFkType> value) {
        this.automatedAlternateRoutingCssName = value;
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
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCgpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCss() {
        return useDevicePoolCgpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCss(String value) {
        this.useDevicePoolCgpnTransformCss = value;
    }

    /**
     * Gets the value of the geoLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationName(JAXBElement<XFkType> value) {
        this.geoLocationName = value;
    }

    /**
     * Gets the value of the redirectInboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectInboundNumberIe() {
        return redirectInboundNumberIe;
    }

    /**
     * Sets the value of the redirectInboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectInboundNumberIe(String value) {
        this.redirectInboundNumberIe = value;
    }

    /**
     * Gets the value of the briProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBriProtocol() {
        return briProtocol;
    }

    /**
     * Sets the value of the briProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBriProtocol(String value) {
        this.briProtocol = value;
    }

    /**
     * Gets the value of the calledPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPlan() {
        return calledPlan;
    }

    /**
     * Sets the value of the calledPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPlan(String value) {
        this.calledPlan = value;
    }

    /**
     * Gets the value of the calledPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPri() {
        return calledPri;
    }

    /**
     * Sets the value of the calledPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPri(String value) {
        this.calledPri = value;
    }

    /**
     * Gets the value of the callerIdDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallerIdDn(JAXBElement<String> value) {
        this.callerIdDn = value;
    }

    /**
     * Gets the value of the callingPartySelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySelection() {
        return callingPartySelection;
    }

    /**
     * Sets the value of the callingPartySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySelection(String value) {
        this.callingPartySelection = value;
    }

    /**
     * Gets the value of the callingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPlan() {
        return callingPlan;
    }

    /**
     * Sets the value of the callingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPlan(String value) {
        this.callingPlan = value;
    }

    /**
     * Gets the value of the callingPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPri() {
        return callingPri;
    }

    /**
     * Sets the value of the callingPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPri(String value) {
        this.callingPri = value;
    }

    /**
     * Gets the value of the clockReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockReference() {
        return clockReference;
    }

    /**
     * Sets the value of the clockReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockReference(String value) {
        this.clockReference = value;
    }

    /**
     * Gets the value of the csuParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsuParam() {
        return csuParam;
    }

    /**
     * Sets the value of the csuParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsuParam(String value) {
        this.csuParam = value;
    }

    /**
     * Gets the value of the dChannelEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDChannelEnable() {
        return dChannelEnable;
    }

    /**
     * Sets the value of the dChannelEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDChannelEnable(String value) {
        this.dChannelEnable = value;
    }

    /**
     * Gets the value of the channelSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSelectionOrder() {
        return channelSelectionOrder;
    }

    /**
     * Sets the value of the channelSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSelectionOrder(String value) {
        this.channelSelectionOrder = value;
    }

    /**
     * Gets the value of the pcmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcmType() {
        return pcmType;
    }

    /**
     * Sets the value of the pcmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcmType(String value) {
        this.pcmType = value;
    }

    /**
     * Gets the value of the firstDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDelay() {
        return firstDelay;
    }

    /**
     * Sets the value of the firstDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDelay(String value) {
        this.firstDelay = value;
    }

    /**
     * Gets the value of the intraDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraDelay() {
        return intraDelay;
    }

    /**
     * Sets the value of the intraDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraDelay(String value) {
        this.intraDelay = value;
    }

    /**
     * Gets the value of the redirectOutboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectOutboundNumberIe() {
        return redirectOutboundNumberIe;
    }

    /**
     * Sets the value of the redirectOutboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectOutboundNumberIe(String value) {
        this.redirectOutboundNumberIe = value;
    }

    /**
     * Gets the value of the numDigitsToStrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDigitsToStrip() {
        return numDigitsToStrip;
    }

    /**
     * Sets the value of the numDigitsToStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDigitsToStrip(String value) {
        this.numDigitsToStrip = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the presentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationBit() {
        return presentationBit;
    }

    /**
     * Sets the value of the presentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationBit(String value) {
        this.presentationBit = value;
    }

    /**
     * Gets the value of the sendRestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendRestart() {
        return sendRestart;
    }

    /**
     * Sets the value of the sendRestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendRestart(String value) {
        this.sendRestart = value;
    }

    /**
     * Gets the value of the setupNonIsdnPi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupNonIsdnPi() {
        return setupNonIsdnPi;
    }

    /**
     * Sets the value of the setupNonIsdnPi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupNonIsdnPi(String value) {
        this.setupNonIsdnPi = value;
    }

    /**
     * Gets the value of the sigDigits property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalBri.SigDigits }
     *     
     */
    public XGatewayEndpointDigitalBri.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalBri.SigDigits }
     *     
     */
    public void setSigDigits(XGatewayEndpointDigitalBri.SigDigits value) {
        this.sigDigits = value;
    }

    /**
     * Gets the value of the statusPoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPoll() {
        return statusPoll;
    }

    /**
     * Sets the value of the statusPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPoll(String value) {
        this.statusPoll = value;
    }

    /**
     * Gets the value of the packetCaptureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCaptureMode() {
        return packetCaptureMode;
    }

    /**
     * Sets the value of the packetCaptureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCaptureMode(String value) {
        this.packetCaptureMode = value;
    }

    /**
     * Gets the value of the packetCaptureDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPacketCaptureDuration() {
        return packetCaptureDuration;
    }

    /**
     * Sets the value of the packetCaptureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPacketCaptureDuration(JAXBElement<String> value) {
        this.packetCaptureDuration = value;
    }

    /**
     * Gets the value of the cdpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCdpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cdpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCdpnTransformCss() {
        return useDevicePoolCdpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCdpnTransformCss(String value) {
        this.useDevicePoolCdpnTransformCss = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationFilterName(JAXBElement<XFkType> value) {
        this.geoLocationFilterName = value;
    }

    /**
     * Gets the value of the nationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Sets the value of the nationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalPrefix(String value) {
        this.nationalPrefix = value;
    }

    /**
     * Gets the value of the internationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    /**
     * Sets the value of the internationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPrefix(String value) {
        this.internationalPrefix = value;
    }

    /**
     * Gets the value of the unknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownPrefix() {
        return unknownPrefix;
    }

    /**
     * Sets the value of the unknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownPrefix(String value) {
        this.unknownPrefix = value;
    }

    /**
     * Gets the value of the subscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberPrefix() {
        return subscriberPrefix;
    }

    /**
     * Sets the value of the subscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberPrefix(String value) {
        this.subscriberPrefix = value;
    }

    /**
     * Gets the value of the nationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalStripDigits() {
        return nationalStripDigits;
    }

    /**
     * Sets the value of the nationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalStripDigits(JAXBElement<String> value) {
        this.nationalStripDigits = value;
    }

    /**
     * Gets the value of the internationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternationalStripDigits() {
        return internationalStripDigits;
    }

    /**
     * Sets the value of the internationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternationalStripDigits(JAXBElement<String> value) {
        this.internationalStripDigits = value;
    }

    /**
     * Gets the value of the unknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnknownStripDigits() {
        return unknownStripDigits;
    }

    /**
     * Sets the value of the unknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnknownStripDigits(JAXBElement<String> value) {
        this.unknownStripDigits = value;
    }

    /**
     * Gets the value of the subscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberStripDigits() {
        return subscriberStripDigits;
    }

    /**
     * Sets the value of the subscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberStripDigits(JAXBElement<String> value) {
        this.subscriberStripDigits = value;
    }

    /**
     * Gets the value of the nationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNationalTransformationCssName() {
        return nationalTransformationCssName;
    }

    /**
     * Sets the value of the nationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.nationalTransformationCssName = value;
    }

    /**
     * Gets the value of the internationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getInternationalTransformationCssName() {
        return internationalTransformationCssName;
    }

    /**
     * Sets the value of the internationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.internationalTransformationCssName = value;
    }

    /**
     * Gets the value of the unknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnknownTransformationCssName() {
        return unknownTransformationCssName;
    }

    /**
     * Sets the value of the unknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.unknownTransformationCssName = value;
    }

    /**
     * Gets the value of the subscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscriberTransformationCssName() {
        return subscriberTransformationCssName;
    }

    /**
     * Sets the value of the subscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.subscriberTransformationCssName = value;
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnAccess(String value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the imeE164TransformationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getImeE164TransformationName() {
        return imeE164TransformationName;
    }

    /**
     * Sets the value of the imeE164TransformationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setImeE164TransformationName(JAXBElement<XFkType> value) {
        this.imeE164TransformationName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssNatl() {
        return useDevicePoolCgpnTransformCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssNatl(String value) {
        this.useDevicePoolCgpnTransformCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssIntl() {
        return useDevicePoolCgpnTransformCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssIntl(String value) {
        this.useDevicePoolCgpnTransformCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssUnkn() {
        return useDevicePoolCgpnTransformCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssUnkn(String value) {
        this.useDevicePoolCgpnTransformCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssSubs() {
        return useDevicePoolCgpnTransformCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssSubs(String value) {
        this.useDevicePoolCgpnTransformCssSubs = value;
    }

    /**
     * Gets the value of the gClearEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGClearEnable() {
        return gClearEnable;
    }

    /**
     * Sets the value of the gClearEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGClearEnable(String value) {
        this.gClearEnable = value;
    }

    /**
     * Gets the value of the calledPartyNationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNationalPrefix() {
        return calledPartyNationalPrefix;
    }

    /**
     * Sets the value of the calledPartyNationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNationalPrefix(String value) {
        this.calledPartyNationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyInternationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyInternationalPrefix() {
        return calledPartyInternationalPrefix;
    }

    /**
     * Sets the value of the calledPartyInternationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyInternationalPrefix(String value) {
        this.calledPartyInternationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyUnknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyUnknownPrefix() {
        return calledPartyUnknownPrefix;
    }

    /**
     * Sets the value of the calledPartyUnknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyUnknownPrefix(String value) {
        this.calledPartyUnknownPrefix = value;
    }

    /**
     * Gets the value of the calledPartySubscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartySubscriberPrefix() {
        return calledPartySubscriberPrefix;
    }

    /**
     * Sets the value of the calledPartySubscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartySubscriberPrefix(String value) {
        this.calledPartySubscriberPrefix = value;
    }

    /**
     * Gets the value of the calledPartyNationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyNationalStripDigits() {
        return calledPartyNationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyNationalStripDigits(JAXBElement<String> value) {
        this.calledPartyNationalStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyInternationalStripDigits() {
        return calledPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyInternationalStripDigits(JAXBElement<String> value) {
        this.calledPartyInternationalStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyUnknownStripDigits() {
        return calledPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the calledPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyUnknownStripDigits(JAXBElement<String> value) {
        this.calledPartyUnknownStripDigits = value;
    }

    /**
     * Gets the value of the calledPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartySubscriberStripDigits() {
        return calledPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the calledPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartySubscriberStripDigits(JAXBElement<String> value) {
        this.calledPartySubscriberStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyNationalTransformationCssName() {
        return calledPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyNationalTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyInternationalTransformationCssName() {
        return calledPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyInternationalTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyUnknownTransformationCssName() {
        return calledPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyUnknownTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartySubscriberTransformationCssName() {
        return calledPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartySubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartySubscriberTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssNatl() {
        return useDevicePoolCalledCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssNatl(String value) {
        this.useDevicePoolCalledCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssIntl() {
        return useDevicePoolCalledCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssIntl(String value) {
        this.useDevicePoolCalledCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssUnkn() {
        return useDevicePoolCalledCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssUnkn(String value) {
        this.useDevicePoolCalledCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssSubs() {
        return useDevicePoolCalledCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssSubs(String value) {
        this.useDevicePoolCalledCssSubs = value;
    }

    /**
     * Gets the value of the connectCallBeforePlayingAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectCallBeforePlayingAnnouncement() {
        return connectCallBeforePlayingAnnouncement;
    }

    /**
     * Sets the value of the connectCallBeforePlayingAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectCallBeforePlayingAnnouncement(String value) {
        this.connectCallBeforePlayingAnnouncement = value;
    }

    /**
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;nonNegativeInteger"&gt;
     *       &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SigDigits {

        @XmlValue
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger value;
        @XmlAttribute(name = "enable")
        protected Boolean enable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

    }

}
