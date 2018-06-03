package com.xzh.film.vo;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Bloopers {

    private String medium;
    private String title;
    @JsonProperty("subject_id")
    private String subjectId;
    private Date alt;
    private String small;
    @JsonProperty("resource_url")
    private String resourceUrl;
    private String id;
    public void setMedium(String medium) {
         this.medium = medium;
     }
     public String getMedium() {
         return medium;
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

    public void setAlt(Date alt) {
         this.alt = alt;
     }
     public Date getAlt() {
         return alt;
     }

    public void setSmall(String small) {
         this.small = small;
     }
     public String getSmall() {
         return small;
     }

    public void setResourceUrl(String resourceUrl) {
         this.resourceUrl = resourceUrl;
     }
     public String getResourceUrl() {
         return resourceUrl;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

}