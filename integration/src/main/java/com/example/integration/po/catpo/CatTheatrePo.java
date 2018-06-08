//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.06.06 时间 09:50:00 PM CST 
//


package com.example.integration.po.catpo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>catTheatrePo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="catTheatrePo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seaverUsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theatre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theatre_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theatre_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theatre_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tickets">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://catmovies.com/webservices/service}catTicketPo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "catTheatrePo", propOrder = {
    "seaverUsable",
    "theatre",
    "theatreAddress",
    "theatreName",
    "theatrePhone",
    "tickets"
})
@XmlRootElement(name = "catTheatrePo",namespace = "http://catmovies.com/webservices/service")
public class CatTheatrePo {

    @XmlElement(name = "seaverUsable")
    protected String seaverUsable;
    @XmlElement(name = "theatre")
    protected String theatre;
    @XmlElement(name = "theatre_Address")
    protected String theatreAddress;
    @XmlElement(name = "theatre_Name")
    protected String theatreName;
    @XmlElement(name = "theatre_Phone")
    protected String theatrePhone;

    @XmlElement(required = true,name = "tickets",namespace = "http://catmovies.com/webservices/service")
    protected CatTheatrePo.Tickets tickets;

    /**
     * 获取seaverUsable属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeaverUsable() {
        return seaverUsable;
    }

    /**
     * 设置seaverUsable属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeaverUsable(String value) {
        this.seaverUsable = value;
    }

    /**
     * 获取theatre属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheatre() {
        return theatre;
    }

    /**
     * 设置theatre属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheatre(String value) {
        this.theatre = value;
    }

    /**
     * 获取theatreAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheatreAddress() {
        return theatreAddress;
    }

    /**
     * 设置theatreAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheatreAddress(String value) {
        this.theatreAddress = value;
    }

    /**
     * 获取theatreName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheatreName() {
        return theatreName;
    }

    /**
     * 设置theatreName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheatreName(String value) {
        this.theatreName = value;
    }

    /**
     * 获取theatrePhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheatrePhone() {
        return theatrePhone;
    }

    /**
     * 设置theatrePhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheatrePhone(String value) {
        this.theatrePhone = value;
    }

    /**
     * 获取tickets属性的值。
     *
     * @return
     *     possible object is
     *     {@link CatTheatrePo.Tickets }
     *
     */
    public CatTheatrePo.Tickets getTickets() {
        return tickets;
    }

    /**
     * 设置tickets属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CatTheatrePo.Tickets }
     *
     */
    public void setTickets(CatTheatrePo.Tickets value) {
        this.tickets = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://catmovies.com/webservices/service}catTicketPo" maxOccurs="unbounded" minOccurs="0"/>
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
        "entry"
    })
    public static class Tickets {

        @XmlElement(name = "entries",namespace = "http://catmovies.com/webservices/service")
        protected List<Entry> entry;

        /**
         * Gets the value of the entry property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CatTheatrePo.Tickets.Entry }
         *
         *
         */
        public List<Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Entry>();
            }
            return this.entry;
        }

        public void setEntry(List<Entry> entry) {
            this.entry = entry;
        }

        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://catmovies.com/webservices/service}catTicketPo" maxOccurs="unbounded" minOccurs="0"/>
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
            "key",
            "value"
        },namespace = "http://catmovies.com/webservices/service")
        public static class Entry {

            @XmlElement(name = "key")
            protected String key;
            @XmlElement(name = "value",namespace = "http://catmovies.com/webservices/service")
            protected List<CatTicketPo> value;

            /**
             * 获取key属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * 设置key属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the value property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CatTicketPo }
             * 
             * 
             */
            public List<CatTicketPo> getValue() {
                if (value == null) {
                    value = new ArrayList<CatTicketPo>();
                }
                return this.value;
            }

            public void setValue(List<CatTicketPo> value) {
                this.value = value;
            }
        }

    }

}
