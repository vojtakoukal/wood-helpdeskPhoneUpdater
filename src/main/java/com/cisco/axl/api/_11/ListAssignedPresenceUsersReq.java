
package com.cisco.axl.api._11;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListAssignedPresenceUsersReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAssignedPresenceUsersReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchCriteria"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="presenceRedundancyGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/11.5}LAssignedPresenceUsers"/&gt;
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAssignedPresenceUsersReq", propOrder = {
    "searchCriteria",
    "returnedTags",
    "skip",
    "first"
})
public class ListAssignedPresenceUsersReq {

    @XmlElement(required = true)
    protected ListAssignedPresenceUsersReq.SearchCriteria searchCriteria;
    @XmlElement(required = true)
    protected LAssignedPresenceUsers returnedTags;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger skip;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger first;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ListAssignedPresenceUsersReq.SearchCriteria }
     *     
     */
    public ListAssignedPresenceUsersReq.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAssignedPresenceUsersReq.SearchCriteria }
     *     
     */
    public void setSearchCriteria(ListAssignedPresenceUsersReq.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link LAssignedPresenceUsers }
     *     
     */
    public LAssignedPresenceUsers getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAssignedPresenceUsers }
     *     
     */
    public void setReturnedTags(LAssignedPresenceUsers value) {
        this.returnedTags = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkip(BigInteger value) {
        this.skip = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirst(BigInteger value) {
        this.first = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="presenceRedundancyGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "userid",
        "server",
        "presenceRedundancyGroup"
    })
    public static class SearchCriteria {

        protected String userid;
        protected String server;
        protected String presenceRedundancyGroup;

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserid() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserid(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the server property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer() {
            return server;
        }

        /**
         * Sets the value of the server property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer(String value) {
            this.server = value;
        }

        /**
         * Gets the value of the presenceRedundancyGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresenceRedundancyGroup() {
            return presenceRedundancyGroup;
        }

        /**
         * Sets the value of the presenceRedundancyGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresenceRedundancyGroup(String value) {
            this.presenceRedundancyGroup = value;
        }

    }

}
