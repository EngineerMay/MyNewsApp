package com.example.mayankchauhan.mynews.NavigationNews;

/**
 * Created by mayankchauhan on 16/04/17.
 */

public class NavigatedListNews {

    private String img;
    private String desc;

    public NavigatedListNews() {
    }

    public NavigatedListNews(String img, String desc) {
        this.img = img;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
