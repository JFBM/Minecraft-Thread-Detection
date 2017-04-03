//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.31 at 12:55:29 PM CEST 
//


package minecraft.xml;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Reward" type="{http://ProjectMalmo.microsoft.com}MissionEndRewardCase"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://ProjectMalmo.microsoft.com}RewardProducerAttributes"/>
 *       &lt;attribute name="rewardForDeath" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.0" />
 *       &lt;attribute name="rewardForDeathDistribution" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reward"
})
@XmlRootElement(name = "RewardForMissionEnd")
public class RewardForMissionEnd {

    @XmlElement(name = "Reward")
    protected List<MissionEndRewardCase> reward;
    @XmlAttribute(name = "rewardForDeath")
    protected BigDecimal rewardForDeath;
    @XmlAttribute(name = "rewardForDeathDistribution")
    protected String rewardForDeathDistribution;
    @XmlAttribute(name = "dimension")
    protected Integer dimension;

    /**
     * Gets the value of the reward property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reward property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReward().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissionEndRewardCase }
     */
    public List<MissionEndRewardCase> getReward() {
        if (reward == null) {
            reward = new ArrayList<MissionEndRewardCase>();
        }
        return this.reward;
    }

    /**
     * Gets the value of the rewardForDeath property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getRewardForDeath() {
        if (rewardForDeath == null) {
            return new BigDecimal("0.0");
        } else {
            return rewardForDeath;
        }
    }

    /**
     * Sets the value of the rewardForDeath property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setRewardForDeath(BigDecimal value) {
        this.rewardForDeath = value;
    }

    /**
     * Gets the value of the rewardForDeathDistribution property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRewardForDeathDistribution() {
        if (rewardForDeathDistribution == null) {
            return "";
        } else {
            return rewardForDeathDistribution;
        }
    }

    /**
     * Sets the value of the rewardForDeathDistribution property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRewardForDeathDistribution(String value) {
        this.rewardForDeathDistribution = value;
    }

    /**
     * Gets the value of the dimension property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public int getDimension() {
        if (dimension == null) {
            return 0;
        } else {
            return dimension;
        }
    }

    /**
     * Sets the value of the dimension property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDimension(Integer value) {
        this.dimension = value;
    }

}