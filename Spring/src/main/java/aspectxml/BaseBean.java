package aspectxml;

import aspectj.BaseInterface;

public class BaseBean implements  BaseInterface{
    
    private String author;
    private String songTitle;
    private Integer count=0;
    
    public Integer addSong(String author,String songTitle){
        this.author = author;
        this.songTitle = songTitle;
        System.out.println("新增了一首歌："+author+"-"+songTitle);
        count++;
        return count;
    }
    
    public Integer delSong(String author,String songTitle){
        this.author = author;
        this.songTitle = songTitle;
        System.out.println("删除了一首歌："+author+"-"+songTitle);
        count--;
        return count;
    }
}
