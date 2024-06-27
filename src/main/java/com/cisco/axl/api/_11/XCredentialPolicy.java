
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCredentialPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCredentialPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String255"/&gt;
 *         &lt;element name="failedLogon" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="resetFailedLogonAttempts" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="lockoutDuration" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="credChangeDuration" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="credExpiresAfter" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="minCredLength" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="prevCredStoredNum" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="inactiveDaysAllowed" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="expiryWarningDays" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *         &lt;element name="trivialCredCheck" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *         &lt;element name="minCharsToChange" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCredentialPolicy", propOrder = {
    "name",
    "failedLogon",
    "resetFailedLogonAttempts",
    "lockoutDuration",
    "credChangeDuration",
    "credExpiresAfter",
    "minCredLength",
    "prevCredStoredNum",
    "inactiveDaysAllowed",
    "expiryWarningDays",
    "trivialCredCheck",
    "minCharsToChange"
})
public class XCredentialPolicy {

    protected String name;
    @XmlElement(defaultValue = "3")
    protected String failedLogon;
    @XmlElement(defaultValue = "30")
    protected String resetFailedLogonAttempts;
    @XmlElement(defaultValue = "30")
    protected String lockoutDuration;
    @XmlElement(defaultValue = "0")
    protected String credChangeDuration;
    @XmlElement(defaultValue = "180")
    protected String credExpiresAfter;
    @XmlElement(defaultValue = "8")
    protected String minCredLength;
    @XmlElement(defaultValue = "12")
    protected String prevCredStoredNum;
    @XmlElement(defaultValue = "0")
    protected String inactiveDaysAllowed;
    @XmlElement(defaultValue = "0")
    protected String expiryWarningDays;
    @XmlElement(defaultValue = "true")
    protected String trivialCredCheck;
    @XmlElement(defaultValue = "1")
    protected String minCharsToChange;

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
     * Gets the value of the failedLogon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedLogon() {
        return failedLogon;
    }

    /**
     * Sets the value of the failedLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedLogon(String value) {
        this.failedLogon = value;
    }

    /**
     * Gets the value of the resetFailedLogonAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetFailedLogonAttempts() {
        return resetFailedLogonAttempts;
    }

    /**
     * Sets the value of the resetFailedLogonAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetFailedLogonAttempts(String value) {
        this.resetFailedLogonAttempts = value;
    }

    /**
     * Gets the value of the lockoutDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * Sets the value of the lockoutDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockoutDuration(String value) {
        this.lockoutDuration = value;
    }

    /**
     * Gets the value of the credChangeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredChangeDuration() {
        return credChangeDuration;
    }

    /**
     * Sets the value of the credChangeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredChangeDuration(String value) {
        this.credChangeDuration = value;
    }

    /**
     * Gets the value of the credExpiresAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredExpiresAfter() {
        return credExpiresAfter;
    }

    /**
     * Sets the value of the credExpiresAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredExpiresAfter(String value) {
        this.credExpiresAfter = value;
    }

    /**
     * Gets the value of the minCredLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCredLength() {
        return minCredLength;
    }

    /**
     * Sets the value of the minCredLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCredLength(String value) {
        this.minCredLength = value;
    }

    /**
     * Gets the value of the prevCredStoredNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevCredStoredNum() {
        return prevCredStoredNum;
    }

    /**
     * Sets the value of the prevCredStoredNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevCredStoredNum(String value) {
        this.prevCredStoredNum = value;
    }

    /**
     * Gets the value of the inactiveDaysAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveDaysAllowed() {
        return inactiveDaysAllowed;
    }

    /**
     * Sets the value of the inactiveDaysAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveDaysAllowed(String value) {
        this.inactiveDaysAllowed = value;
    }

    /**
     * Gets the value of the expiryWarningDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryWarningDays() {
        return expiryWarningDays;
    }

    /**
     * Sets the value of the expiryWarningDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryWarningDays(String value) {
        this.expiryWarningDays = value;
    }

    /**
     * Gets the value of the trivialCredCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrivialCredCheck() {
        return trivialCredCheck;
    }

    /**
     * Sets the value of the trivialCredCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrivialCredCheck(String value) {
        this.trivialCredCheck = value;
    }

    /**
     * Gets the value of the minCharsToChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCharsToChange() {
        return minCharsToChange;
    }

    /**
     * Sets the value of the minCharsToChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCharsToChange(String value) {
        this.minCharsToChange = value;
    }

}
