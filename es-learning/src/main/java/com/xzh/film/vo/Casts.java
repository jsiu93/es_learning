package com.xzh.film.vo;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Casts {

    private Avatars avatars;
    @JsonProperty("name_en")
    private String nameEn;
    private String name;
    private String alt;
    private String id;
    public void setAvatars(Avatars avatars) {
         this.avatars = avatars;
     }
     public Avatars getAvatars() {
         return avatars;
     }

    public void setNameEn(String nameEn) {
         this.nameEn = nameEn;
     }
     public String getNameEn() {
         return nameEn;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
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