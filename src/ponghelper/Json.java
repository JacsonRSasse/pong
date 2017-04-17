package ponghelper;

import com.google.gson.Gson;

public class Json {
    
    private static final Gson INSTANCE = new Gson();
    
    public static String toJson(Object src){
        return INSTANCE.toJson(src);
    }
    
    public static <T extends Object> T fromJson(String json, Class<T> classOfT){
        return INSTANCE.fromJson(json, classOfT);
    }
    
}
