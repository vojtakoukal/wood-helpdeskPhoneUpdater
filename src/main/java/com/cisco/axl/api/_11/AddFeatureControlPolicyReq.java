
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddFeatureControlPolicyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFeatureControlPolicyReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/11.5}XFeatureControlPolicy"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFeatureControlPolicyReq", propOrder = {
    "featureControlPolicy"
})
public class AddFeatureControlPolicyReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFeatureControlPolicy featureControlPolicy;

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XFeatureControlPolicy }
     *     
     */
    public XFeatureControlPolicy getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFeatureControlPolicy }
     *     
     */
    public void setFeatureControlPolicy(XFeatureControlPolicy value) {
        this.featureControlPolicy = value;
    }

}
