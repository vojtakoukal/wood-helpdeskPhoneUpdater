
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRouteGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRouteGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="dialPlanWizardGenld" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="distributionAlgorithm" type="{http://www.cisco.com/AXL/API/11.5}XDistributeAlgorithm" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LRouteGroup", propOrder = {
    "dialPlanWizardGenld",
    "distributionAlgorithm",
    "name"
})
public class LRouteGroup {

    protected String dialPlanWizardGenld;
    protected String distributionAlgorithm;
    protected String name;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the dialPlanWizardGenld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanWizardGenld() {
        return dialPlanWizardGenld;
    }

    /**
     * Sets the value of the dialPlanWizardGenld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanWizardGenld(String value) {
        this.dialPlanWizardGenld = value;
    }

    /**
     * Gets the value of the distributionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionAlgorithm() {
        return distributionAlgorithm;
    }

    /**
     * Sets the value of the distributionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionAlgorithm(String value) {
        this.distributionAlgorithm = value;
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
