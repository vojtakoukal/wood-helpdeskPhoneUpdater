
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
 * <p>Java class for UpdateHuntListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateHuntListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callManagerGroupName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="routeListEnabled" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailUsage" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="removeMembers" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="addMembers" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="members" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHuntListReq", propOrder = {
    "description",
    "callManagerGroupName",
    "routeListEnabled",
    "voiceMailUsage",
    "removeMembers",
    "addMembers",
    "members",
    "newName"
})
public class UpdateHuntListReq
    extends NameAndGUIDRequest
{

    protected String description;
    @XmlElementRef(name = "callManagerGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callManagerGroupName;
    @XmlElement(defaultValue = "false")
    protected String routeListEnabled;
    @XmlElement(defaultValue = "false")
    protected String voiceMailUsage;
    protected UpdateHuntListReq.RemoveMembers removeMembers;
    protected UpdateHuntListReq.AddMembers addMembers;
    protected UpdateHuntListReq.Members members;
    protected String newName;

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
     * Gets the value of the callManagerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallManagerGroupName() {
        return callManagerGroupName;
    }

    /**
     * Sets the value of the callManagerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallManagerGroupName(JAXBElement<XFkType> value) {
        this.callManagerGroupName = value;
    }

    /**
     * Gets the value of the routeListEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteListEnabled() {
        return routeListEnabled;
    }

    /**
     * Sets the value of the routeListEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteListEnabled(String value) {
        this.routeListEnabled = value;
    }

    /**
     * Gets the value of the voiceMailUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailUsage() {
        return voiceMailUsage;
    }

    /**
     * Sets the value of the voiceMailUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailUsage(String value) {
        this.voiceMailUsage = value;
    }

    /**
     * Gets the value of the removeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateHuntListReq.RemoveMembers }
     *     
     */
    public UpdateHuntListReq.RemoveMembers getRemoveMembers() {
        return removeMembers;
    }

    /**
     * Sets the value of the removeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateHuntListReq.RemoveMembers }
     *     
     */
    public void setRemoveMembers(UpdateHuntListReq.RemoveMembers value) {
        this.removeMembers = value;
    }

    /**
     * Gets the value of the addMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateHuntListReq.AddMembers }
     *     
     */
    public UpdateHuntListReq.AddMembers getAddMembers() {
        return addMembers;
    }

    /**
     * Sets the value of the addMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateHuntListReq.AddMembers }
     *     
     */
    public void setAddMembers(UpdateHuntListReq.AddMembers value) {
        this.addMembers = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateHuntListReq.Members }
     *     
     */
    public UpdateHuntListReq.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateHuntListReq.Members }
     *     
     */
    public void setMembers(UpdateHuntListReq.Members value) {
        this.members = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class AddMembers
        extends XCommonMembersExtension
    {

        protected List<XHuntListMember> member;

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
         * {@link XHuntListMember }
         * 
         * 
         */
        public List<XHuntListMember> getMember() {
            if (member == null) {
                member = new ArrayList<XHuntListMember>();
            }
            return this.member;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        protected List<XHuntListMember> member;

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
         * {@link XHuntListMember }
         * 
         * 
         */
        public List<XHuntListMember> getMember() {
            if (member == null) {
                member = new ArrayList<XHuntListMember>();
            }
            return this.member;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class RemoveMembers
        extends XCommonMembersExtension
    {

        protected List<XHuntListMember> member;

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
         * {@link XHuntListMember }
         * 
         * 
         */
        public List<XHuntListMember> getMember() {
            if (member == null) {
                member = new ArrayList<XHuntListMember>();
            }
            return this.member;
        }

    }

}
