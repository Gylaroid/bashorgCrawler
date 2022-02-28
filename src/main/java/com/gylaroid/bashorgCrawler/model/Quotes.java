package com.gylaroid.bashorgCrawler.model;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Quotes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String title) {
        this.text = title;
    }
}
