package DataBase;

import javax.swing.*;

public abstract class Food {
    
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
