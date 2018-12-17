package elasticsearch.elasticsearch_sgbd.rest;

import retrofit2.Call;
import retrofit2.http.*;
import elasticsearch.elasticsearch_sgbd.entity.*;

import java.util.List;

public interface ElasticSearchAPI {

    @GET("/productes/producte/{id}")
    Call<Producte> getProducte(@Path("id") int id);

    @GET("/productes/producte/_search")
    Call<List<Productes>> nproductes(@Query("from") int from, @Query("size") int size);

    /*{
        "from": 0,
            "size": 10
    }*/
}