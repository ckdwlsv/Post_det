package articelProject.dto;

import java.time.LocalDateTime;

public class ArticleDto {
    private int id;
    private String name;
    private String title;
    private String content;
    private LocalDateTime inserted_date;
    private LocalDateTime updated_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getInserted_date() {
        return inserted_date;
    }

    public void setInserted_date(LocalDateTime inserted_date) {
        this.inserted_date = inserted_date;
    }

    public LocalDateTime getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(LocalDateTime updated_date) {
        this.updated_date = updated_date;
    }
}
