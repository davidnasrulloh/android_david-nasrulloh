package com.example.restaurantreview

import com.example.restaurantreview.RestaurantResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.*
import retrofit2.http.Path

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ) : Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id:String,
        @Field("name") name: String,
        @Field("review") review: String
    ) : Call <PostReviewResponse>
}