package observer1;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.news = ((String) news);
    }
}
