
package com.cisco.axl.api._11;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoAuthenticateUserRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoAuthenticateUserRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userAuthenticated" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="daysToExpiry" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="isWarningNeeded" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoAuthenticateUserRes", propOrder = {
    "_return"
})
public class DoAuthenticateUserRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected DoAuthenticateUserRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DoAuthenticateUserRes.Return }
     *     
     */
    public DoAuthenticateUserRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoAuthenticateUserRes.Return }
     *     
     */
    public void setReturn(DoAuthenticateUserRes.Return value) {
        this._return = value;
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
     *         &lt;element name="userAuthenticated" type="{http://www.cisco.com/AXL/API/11.5}boolean"/&gt;
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="daysToExpiry" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="isWarningNeeded" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
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
        "userAuthenticated",
        "code",
        "daysToExpiry",
        "isWarningNeeded"
    })
    public static class Return {

        @XmlElement(required = true)
        protected String userAuthenticated;
        @XmlElement(required = true)
        protected BigInteger code;
        protected BigInteger daysToExpiry;
        protected String isWarningNeeded;

        /**
         * Gets the value of the userAuthenticated property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAuthenticated() {
            return userAuthenticated;
        }

        /**
         * Sets the value of the userAuthenticated property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAuthenticated(String value) {
            this.userAuthenticated = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCode(BigInteger value) {
            this.code = value;
        }

        /**
         * Gets the value of the daysToExpiry property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDaysToExpiry() {
            return daysToExpiry;
        }

        /**
         * Sets the value of the daysToExpiry property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDaysToExpiry(BigInteger value) {
            this.daysToExpiry = value;
        }

        /**
         * Gets the value of the isWarningNeeded property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsWarningNeeded() {
            return isWarningNeeded;
        }

        /**
         * Sets the value of the isWarningNeeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsWarningNeeded(String value) {
            this.isWarningNeeded = value;
        }

    }

}
