
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPageLayoutPreferencesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPageLayoutPreferencesReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageName" type="{http://www.cisco.com/AXL/API/11.5}String100"/&gt;
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/11.5}RPageLayoutPreferences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPageLayoutPreferencesReq", propOrder = {
    "pageName",
    "returnedTags"
})
public class GetPageLayoutPreferencesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String pageName;
    protected RPageLayoutPreferences returnedTags;

    /**
     * Gets the value of the pageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * Sets the value of the pageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageName(String value) {
        this.pageName = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RPageLayoutPreferences }
     *     
     */
    public RPageLayoutPreferences getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPageLayoutPreferences }
     *     
     */
    public void setReturnedTags(RPageLayoutPreferences value) {
        this.returnedTags = value;
    }

}
