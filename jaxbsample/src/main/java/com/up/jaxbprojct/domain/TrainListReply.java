//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.05 at 12:02:18 PM IST 
//


package com.up.jaxbprojct.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="train-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="train" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="schedule-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trainList"
})
@XmlRootElement(name = "train-list-reply")
public class TrainListReply {

    @XmlElement(name = "train-list", required = true)
    protected TrainListReply.TrainList trainList;

    /**
     * Gets the value of the trainList property.
     * 
     * @return
     *     possible object is
     *     {@link TrainListReply.TrainList }
     *     
     */
    public TrainListReply.TrainList getTrainList() {
        return trainList;
    }

    /**
     * Sets the value of the trainList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainListReply.TrainList }
     *     
     */
    public void setTrainList(TrainListReply.TrainList value) {
        this.trainList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="train" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="schedule-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "train"
    })
    public static class TrainList {

        protected List<TrainListReply.TrainList.Train> train;

        /**
         * Gets the value of the train property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the train property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrainListReply.TrainList.Train }
         * 
         * 
         */
        public List<TrainListReply.TrainList.Train> getTrain() {
            if (train == null) {
                train = new ArrayList<TrainListReply.TrainList.Train>();
            }
            return this.train;
        }
        public void setTrain(List<TrainListReply.TrainList.Train> lst) {
            
                train = lst;
            
            
        }

        

        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="schedule-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "source",
            "destination",
            "scheduleDate"
        })
        public static class Train {

            protected int id;
            @XmlElement(required = true)
            protected String source;
            @XmlElement(required = true)
            protected String destination;
            @XmlElement(name = "schedule-date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar scheduleDate;

            /**
             * Gets the value of the id property.
             * 
             */
            public int getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(int value) {
                this.id = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestination() {
                return destination;
            }

            /**
             * Sets the value of the destination property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestination(String value) {
                this.destination = value;
            }

            /**
             * Gets the value of the scheduleDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getScheduleDate() {
                return scheduleDate;
            }

            /**
             * Sets the value of the scheduleDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setScheduleDate(XMLGregorianCalendar value) {
                this.scheduleDate = value;
            }

        }

    }

}
