
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSelfProvisioningReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSelfProvisioningReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requireAuthentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowAuthentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctiRoutePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="removeLanguages" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvisionRemove" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="addLanguages" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvision" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="languages" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvision" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSelfProvisioningReq", propOrder = {
    "requireAuthentication",
    "allowAuthentication",
    "authenticationCode",
    "ctiRoutePoint",
    "applicationUser",
    "removeLanguages",
    "addLanguages",
    "languages"
})
public class UpdateSelfProvisioningReq
    extends APIRequest
{

    @XmlElementRef(name = "requireAuthentication", type = JAXBElement.class)
    protected JAXBElement<String> requireAuthentication;
    @XmlElementRef(name = "allowAuthentication", type = JAXBElement.class)
    protected JAXBElement<String> allowAuthentication;
    @XmlElementRef(name = "authenticationCode", type = JAXBElement.class)
    protected JAXBElement<String> authenticationCode;
    @XmlElementRef(name = "ctiRoutePoint", type = JAXBElement.class)
    protected JAXBElement<String> ctiRoutePoint;
    @XmlElementRef(name = "applicationUser", type = JAXBElement.class)
    protected JAXBElement<String> applicationUser;
    protected UpdateSelfProvisioningReq.RemoveLanguages removeLanguages;
    protected UpdateSelfProvisioningReq.AddLanguages addLanguages;
    protected UpdateSelfProvisioningReq.Languages languages;

    /**
     * Gets the value of the requireAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequireAuthentication() {
        return requireAuthentication;
    }

    /**
     * Sets the value of the requireAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequireAuthentication(JAXBElement<String> value) {
        this.requireAuthentication = value;
    }

    /**
     * Gets the value of the allowAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllowAuthentication() {
        return allowAuthentication;
    }

    /**
     * Sets the value of the allowAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllowAuthentication(JAXBElement<String> value) {
        this.allowAuthentication = value;
    }

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationCode(JAXBElement<String> value) {
        this.authenticationCode = value;
    }

    /**
     * Gets the value of the ctiRoutePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtiRoutePoint() {
        return ctiRoutePoint;
    }

    /**
     * Sets the value of the ctiRoutePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtiRoutePoint(JAXBElement<String> value) {
        this.ctiRoutePoint = value;
    }

    /**
     * Gets the value of the applicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationUser() {
        return applicationUser;
    }

    /**
     * Sets the value of the applicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationUser(JAXBElement<String> value) {
        this.applicationUser = value;
    }

    /**
     * Gets the value of the removeLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSelfProvisioningReq.RemoveLanguages }
     *     
     */
    public UpdateSelfProvisioningReq.RemoveLanguages getRemoveLanguages() {
        return removeLanguages;
    }

    /**
     * Sets the value of the removeLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSelfProvisioningReq.RemoveLanguages }
     *     
     */
    public void setRemoveLanguages(UpdateSelfProvisioningReq.RemoveLanguages value) {
        this.removeLanguages = value;
    }

    /**
     * Gets the value of the addLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSelfProvisioningReq.AddLanguages }
     *     
     */
    public UpdateSelfProvisioningReq.AddLanguages getAddLanguages() {
        return addLanguages;
    }

    /**
     * Sets the value of the addLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSelfProvisioningReq.AddLanguages }
     *     
     */
    public void setAddLanguages(UpdateSelfProvisioningReq.AddLanguages value) {
        this.addLanguages = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSelfProvisioningReq.Languages }
     *     
     */
    public UpdateSelfProvisioningReq.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSelfProvisioningReq.Languages }
     *     
     */
    public void setLanguages(UpdateSelfProvisioningReq.Languages value) {
        this.languages = value;
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
     *         &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvision" maxOccurs="9" minOccurs="0"/&gt;
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
        "language"
    })
    public static class AddLanguages
        extends XCommonMembersExtension
    {

        protected List<XSelfProvision> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSelfProvision }
         * 
         * 
         */
        public List<XSelfProvision> getLanguage() {
            if (language == null) {
                language = new ArrayList<XSelfProvision>();
            }
            return this.language;
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
     *         &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvision" maxOccurs="9" minOccurs="0"/&gt;
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
        "language"
    })
    public static class Languages
        extends XCommonMembersExtension
    {

        protected List<XSelfProvision> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSelfProvision }
         * 
         * 
         */
        public List<XSelfProvision> getLanguage() {
            if (language == null) {
                language = new ArrayList<XSelfProvision>();
            }
            return this.language;
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
     *         &lt;element name="language" type="{http://www.cisco.com/AXL/API/11.5}XSelfProvisionRemove" maxOccurs="9" minOccurs="0"/&gt;
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
        "language"
    })
    public static class RemoveLanguages
        extends XCommonMembersExtension
    {

        protected List<XSelfProvisionRemove> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSelfProvisionRemove }
         * 
         * 
         */
        public List<XSelfProvisionRemove> getLanguage() {
            if (language == null) {
                language = new ArrayList<XSelfProvisionRemove>();
            }
            return this.language;
        }

    }

}
