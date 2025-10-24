package main.model.entities;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private ZonedDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(ZoneId zone, String title, String content) {
        this.moment = ZonedDateTime.now(zone);
        this.title = title;
        this.content = content;
        this.likes = 0;
    }

    public ZonedDateTime getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addLikes() {
        this.likes += 1;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post [moment=" + moment + ", title=" + title + ", content=" + content + ", likes=" + likes + "]";
    }

    
    
}
