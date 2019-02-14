package com.example.uibestpractice;

public class Msg {
    /**  type defines */
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;

    /**  attricutes  */
    private String content;
    private int type;

    /**  constructor method  */
    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    /**  getters */
    public String getContent() {
        return content;
    }
    public int getType() {
        return type;
    }
}