package ray.kotlin.kuliin.data.api.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("kuli")
    fun getData(): Call<List<KuliDataItem>>
}
