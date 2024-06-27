
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDirNumberAliasLookupandSyncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDirNumberAliasLookupandSyncReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dirNumberAliasLookupandSync" type="{http://www.cisco.com/AXL/API/11.5}XDirNumberAliasLookupandSync"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDirNumberAliasLookupandSyncReq", propOrder = {
    "dirNumberAliasLookupandSync"
})
public class AddDirNumberAliasLookupandSyncReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDirNumberAliasLookupandSync dirNumberAliasLookupandSync;

    /**
     * Gets the value of the dirNumberAliasLookupandSync property.
     * 
     * @return
     *     possible object is
     *     {@link XDirNumberAliasLookupandSync }
     *     
     */
    public XDirNumberAliasLookupandSync getDirNumberAliasLookupandSync() {
        return dirNumberAliasLookupandSync;
    }

    /**
     * Sets the value of the dirNumberAliasLookupandSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirNumberAliasLookupandSync }
     *     
     */
    public void setDirNumberAliasLookupandSync(XDirNumberAliasLookupandSync value) {
        this.dirNumberAliasLookupandSync = value;
    }

}
