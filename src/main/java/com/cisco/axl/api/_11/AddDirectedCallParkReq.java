
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDirectedCallParkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDirectedCallParkReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directedCallPark" type="{http://www.cisco.com/AXL/API/11.5}XDirectedCallPark"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDirectedCallParkReq", propOrder = {
    "directedCallPark"
})
public class AddDirectedCallParkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDirectedCallPark directedCallPark;

    /**
     * Gets the value of the directedCallPark property.
     * 
     * @return
     *     possible object is
     *     {@link XDirectedCallPark }
     *     
     */
    public XDirectedCallPark getDirectedCallPark() {
        return directedCallPark;
    }

    /**
     * Sets the value of the directedCallPark property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirectedCallPark }
     *     
     */
    public void setDirectedCallPark(XDirectedCallPark value) {
        this.directedCallPark = value;
    }

}
