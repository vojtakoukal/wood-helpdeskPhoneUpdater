
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
 * <p>Java class for XCallPickupGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCallPickupGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="members" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pickupNotification" type="{http://www.cisco.com/AXL/API/11.5}XPickupNotification" minOccurs="0"/&gt;
 *         &lt;element name="pickupNotificationTimer" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="callInfoForPickupNotification" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCallPickupGroup", propOrder = {
    "pattern",
    "description",
    "routePartitionName",
    "members",
    "pickupNotification",
    "pickupNotificationTimer",
    "callInfoForPickupNotification",
    "name"
})
public class XCallPickupGroup {

    protected String pattern;
    protected String description;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected XCallPickupGroup.Members members;
    @XmlElement(defaultValue = "No Alert")
    protected String pickupNotification;
    @XmlElement(defaultValue = "6")
    protected String pickupNotificationTimer;
    protected XCallPickupGroup.CallInfoForPickupNotification callInfoForPickupNotification;
    protected String name;

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
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XCallPickupGroup.Members }
     *     
     */
    public XCallPickupGroup.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallPickupGroup.Members }
     *     
     */
    public void setMembers(XCallPickupGroup.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the pickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotification() {
        return pickupNotification;
    }

    /**
     * Sets the value of the pickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotification(String value) {
        this.pickupNotification = value;
    }

    /**
     * Gets the value of the pickupNotificationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotificationTimer() {
        return pickupNotificationTimer;
    }

    /**
     * Sets the value of the pickupNotificationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotificationTimer(String value) {
        this.pickupNotificationTimer = value;
    }

    /**
     * Gets the value of the callInfoForPickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link XCallPickupGroup.CallInfoForPickupNotification }
     *     
     */
    public XCallPickupGroup.CallInfoForPickupNotification getCallInfoForPickupNotification() {
        return callInfoForPickupNotification;
    }

    /**
     * Sets the value of the callInfoForPickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallPickupGroup.CallInfoForPickupNotification }
     *     
     */
    public void setCallInfoForPickupNotification(XCallPickupGroup.CallInfoForPickupNotification value) {
        this.callInfoForPickupNotification = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
     *         &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
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
        "callingPartyInfo",
        "calledPartyInfo"
    })
    public static class CallInfoForPickupNotification {

        @XmlElement(defaultValue = "false")
        protected String callingPartyInfo;
        @XmlElement(defaultValue = "false")
        protected String calledPartyInfo;

        /**
         * Gets the value of the callingPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallingPartyInfo() {
            return callingPartyInfo;
        }

        /**
         * Sets the value of the callingPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallingPartyInfo(String value) {
            this.callingPartyInfo = value;
        }

        /**
         * Gets the value of the calledPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalledPartyInfo() {
            return calledPartyInfo;
        }

        /**
         * Sets the value of the calledPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalledPartyInfo(String value) {
            this.calledPartyInfo = value;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "member"
    })
    public static class Members
        extends XCommonMembersExtension
    {

        protected List<XPickupGroupMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPickupGroupMember }
         * 
         * 
         */
        public List<XPickupGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XPickupGroupMember>();
            }
            return this.member;
        }

    }

}
