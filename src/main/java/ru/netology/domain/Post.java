package ru.netology.domain;

public class Post {
    private String text;
    private int data;
    private int userId;
    private int postId;
    private String buttonComment;
    private String buttonLike;
    private int viewsPost;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getButtonComment() {
        return buttonComment;
    }

    public void setButtonComment(String buttonComment) {
        this.buttonComment = buttonComment;
    }

    public String getButtonLike() {
        return buttonLike;
    }

    public void setButtonLike(String buttonLike) {
        this.buttonLike = buttonLike;
    }

    public int getViewsPost() {
        return viewsPost;
    }

    public void setViewsPost(int viewsPost) {
        this.viewsPost = viewsPost;
    }
}
