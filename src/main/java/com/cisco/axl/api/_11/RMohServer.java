
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMohServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMohServer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="maxUnicastConnections" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxMulticastConnections" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="fixedAudioSourceDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runFlag" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="isMultiCastEnabled" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="baseMulticastIpaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseMulticastPort" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="multicastIncrementOnIp" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="audioSources" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="audioSource" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *                             &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMohServer", propOrder = {
    "name",
    "description",
    "processNodeName",
    "devicePoolName",
    "locationName",
    "maxUnicastConnections",
    "maxMulticastConnections",
    "fixedAudioSourceDevice",
    "runFlag",
    "useTrustedRelayPoint",
    "isMultiCastEnabled",
    "baseMulticastIpaddress",
    "baseMulticastPort",
    "multicastIncrementOnIp",
    "audioSources"
})
public class RMohServer {

    protected String name;
    protected String description;
    protected XFkType processNodeName;
    protected XFkType devicePoolName;
    protected XFkType locationName;
    protected String maxUnicastConnections;
    protected String maxMulticastConnections;
    protected String fixedAudioSourceDevice;
    protected String runFlag;
    protected String useTrustedRelayPoint;
    protected String isMultiCastEnabled;
    protected String baseMulticastIpaddress;
    protected String baseMulticastPort;
    protected String multicastIncrementOnIp;
    protected RMohServer.AudioSources audioSources;
    @XmlAttribute(name = "uuid")
    protected String uuid;

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
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevicePoolName(XFkType value) {
        this.devicePoolName = value;
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
     * Gets the value of the maxUnicastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxUnicastConnections() {
        return maxUnicastConnections;
    }

    /**
     * Sets the value of the maxUnicastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxUnicastConnections(String value) {
        this.maxUnicastConnections = value;
    }

    /**
     * Gets the value of the maxMulticastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMulticastConnections() {
        return maxMulticastConnections;
    }

    /**
     * Sets the value of the maxMulticastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMulticastConnections(String value) {
        this.maxMulticastConnections = value;
    }

    /**
     * Gets the value of the fixedAudioSourceDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAudioSourceDevice() {
        return fixedAudioSourceDevice;
    }

    /**
     * Sets the value of the fixedAudioSourceDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAudioSourceDevice(String value) {
        this.fixedAudioSourceDevice = value;
    }

    /**
     * Gets the value of the runFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunFlag() {
        return runFlag;
    }

    /**
     * Sets the value of the runFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunFlag(String value) {
        this.runFlag = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the isMultiCastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiCastEnabled() {
        return isMultiCastEnabled;
    }

    /**
     * Sets the value of the isMultiCastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiCastEnabled(String value) {
        this.isMultiCastEnabled = value;
    }

    /**
     * Gets the value of the baseMulticastIpaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastIpaddress() {
        return baseMulticastIpaddress;
    }

    /**
     * Sets the value of the baseMulticastIpaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastIpaddress(String value) {
        this.baseMulticastIpaddress = value;
    }

    /**
     * Gets the value of the baseMulticastPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastPort() {
        return baseMulticastPort;
    }

    /**
     * Sets the value of the baseMulticastPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastPort(String value) {
        this.baseMulticastPort = value;
    }

    /**
     * Gets the value of the multicastIncrementOnIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastIncrementOnIp() {
        return multicastIncrementOnIp;
    }

    /**
     * Sets the value of the multicastIncrementOnIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastIncrementOnIp(String value) {
        this.multicastIncrementOnIp = value;
    }

    /**
     * Gets the value of the audioSources property.
     * 
     * @return
     *     possible object is
     *     {@link RMohServer.AudioSources }
     *     
     */
    public RMohServer.AudioSources getAudioSources() {
        return audioSources;
    }

    /**
     * Sets the value of the audioSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMohServer.AudioSources }
     *     
     */
    public void setAudioSources(RMohServer.AudioSources value) {
        this.audioSources = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="audioSource" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
     *                   &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
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
    @XmlType(name = "", propOrder = {
        "audioSource"
    })
    public static class AudioSources {

        protected List<RMohServer.AudioSources.AudioSource> audioSource;

        /**
         * Gets the value of the audioSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the audioSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAudioSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RMohServer.AudioSources.AudioSource }
         * 
         * 
         */
        public List<RMohServer.AudioSources.AudioSource> getAudioSource() {
            if (audioSource == null) {
                audioSource = new ArrayList<RMohServer.AudioSources.AudioSource>();
            }
            return this.audioSource;
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
         *         &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
         *         &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
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
            "sourceId",
            "maxHops"
        })
        public static class AudioSource {

            protected String sourceId;
            protected String maxHops;

            /**
             * Gets the value of the sourceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceId() {
                return sourceId;
            }

            /**
             * Sets the value of the sourceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceId(String value) {
                this.sourceId = value;
            }

            /**
             * Gets the value of the maxHops property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxHops() {
                return maxHops;
            }

            /**
             * Sets the value of the maxHops property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxHops(String value) {
                this.maxHops = value;
            }

        }

    }

}
