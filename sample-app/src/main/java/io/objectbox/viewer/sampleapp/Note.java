package io.objectbox.viewer.sampleapp;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Generated;
import io.objectbox.annotation.Id;

@Entity
public class Note {

    @Id
    private long id;

    private String text;
    private Date date;

    @Generated(hash = 1395965113)
    public Note(long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.date = date;
    }

    @Generated(hash = 1272611929)
    public Note() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }

}
