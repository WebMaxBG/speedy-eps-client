
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultOrderPickingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultOrderPickingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="errorDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of create order web service calls
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultOrderPickingInfo", propOrder = {
    "billOfLading",
    "errorDescriptions"
})
public class ResultOrderPickingInfo {

	/**
     * BOL number
     */
    protected long billOfLading;
    
    /**
     * A list of validation errors (empty list means there is no problem with this BOL)
     */
    @XmlElement(nillable = true)
    protected List<String> errorDescriptions;

    /**
     * Gets the BOL number
     * @return BOL number
     */
    public long getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the BOL number
     * @param billOfLading BOL number
     */
    public void setBillOfLading(long billOfLading) {
        this.billOfLading = billOfLading;
    }

    /**
     * Gets the list of validation errors (empty list means there is no problem with this BOL)
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorDescriptions() {
        if (errorDescriptions == null) {
            errorDescriptions = new ArrayList<String>();
        }
        return this.errorDescriptions;
    }

}
