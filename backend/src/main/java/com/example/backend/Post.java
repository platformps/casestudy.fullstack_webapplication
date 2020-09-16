package com.example.backend;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    private Integer id;
    private String userName;
    private String albumName;
    private String postTitle;
    private String postDesc;
    private String postDate;
    private String postimgURL;


    public Post(Integer id, String userName, String albumName, String postTitle, String postDesc, String postDate, String postimgURL) {
        this.id = id;
        this.userName = userName;
        this.albumName = albumName;
        this.postTitle = postTitle;
        this.postDesc = postDesc;
        this.postDate = postDate;
        this.postimgURL = postimgURL;
    }

    public Post () {}

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDedc(String postDedc) {
        this.postDesc = postDesc;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostimgURL() {
        return postimgURL;
    }

    public void setPostimgURL(String postimgURL) {
        this.postimgURL = postimgURL;
    }
}
