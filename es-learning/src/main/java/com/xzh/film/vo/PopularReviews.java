package com.xzh.film.vo;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class PopularReviews {

    private Rating rating;
    private String title;
    @JsonProperty("subject_id")
    private String subjectId;
    private Author author;
    private String summary;
    private String alt;
    private String id;
    public void setRating(Rating rating) {
         this.rating = rating;
     }
     public Rating getRating() {
         return rating;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setSubjectId(String subjectId) {
         this.subjectId = subjectId;
     }
     public String getSubjectId() {
         return subjectId;
     }

    public void setAuthor(Author author) {
         this.author = author;
     }
     public Author getAuthor() {
         return author;
     }

    public void setSummary(String summary) {
         this.summary = summary;
     }
     public String getSummary() {
         return summary;
     }

    public void setAlt(String alt) {
         this.alt = alt;
     }
     public String getAlt() {
         return alt;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

}