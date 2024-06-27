
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LApplicationUserCapfProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LApplicationUserCapfProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="applicationUser" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateOperation" type="{http://www.cisco.com/AXL/API/11.5}XCertificateOperation" minOccurs="0"/&gt;
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/11.5}XAuthenticationMode" minOccurs="0"/&gt;
 *         &lt;element name="authenticationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/11.5}XKeySize" minOccurs="0"/&gt;
 *         &lt;element name="keyOrder" type="{http://www.cisco.com/AXL/API/11.5}XKeyOrder" minOccurs="0"/&gt;
 *         &lt;element name="ecKeySize" type="{http://www.cisco.com/AXL/API/11.5}XECKeySize" minOccurs="0"/&gt;
 *         &lt;element name="operationCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificationOperationStatus" type="{http://www.cisco.com/AXL/API/11.5}XCertificateStatus" minOccurs="0"/&gt;
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
@XmlType(name = "LApplicationUserCapfProfile", propOrder = {
    "applicationUser",
    "instanceId",
    "certificateOperation",
    "authenticationMode",
    "authenticationString",
    "keySize",
    "keyOrder",
    "ecKeySize",
    "operationCompletion",
    "certificationOperationStatus"
})
public class LApplicationUserCapfProfile {

    protected XFkType applicationUser;
    protected String instanceId;
    protected String certificateOperation;
    protected String authenticationMode;
    protected String authenticationString;
    protected String keySize;
    protected String keyOrder;
    protected String ecKeySize;
    protected String operationCompletion;
    protected String certificationOperationStatus;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the applicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getApplicationUser() {
        return applicationUser;
    }

    /**
     * Sets the value of the applicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setApplicationUser(XFkType value) {
        this.applicationUser = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the certificateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOperation() {
        return certificateOperation;
    }

    /**
     * Sets the value of the certificateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOperation(String value) {
        this.certificateOperation = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the authenticationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * Sets the value of the authenticationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationString(String value) {
        this.authenticationString = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the keyOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyOrder() {
        return keyOrder;
    }

    /**
     * Sets the value of the keyOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyOrder(String value) {
        this.keyOrder = value;
    }

    /**
     * Gets the value of the ecKeySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcKeySize() {
        return ecKeySize;
    }

    /**
     * Sets the value of the ecKeySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcKeySize(String value) {
        this.ecKeySize = value;
    }

    /**
     * Gets the value of the operationCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCompletion() {
        return operationCompletion;
    }

    /**
     * Sets the value of the operationCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCompletion(String value) {
        this.operationCompletion = value;
    }

    /**
     * Gets the value of the certificationOperationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationOperationStatus() {
        return certificationOperationStatus;
    }

    /**
     * Sets the value of the certificationOperationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationOperationStatus(String value) {
        this.certificationOperationStatus = value;
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
