import java.util.HashMap;
import java.util.Map;

public class HttpRequest<T> {

    private String url;
    private String method;
    private Map<String, String> headers = new HashMap<String, String>();
    private  Map<String, String> queryParams = new HashMap<String, String>();
    private T body = null;

    public HttpRequest(String url, String method, T body, Map<String, String> headers, Map<String, String> queryParams) {

        this.url = url;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.queryParams = queryParams;
    }

    @Override
    public String toString() {

        String Req =  "HttpRequest {" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body=" + body +
                '}';

        return Req;
    }
}
