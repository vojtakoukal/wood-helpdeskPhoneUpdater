
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XBusyLampField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XBusyLampField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="blfDest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="blfDirn" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *             &lt;element name="routePartition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedBlfSdFeatures" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="feature" type="{http://www.cisco.com/AXL/API/11.5}XBLFSDOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XBusyLampField", propOrder = {
    "blfDest",
    "blfDirn",
    "routePartition",
    "label",
    "associatedBlfSdFeatures",
    "index"
})
public class XBusyLampField {

    protected String blfDest;
    protected String blfDirn;
    protected String routePartition;
    protected String label;
    protected XBusyLampField.AssociatedBlfSdFeatures associatedBlfSdFeatures;
    protected String index;

    /**
     * Gets the value of the blfDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfDest() {
        return blfDest;
    }

    /**
     * Sets the value of the blfDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfDest(String value) {
        this.blfDest = value;
    }

    /**
     * Gets the value of the blfDirn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfDirn() {
        return blfDirn;
    }

    /**
     * Sets the value of the blfDirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfDirn(String value) {
        this.blfDirn = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePartition(String value) {
        this.routePartition = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the associatedBlfSdFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link XBusyLampField.AssociatedBlfSdFeatures }
     *     
     */
    public XBusyLampField.AssociatedBlfSdFeatures getAssociatedBlfSdFeatures() {
        return associatedBlfSdFeatures;
    }

    /**
     * Sets the value of the associatedBlfSdFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link XBusyLampField.AssociatedBlfSdFeatures }
     *     
     */
    public void setAssociatedBlfSdFeatures(XBusyLampField.AssociatedBlfSdFeatures value) {
        this.associatedBlfSdFeatures = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="feature" type="{http://www.cisco.com/AXL/API/11.5}XBLFSDOption" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "feature"
    })
    public static class AssociatedBlfSdFeatures {

        protected List<String> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFeature() {
            if (feature == null) {
                feature = new ArrayList<String>();
            }
            return this.feature;
        }

    }

}
