package searchingphone;

public class Post {

    private final String title;
    private final String url;
    private final int price;

    public Post(String title, int price, String url) {
        this.title = title;
        this.url = url;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Post{" + "title=" + title + "\nurl=" + url + "\n price=" + price + "\n}";
    }

}
