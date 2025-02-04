import com.sun.net.httpserver.Headers;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder<T> {

    private String url;
    private String method;
    private Map<String, String> headers = new HashMap<String, String>();
    private  Map<String, String> queryParams = new HashMap<String, String>();
    private T body = null;

    public HttpRequestBuilder<T> AddToHeader(String key, String value)
    {
        headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder<T> SetMehod(String method)
    {
        method = method.toUpperCase();
        return this;
    }

    public HttpRequestBuilder<T> SetUrl(String url)
    {

        return this;
    }

    public HttpRequestBuilder<T> AddQueryString(String key, String value)
    {
        return this;
    }

    public  HttpRequestBuilder<T> SetBody(T value)
    {
        return this;
    }
}
