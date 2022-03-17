package app;
import java.io.Serializable;

public class MyLocation {
    private int id;
    private int xcoord;
    private int ycoord;
    private String shortNote;
    private String comments;

    public int getId() {return id;}
    public int getXcoord(){return xcoord;}
    public int getYcoord(){return ycoord;}
    public String getShortNote(){return shortNote;}
    public String getComments(){return comments;}

    public void setId(int id){this.id = id;}
    public void setXcoord(int xcoord){this.xcoord = xcoord;}
    public void setYcoord(int ycoord){this.ycoord = ycoord;}
    public void setShortNote(String shortNote){this.shortNote = shortNote;}
    public void setComments(String comments){this.comments = comments;}
}

