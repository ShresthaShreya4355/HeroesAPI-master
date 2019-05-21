package api;

import java.util.List;

import model.Heroes;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface HeroesAPI {

   // @POST("heroes")
    //Call<Void> registerHeroes(@Body Heroes heroes);

    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHeroes(@Field("name") String name, @Field("desc") String desc);

    @GET("heroes")
    Call<List<Heroes>> getHeroes();

}
