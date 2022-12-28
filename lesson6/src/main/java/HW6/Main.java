package HW6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        String API_KEY_QUERY_PARAM = "apikey";
        String API_KEY = "EyPZ5l3Q7aAbVSCZ6PGd8AWrRbHA9GSq";
        String FORECASTS = "forecasts";
        String VERSION = "v1";
        String DAILY = "daily";
        String DAYS = "5day";
        String CITIES = "2323";
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegment(FORECASTS)
                .addPathSegment(VERSION)
                .addPathSegment(DAILY)
                .addPathSegment(DAYS)
                .addPathSegment(CITIES)
//                .addPathSegment("/forecasts/v1/daily/1day/2323")
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .build();
        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(request.url());
        System.out.println(response.body().string());

    }
}
