
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateImeLearnedRoutesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateImeLearnedRoutesReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *           &lt;element name="e164Did" type="{http://www.cisco.com/AXL/API/11.5}String32"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="adminEnabled" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateImeLearnedRoutesReq", propOrder = {
    "uuid",
    "e164Did",
    "adminEnabled"
})
public class UpdateImeLearnedRoutesReq
    extends APIRequest
{

    protected String uuid;
    protected String e164Did;
    protected String adminEnabled;

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
     * Gets the value of the e164Did property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Did() {
        return e164Did;
    }

    /**
     * Sets the value of the e164Did property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Did(String value) {
        this.e164Did = value;
    }

    /**
     * Gets the value of the adminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminEnabled() {
        return adminEnabled;
    }

    /**
     * Sets the value of the adminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminEnabled(String value) {
        this.adminEnabled = value;
    }

}
