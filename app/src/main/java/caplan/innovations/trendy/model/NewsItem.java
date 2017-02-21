package caplan.innovations.trendy.model;

import android.os.Parcel;
import android.os.Parcelable;

import caplan.innovations.trendy.R;
import caplan.innovations.trendy.application.TrendyApplication;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsItem implements Parcelable {

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

    protected NewsItem(Parcel in) {
        title = in.readString();
        author = in.readString();
        urlToArticle = in.readString();
        description = in.readString();
        image = in.readString();
    }

    public static final Creator<NewsItem> CREATOR = new Creator<NewsItem>() {
        @Override
        public NewsItem createFromParcel(Parcel in) {
            return new NewsItem(in);
        }

        @Override
        public NewsItem[] newArray(int size) {
            return new NewsItem[size];
        }
    };

    public static NewsItem getDummy() {
        String title = "Android Course 101";
        String author = "Corey";
        String urlToArticle = "https://google.com";
        String description = TrendyApplication.context().getString(R.string.default_news_description);
        return new NewsItem(title, author, urlToArticle, description, null);
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);

        dest.writeByte((byte) (author != null ? 0x01 : 0x00));
        if (author != null) {
            dest.writeString(author);
        }
        dest.writeString(urlToArticle);
        dest.writeString(description);
        dest.writeString(image);
    }
}
