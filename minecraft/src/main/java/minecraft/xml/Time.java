//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.31 at 12:55:29 PM CEST 
//


package minecraft.xml;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}StartTime" minOccurs="0"/>
 *         &lt;element name="AllowPassageOfTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Time")
public class Time {

    @XmlElement(name = "StartTime")
    protected Integer startTime;
    @XmlElement(name = "AllowPassageOfTime", defaultValue = "true")
    protected Boolean allowPassageOfTime;

    /**
     * Gets the value of the startTime property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStartTime(Integer value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the allowPassageOfTime property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAllowPassageOfTime() {
        return allowPassageOfTime;
    }

    /**
     * Sets the value of the allowPassageOfTime property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllowPassageOfTime(Boolean value) {
        this.allowPassageOfTime = value;
    }

}