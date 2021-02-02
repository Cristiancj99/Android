package com.example.practicaandroid.retrofit;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;

    // (0): Indicar la API key personal asignada
    private static final String API_KEY = "dc49846bb941a95376a9229ac867807c";
    private static final String BASE_URL = "https://api.themoviedb.org/3/";
    private static final String LANGUAGE = "es";


    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static String getApiKey () {
        return API_KEY;
    }

    public static String getLanguage() { return LANGUAGE; }
}