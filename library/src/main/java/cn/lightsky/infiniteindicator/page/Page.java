package cn.lightsky.infiniteindicator.page;

/**
 * Created by xushuai on 2014/12/25.
 */
public class Page {
    public String data;
    public Object url;
    public String href;
    public String actionType;
    public OnPageClickListener onPageClickListener;

    public Page(String data, Object url, String href, String actionType) {
        this.data = data;
        this.url = url;
        this.href = href;
        this.actionType = actionType;
    }

    public Page(String data, Object url, String href, String actionType, OnPageClickListener listener) {
        this.data = data;
        this.url = url;
        this.href = href;
        this.actionType = actionType;
        this.onPageClickListener = listener;
    }
}
