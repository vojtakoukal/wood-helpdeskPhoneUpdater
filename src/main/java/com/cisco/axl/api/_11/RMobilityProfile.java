
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMobilityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMobilityProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileClientCallingOption" type="{http://www.cisco.com/AXL/API/11.5}XDialViaOffice" minOccurs="0"/&gt;
 *         &lt;element name="dvofServiceAccessNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/11.5}RDirn" minOccurs="0"/&gt;
 *         &lt;element name="dvorCallerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RMobilityProfile", propOrder = {
    "name",
    "description",
    "mobileClientCallingOption",
    "dvofServiceAccessNumber",
    "dirn",
    "dvorCallerId"
})
public class RMobilityProfile {

    protected String name;
    protected String description;
    protected String mobileClientCallingOption;
    protected String dvofServiceAccessNumber;
    protected RDirn dirn;
    protected String dvorCallerId;
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
     * Gets the value of the mobileClientCallingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileClientCallingOption() {
        return mobileClientCallingOption;
    }

    /**
     * Sets the value of the mobileClientCallingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileClientCallingOption(String value) {
        this.mobileClientCallingOption = value;
    }

    /**
     * Gets the value of the dvofServiceAccessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvofServiceAccessNumber() {
        return dvofServiceAccessNumber;
    }

    /**
     * Sets the value of the dvofServiceAccessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvofServiceAccessNumber(String value) {
        this.dvofServiceAccessNumber = value;
    }

    /**
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link RDirn }
     *     
     */
    public RDirn getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDirn }
     *     
     */
    public void setDirn(RDirn value) {
        this.dirn = value;
    }

    /**
     * Gets the value of the dvorCallerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvorCallerId() {
        return dvorCallerId;
    }

    /**
     * Sets the value of the dvorCallerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvorCallerId(String value) {
        this.dvorCallerId = value;
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

}
