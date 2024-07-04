
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveNewLot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveNewLot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parking_lot_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="start_date" type="{http://services.ticket.com/}date" minOccurs="0"/&gt;
 *         &lt;element name="end_date" type="{http://services.ticket.com/}date" minOccurs="0"/&gt;
 *         &lt;element name="lot_number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jenis_tiket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveNewLot", propOrder = {
    "parkingLotId",
    "userId",
    "startDate",
    "endDate",
    "lotNumber",
    "harga",
    "jenisTiket"
})
public class ReserveNewLot {

    @XmlElement(name = "parking_lot_id")
    protected int parkingLotId;
    @XmlElement(name = "user_id")
    protected int userId;
    @XmlElement(name = "start_date")
    protected Date startDate;
    @XmlElement(name = "end_date")
    protected Date endDate;
    @XmlElement(name = "lot_number")
    protected int lotNumber;
    protected int harga;
    @XmlElement(name = "jenis_tiket")
    protected String jenisTiket;

    /**
     * Gets the value of the parkingLotId property.
     * 
     */
    public int getParkingLotId() {
        return parkingLotId;
    }

    /**
     * Sets the value of the parkingLotId property.
     * 
     */
    public void setParkingLotId(int value) {
        this.parkingLotId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     */
    public int getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     */
    public void setLotNumber(int value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the harga property.
     * 
     */
    public int getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     */
    public void setHarga(int value) {
        this.harga = value;
    }

    /**
     * Gets the value of the jenisTiket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisTiket() {
        return jenisTiket;
    }

    /**
     * Sets the value of the jenisTiket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisTiket(String value) {
        this.jenisTiket = value;
    }

}
