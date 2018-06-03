package com.xzh.film.vo;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2018-01-22 17:22:26
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Entries {

    private String rating;
    private Date pubdate;
    private String title;
    private int wish;
    @JsonProperty("original_title")
    private String originalTitle;
    private int collection;
    @JsonProperty("orignal_title")
    private String orignalTitle;
    private String stars;
    private Images images;
    private String id;
    public void setRating(String rating) {
         this.rating = rating;
     }
     public String getRating() {
         return rating;
     }

    public void setPubdate(Date pubdate) {
         this.pubdate = pubdate;
     }
     public Date getPubdate() {
         return pubdate;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setWish(int wish) {
         this.wish = wish;
     }
     public int getWish() {
         return wish;
     }

    public void setOriginalTitle(String originalTitle) {
         this.originalTitle = originalTitle;
     }
     public String getOriginalTitle() {
         return originalTitle;
     }

    public void setCollection(int collection) {
         this.collection = collection;
     }
     public int getCollection() {
         return collection;
     }

    public void setOrignalTitle(String orignalTitle) {
         this.orignalTitle = orignalTitle;
     }
     public String getOrignalTitle() {
         return orignalTitle;
     }

    public void setStars(String stars) {
         this.stars = stars;
     }
     public String getStars() {
         return stars;
     }

    public void setImages(Images images) {
         this.images = images;
     }
     public Images getImages() {
         return images;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

}