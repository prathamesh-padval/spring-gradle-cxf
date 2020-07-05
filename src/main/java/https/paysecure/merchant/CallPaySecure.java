
package https.paysecure.merchant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strCommand",
    "strXML"
})
@XmlRootElement(name = "CallPaySecure")
public class CallPaySecure {

    protected String strCommand;
    protected String strXML;

    /**
     * Gets the value of the strCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCommand() {
        return strCommand;
    }

    /**
     * Sets the value of the strCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCommand(String value) {
        this.strCommand = value;
    }

    /**
     * Gets the value of the strXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrXML() {
        return strXML;
    }

    /**
     * Sets the value of the strXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrXML(String value) {
        this.strXML = value;
    }

	@Override
	public String toString() {
		return "CallPaySecure [strCommand=" + strCommand + ", strXML=" + strXML + "]";
	}

    
    
}
