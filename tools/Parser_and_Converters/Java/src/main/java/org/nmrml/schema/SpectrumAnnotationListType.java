//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.24 at 10:31:51 PM GMT 
//


package org.nmrml.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpectrumAnnotationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpectrumAnnotationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atomAssignment" type="{http://nmrml.org/schema}AtomAssingmentAnnotationType" minOccurs="0"/>
 *         &lt;element name="quantification" type="{http://nmrml.org/schema}QuantificationAnnotationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectrumAnnotationListType", propOrder = {
    "atomAssignment",
    "quantification"
})
public class SpectrumAnnotationListType {

    protected AtomAssingmentAnnotationType atomAssignment;
    protected QuantificationAnnotationType quantification;

    /**
     * Gets the value of the atomAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link AtomAssingmentAnnotationType }
     *     
     */
    public AtomAssingmentAnnotationType getAtomAssignment() {
        return atomAssignment;
    }

    /**
     * Sets the value of the atomAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomAssingmentAnnotationType }
     *     
     */
    public void setAtomAssignment(AtomAssingmentAnnotationType value) {
        this.atomAssignment = value;
    }

    /**
     * Gets the value of the quantification property.
     * 
     * @return
     *     possible object is
     *     {@link QuantificationAnnotationType }
     *     
     */
    public QuantificationAnnotationType getQuantification() {
        return quantification;
    }

    /**
     * Sets the value of the quantification property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantificationAnnotationType }
     *     
     */
    public void setQuantification(QuantificationAnnotationType value) {
        this.quantification = value;
    }

}