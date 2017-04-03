//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.31 at 12:55:29 PM CEST 
//


package minecraft.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ItemSpec complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ItemSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="reward" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="distribution" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="type" use="required" type="{http://ProjectMalmo.microsoft.com}BlockOrItemList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSpec")
public class ItemSpec {

    @XmlAttribute(name = "reward", required = true)
    protected BigDecimal reward;
    @XmlAttribute(name = "distribution")
    protected String distribution;
    @XmlAttribute(name = "type", required = true)
    protected List<String> type;

    /**
     * Gets the value of the reward property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getReward() {
        return reward;
    }

    /**
     * Sets the value of the reward property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setReward(BigDecimal value) {
        this.reward = value;
    }

    /**
     * Gets the value of the distribution property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDistribution() {
        if (distribution == null) {
            return "";
        } else {
            return distribution;
        }
    }

    /**
     * Sets the value of the distribution property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the type property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

}
