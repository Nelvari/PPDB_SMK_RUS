package com.example.loginonlyonce.Model;

public class ModelClass {

    private String tvtitle;
    private String tvisi;
    private String tvtype;


    public ModelClass (String tvtitle, String tvisi, String tvwaktu) {
        this.tvtitle = tvtitle;
        this.tvisi = tvisi;
        this.tvtype = tvwaktu;

    }


    public String getTvtitle() {
        return tvtitle;
    }

    public void setTvtitle(String tvtitle) {
        this.tvtitle = tvtitle;
    }

    public String getTvisi() {
        return tvisi;
    }

    public void setTvisi(String tvisi) {
        this.tvisi = tvisi;
    }

    public String getTvtype() {
        return tvtype;
    }

    public void setTvtype(String tvtype) {
        this.tvtype = tvtype;
    }
}
