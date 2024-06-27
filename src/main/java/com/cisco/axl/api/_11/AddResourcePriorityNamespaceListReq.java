
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddResourcePriorityNamespaceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddResourcePriorityNamespaceListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/11.5}XResourcePriorityNamespaceList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddResourcePriorityNamespaceListReq", propOrder = {
    "resourcePriorityNamespaceList"
})
public class AddResourcePriorityNamespaceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XResourcePriorityNamespaceList resourcePriorityNamespaceList;

    /**
     * Gets the value of the resourcePriorityNamespaceList property.
     * 
     * @return
     *     possible object is
     *     {@link XResourcePriorityNamespaceList }
     *     
     */
    public XResourcePriorityNamespaceList getResourcePriorityNamespaceList() {
        return resourcePriorityNamespaceList;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XResourcePriorityNamespaceList }
     *     
     */
    public void setResourcePriorityNamespaceList(XResourcePriorityNamespaceList value) {
        this.resourcePriorityNamespaceList = value;
    }

}
