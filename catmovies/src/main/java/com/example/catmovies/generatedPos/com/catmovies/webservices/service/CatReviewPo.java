//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.06.06 时间 09:50:00 PM CST 
//


package com.example.catmovies.generatedPos.com.catmovies.webservices.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>catReviewPo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="catReviewPo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="review_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="review_score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reviews" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thumb_UP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user_Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catReviewPo", propOrder = {
    "reviewTime",
    "reviewScore",
    "reviews",
    "thumbUP",
    "userImage",
    "userName"
})
public class CatReviewPo {

    @XmlElement(name = "review_Time")
    protected String reviewTime;
    @XmlElement(name = "review_score")
    protected double reviewScore;
    @XmlElement(name = "reviews")
    protected String reviews;
    @XmlElement(name = "thumb_UP")
    protected int thumbUP;
    @XmlElement(name = "user_Image")
    protected String userImage;
    @XmlElement(name = "user_Name")
    protected String userName;

    /**
     * 获取reviewTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewTime() {
        return reviewTime;
    }

    /**
     * 设置reviewTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewTime(String value) {
        this.reviewTime = value;
    }

    /**
     * 获取reviewScore属性的值。
     * 
     */
    public double getReviewScore() {
        return reviewScore;
    }

    /**
     * 设置reviewScore属性的值。
     * 
     */
    public void setReviewScore(double value) {
        this.reviewScore = value;
    }

    /**
     * 获取reviews属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviews() {
        return reviews;
    }

    /**
     * 设置reviews属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviews(String value) {
        this.reviews = value;
    }

    /**
     * 获取thumbUP属性的值。
     * 
     */
    public int getThumbUP() {
        return thumbUP;
    }

    /**
     * 设置thumbUP属性的值。
     * 
     */
    public void setThumbUP(int value) {
        this.thumbUP = value;
    }

    /**
     * 获取userImage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * 设置userImage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserImage(String value) {
        this.userImage = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
