import com.sun.net.httpserver.Headers;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder<T> {

    private String url;
    private HttpMethod method;
    private Map<String, String> headers = new HashMap<String, String>();
    private  Map<String, String> queryParams = new HashMap<String, String>();
    private T body = null;

    public HttpRequestBuilder<T> AddToHeader(String key, String value)
    {
        headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder<T> SetMehod(HttpMethod method)
    {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder<T> SetUrl(String url)
    {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder<T> AddQueryString(String key, String value)
    {
        queryParams.put(key, value);
        return this;
    }

    public  HttpRequestBuilder<T> SetBody(T body)
    {
        this.body = body;
        return this;
    }
}
