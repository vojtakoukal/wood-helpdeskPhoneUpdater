
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRemoteClusterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRemoteClusterReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remoteCluster" type="{http://www.cisco.com/AXL/API/11.5}XRemoteCluster"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRemoteClusterReq", propOrder = {
    "remoteCluster"
})
public class AddRemoteClusterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRemoteCluster remoteCluster;

    /**
     * Gets the value of the remoteCluster property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteCluster }
     *     
     */
    public XRemoteCluster getRemoteCluster() {
        return remoteCluster;
    }

    /**
     * Sets the value of the remoteCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteCluster }
     *     
     */
    public void setRemoteCluster(XRemoteCluster value) {
        this.remoteCluster = value;
    }

}
