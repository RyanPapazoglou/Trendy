package caplan.innovations.trendy.model;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsItem {

    private final String title;
    private final String author;
    private final String urlToArticle;
    private final String description;
    private final String image;

    public NewsItem(String title, String author, String urlToArticle, String description, String image){

        this.title = title;
        this.author = author;
        this.urlToArticle = urlToArticle;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrlToArticle() {
        return urlToArticle;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }



}
