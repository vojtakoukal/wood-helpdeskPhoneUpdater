
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userGroup" type="{http://www.cisco.com/AXL/API/11.5}XUserGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserGroupReq", propOrder = {
    "userGroup"
})
public class AddUserGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserGroup userGroup;

    /**
     * Gets the value of the userGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XUserGroup }
     *     
     */
    public XUserGroup getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserGroup }
     *     
     */
    public void setUserGroup(XUserGroup value) {
        this.userGroup = value;
    }

}
