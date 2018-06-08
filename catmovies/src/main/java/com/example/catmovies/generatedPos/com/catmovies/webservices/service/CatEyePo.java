//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.06.06 时间 09:50:00 PM CST 
//


package com.example.catmovies.generatedPos.com.catmovies.webservices.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>catEyePo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="catEyePo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booking_Office" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="catReviewPoVector" type="{http://catmovies.com/webservices/service}catReviewPo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasting_Time" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="movie_English_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movie_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movie_Pic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shoot_Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="show_Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="show_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_NUM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="user_Score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catEyePo", propOrder = {
    "bookingOffice",
    "catReviewPoVector",
    "introduction",
    "lastingTime",
    "movieEnglishName",
    "movieName",
    "moviePic",
    "shootPlace",
    "showPlace",
    "showTime",
    "types",
    "userNUM",
    "userScore"
})
public class CatEyePo {

    @XmlElement(name = "booking_Office")
    protected double bookingOffice;
    @XmlElement(nillable = true)
    protected List<CatReviewPo> catReviewPoVector;
    protected String introduction;
    @XmlElement(name = "lasting_Time")
    protected double lastingTime;
    @XmlElement(name = "movie_English_Name")
    protected String movieEnglishName;
    @XmlElement(name = "movie_Name")
    protected String movieName;
    @XmlElement(name = "movie_Pic")
    protected String moviePic;
    @XmlElement(name = "shoot_Place")
    protected String shootPlace;

    @XmlElement(name = "show_Place")
    protected String showPlace;

    @XmlElement(name = "show_Time")
    protected String showTime;

    @XmlElement(name = "types")
    protected String types;

    @XmlElement(name = "user_NUM")
    protected double userNUM;

    @XmlElement(name = "user_Score")
    protected double userScore;

    /**
     * 获取bookingOffice属性的值。
     * 
     */
    public double getBookingOffice() {
        return bookingOffice;
    }

    /**
     * 设置bookingOffice属性的值。
     * 
     */
    public void setBookingOffice(double value) {
        this.bookingOffice = value;
    }

    /**
     * Gets the value of the catReviewPoVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catReviewPoVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatReviewPoVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatReviewPo }
     * 
     * 
     */
    public List<CatReviewPo> getCatReviewPoVector() {
        if (catReviewPoVector == null) {
            catReviewPoVector = new ArrayList<CatReviewPo>();
        }
        return this.catReviewPoVector;
    }

    /**
     * 获取introduction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置introduction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroduction(String value) {
        this.introduction = value;
    }

    /**
     * 获取lastingTime属性的值。
     * 
     */
    public double getLastingTime() {
        return lastingTime;
    }

    /**
     * 设置lastingTime属性的值。
     * 
     */
    public void setLastingTime(double value) {
        this.lastingTime = value;
    }

    /**
     * 获取movieEnglishName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieEnglishName() {
        return movieEnglishName;
    }

    /**
     * 设置movieEnglishName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieEnglishName(String value) {
        this.movieEnglishName = value;
    }

    /**
     * 获取movieName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * 设置movieName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieName(String value) {
        this.movieName = value;
    }

    /**
     * 获取moviePic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviePic() {
        return moviePic;
    }

    /**
     * 设置moviePic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviePic(String value) {
        this.moviePic = value;
    }

    /**
     * 获取shootPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShootPlace() {
        return shootPlace;
    }

    /**
     * 设置shootPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShootPlace(String value) {
        this.shootPlace = value;
    }

    /**
     * 获取showPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowPlace() {
        return showPlace;
    }

    /**
     * 设置showPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowPlace(String value) {
        this.showPlace = value;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    /**
     * 获取types属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypes() {
        return types;
    }

    /**
     * 设置types属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypes(String value) {
        this.types = value;
    }

    /**
     * 获取userNUM属性的值。
     * 
     */
    public double getUserNUM() {
        return userNUM;
    }

    /**
     * 设置userNUM属性的值。
     * 
     */
    public void setUserNUM(double value) {
        this.userNUM = value;
    }

    /**
     * 获取userScore属性的值。
     * 
     */
    public double getUserScore() {
        return userScore;
    }

    /**
     * 设置userScore属性的值。
     * 
     */
    public void setUserScore(double value) {
        this.userScore = value;
    }

    public void setCatReviewPoVector(List<CatReviewPo> catReviewPoVector) {
        this.catReviewPoVector = catReviewPoVector;
    }
}
