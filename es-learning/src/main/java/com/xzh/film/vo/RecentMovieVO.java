package com.xzh.film.vo;
import java.util.List;

/**
 * Auto-generated: 2018-01-22 17:22:26
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class RecentMovieVO {

    private String title;
    private int total;
    private List<Entries> entries;
    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setEntries(List<Entries> entries) {
         this.entries = entries;
     }
     public List<Entries> getEntries() {
         return entries;
     }

}