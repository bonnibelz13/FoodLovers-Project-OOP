package code.kao.database;

import java.io.Serializable;
import javax.swing.*;

public abstract class Food implements Serializable{
    
    protected String name;
    protected ImageIcon picture;

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public ImageIcon getPicture() {
        return picture;
    }
    
    public abstract String showDetail();
}
