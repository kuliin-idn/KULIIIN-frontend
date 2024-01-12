package ray.kotlin.kuliin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ray.kotlin.kuliin.client.Home
import ray.kotlin.kuliin.client.Login
import ray.kotlin.kuliin.client.Workers_Marketplace
import ray.kotlin.kuliin.client.Workers_Profile
import ray.kotlin.kuliin.data.api.model.ApiInterface
import ray.kotlin.kuliin.data.api.model.KuliData
import ray.kotlin.kuliin.data.api.model.KuliDataItem
import ray.kotlin.kuliin.ui.theme.KULIINTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : ComponentActivity() {

    val  BASE_URL = "https://dummy-api-kuliiin-test.vercel.app/"

    private fun getKuliData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<KuliDataItem>?> {
            override fun onResponse(
                call: Call<List<KuliDataItem>?>,
                response: Response<List<KuliDataItem>?>
            ) {
                val responseBody = response.body()!!
            }

            override fun onFailure(call: Call<List<KuliDataItem>?>, t: Throwable) {
                Log.d("MainActivity","onFailure: "+t.message)
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getKuliData()
        setContent {


            KULIINTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "Login"
                    ) {

                        composable("Login") {
                            Login(navController)
                        }

                        composable("Home") {
                            Home(navController)
                        }

                        composable("Workers_Marketplace") {
                            Workers_Marketplace(navController)
                        }

                        composable("Workers_Profile") {
                            Workers_Profile(navController)
                        }
                    }
                }
            }
        }
    }
}



