package Application;

import java.io.Serializable;

public class MyLocation implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private int xcoord;
    private int ycoord;
    private String shortNote;
    private String comments;

    public MyLocation(){
    }

    public int getID(){
        return id;
    }
    public int getXcoord(){
        return xcoord;
    }
    public int getYcoord(){
        return ycoord;
    }
    public String getShortNote(){
        return shortNote;
    }
    public String getComments(){
        return comments;
    }
    public void setId(int NewId){
        this.id = NewId;
    }
    public void setX(int NewX){
        this.xcoord = NewX;
    }
    public void setY(int NewY){
        this.ycoord = NewY;
    }
    public void setShortNote(String NewNote){
        this.shortNote = NewNote;
    }
    public void setComments(String NewComment){
        this.comments = NewComment;
    }
}