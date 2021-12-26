/**
  * Copyright 2021 json.cn 
  */
package cn.edu.bistu.music.bean;
import java.util.List;

/**
 * Auto-generated: 2021-12-18 13:57:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Songs {

    private long id;
    private String name;
    private List<Artists> artists;
    private Album album;
    private long duration;
    private String copyrightId;
    private String status;
    private List<String> alias;
    private String rtype;
    private String ftype;
    private List<String> transNames;
    private long mvid;
    private String fee;
    private String rUrl;
    private String mark;
    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setArtists(List<Artists> artists) {
         this.artists = artists;
     }
     public List<Artists> getArtists() {
         return artists;
     }

    public void setAlbum(Album album) {
         this.album = album;
     }
     public Album getAlbum() {
         return album;
     }

    public void setDuration(long duration) {
         this.duration = duration;
     }
     public long getDuration() {
         return duration;
     }

    public void setCopyrightId(String copyrightId) {
         this.copyrightId = copyrightId;
     }
     public String getCopyrightId() {
         return copyrightId;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setAlias(List<String> alias) {
         this.alias = alias;
     }
     public List<String> getAlias() {
         return alias;
     }

    public void setRtype(String rtype) {
         this.rtype = rtype;
     }
     public String getRtype() {
         return rtype;
     }

    public void setFtype(String ftype) {
         this.ftype = ftype;
     }
     public String getFtype() {
         return ftype;
     }

    public void setTransNames(List<String> transNames) {
         this.transNames = transNames;
     }
     public List<String> getTransNames() {
         return transNames;
     }

    public void setMvid(long mvid) {
         this.mvid = mvid;
     }
     public long getMvid() {
         return mvid;
     }

    public void setFee(String fee) {
         this.fee = fee;
     }
     public String getFee() {
         return fee;
     }

    public void setRUrl(String rUrl) {
         this.rUrl = rUrl;
     }
     public String getRUrl() {
         return rUrl;
     }

    public void setMark(String mark) {
         this.mark = mark;
     }
     public String getMark() {
         return mark;
     }

}