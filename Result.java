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
public class Result {

    private List<Songs> songs;
    private boolean hasMore;
    private int songCount;
    public void setSongs(List<Songs> songs) {
         this.songs = songs;
     }
     public List<Songs> getSongs() {
         return songs;
     }

    public void setHasMore(boolean hasMore) {
         this.hasMore = hasMore;
     }
     public boolean getHasMore() {
         return hasMore;
     }

    public void setSongCount(int songCount) {
         this.songCount = songCount;
     }
     public int getSongCount() {
         return songCount;
     }

}