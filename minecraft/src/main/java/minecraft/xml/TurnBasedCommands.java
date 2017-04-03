//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.31 at 12:55:29 PM CEST 
//


package minecraft.xml;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
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
 *       &lt;group ref="{http://ProjectMalmo.microsoft.com}TurnBasedApplicableCommandHandlers"/>
 *       &lt;attribute name="requestedPosition">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "turnBasedApplicableCommandHandlers"
})
@XmlRootElement(name = "TurnBasedCommands")
public class TurnBasedCommands {

    @XmlElements({
            @XmlElement(name = "AbsoluteMovementCommands", type = AbsoluteMovementCommands.class),
            @XmlElement(name = "DiscreteMovementCommands", type = DiscreteMovementCommands.class),
            @XmlElement(name = "InventoryCommands", type = InventoryCommands.class),
            @XmlElement(name = "ChatCommands", type = ChatCommands.class),
            @XmlElement(name = "SimpleCraftCommands", type = SimpleCraftCommands.class),
            @XmlElement(name = "MissionQuitCommands", type = MissionQuitCommands.class)
    })
    protected List<Object> turnBasedApplicableCommandHandlers;
    @XmlAttribute(name = "requestedPosition")
    protected BigInteger requestedPosition;

    /**
     * Gets the value of the turnBasedApplicableCommandHandlers property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turnBasedApplicableCommandHandlers property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurnBasedApplicableCommandHandlers().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsoluteMovementCommands }
     * {@link DiscreteMovementCommands }
     * {@link InventoryCommands }
     * {@link ChatCommands }
     * {@link SimpleCraftCommands }
     * {@link MissionQuitCommands }
     */
    public List<Object> getTurnBasedApplicableCommandHandlers() {
        if (turnBasedApplicableCommandHandlers == null) {
            turnBasedApplicableCommandHandlers = new ArrayList<Object>();
        }
        return this.turnBasedApplicableCommandHandlers;
    }

    /**
     * Gets the value of the requestedPosition property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRequestedPosition() {
        return requestedPosition;
    }

    /**
     * Sets the value of the requestedPosition property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRequestedPosition(BigInteger value) {
        this.requestedPosition = value;
    }

}
