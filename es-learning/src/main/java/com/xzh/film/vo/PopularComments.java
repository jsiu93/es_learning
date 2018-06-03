package com.xzh.film.vo;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class PopularComments {

    private Rating rating;
    @JsonProperty("useful_count")
    private int usefulCount;
    private Author author;
    @JsonProperty("subject_id")
    private String subjectId;
    private String content;
    @JsonProperty("created_at")
    private String createdAt;
    private String id;
    public void setRating(Rating rating) {
         this.rating = rating;
     }
     public Rating getRating() {
         return rating;
     }

    public void setUsefulCount(int usefulCount) {
         this.usefulCount = usefulCount;
     }
     public int getUsefulCount() {
         return usefulCount;
     }

    public void setAuthor(Author author) {
         this.author = author;
     }
     public Author getAuthor() {
         return author;
     }

    public void setSubjectId(String subjectId) {
         this.subjectId = subjectId;
     }
     public String getSubjectId() {
         return subjectId;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setCreatedAt(String createdAt) {
         this.createdAt = createdAt;
     }
     public String getCreatedAt() {
         return createdAt;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

}