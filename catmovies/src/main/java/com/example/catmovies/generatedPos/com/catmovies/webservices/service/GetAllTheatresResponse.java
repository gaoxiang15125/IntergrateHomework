//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.06.06 时间 09:50:00 PM CST 
//


package com.example.catmovies.generatedPos.com.catmovies.webservices.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>getAllTheatresResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getAllTheatresResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pos" type="{http://catmovies.com/webservices/service}catTheatrePo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllTheatresResponse", propOrder = {
    "pos"
})
@XmlRootElement(name = "getAllTheatresResponse",namespace = "http://catmovies.com/webservices/service")
public class GetAllTheatresResponse {

    @XmlElement(nillable = true)
    protected List<CatTheatrePo> pos;

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatTheatrePo }
     * 
     * 
     */
    public List<CatTheatrePo> getPos() {
        if (pos == null) {
            pos = new ArrayList<CatTheatrePo>();
        }
        return this.pos;
    }

    public void setPos(List<CatTheatrePo> pos) {
        this.pos = pos;
    }
}
