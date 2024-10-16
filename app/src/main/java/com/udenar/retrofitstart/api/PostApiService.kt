package com.udenar.retrofitstart.api

import retrofit2.http.GET

interface PostApiService {
    //Atravez de esto se complementa la url con posts
    @GET("posts")
    suspend fun getUserPost(): ArrayList<PostModel>
}
