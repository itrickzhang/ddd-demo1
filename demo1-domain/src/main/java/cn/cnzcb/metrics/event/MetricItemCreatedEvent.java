package cn.cnzcb.metrics.event;

/**
 * Created by Administrator on 2019/12/26.
 */
public class MetricItemCreatedEvent {
    private String title;//文章标题
    private String url;//文章链接
    private long thumbsUpCount;//点赞数

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getThumbsUpCount() {
        return thumbsUpCount;
    }

    public void setThumbsUpCount(long thumbsUpCount) {
        this.thumbsUpCount = thumbsUpCount;
    }
}
