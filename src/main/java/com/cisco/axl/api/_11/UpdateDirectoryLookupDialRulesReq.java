
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDirectoryLookupDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDirectoryLookupDialRulesReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberBeginWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="digitsToBeRemoved" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="prefixPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDirectoryLookupDialRulesReq", propOrder = {
    "newName",
    "description",
    "numberBeginWith",
    "numberOfDigits",
    "digitsToBeRemoved",
    "prefixPattern",
    "priority"
})
public class UpdateDirectoryLookupDialRulesReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String numberBeginWith;
    @XmlElement(defaultValue = "0")
    protected String numberOfDigits;
    @XmlElement(defaultValue = "0")
    protected String digitsToBeRemoved;
    protected String prefixPattern;
    @XmlElement(defaultValue = "0")
    protected String priority;

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
     * Gets the value of the numberBeginWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBeginWith() {
        return numberBeginWith;
    }

    /**
     * Sets the value of the numberBeginWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBeginWith(String value) {
        this.numberBeginWith = value;
    }

    /**
     * Gets the value of the numberOfDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfDigits() {
        return numberOfDigits;
    }

    /**
     * Sets the value of the numberOfDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfDigits(String value) {
        this.numberOfDigits = value;
    }

    /**
     * Gets the value of the digitsToBeRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitsToBeRemoved() {
        return digitsToBeRemoved;
    }

    /**
     * Sets the value of the digitsToBeRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitsToBeRemoved(String value) {
        this.digitsToBeRemoved = value;
    }

    /**
     * Gets the value of the prefixPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixPattern() {
        return prefixPattern;
    }

    /**
     * Sets the value of the prefixPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixPattern(String value) {
        this.prefixPattern = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

}
