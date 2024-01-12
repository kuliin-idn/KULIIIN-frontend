package ray.kotlin.kuliin.client

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController

@Composable
fun Login(navController: NavHostController) {
    Column(modifier = Modifier.padding(vertical = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .padding(vertical = 15.dp)
            .height(500.dp)
            .width(360.dp)
            .background(color = Color.Green.copy(alpha = 0.2f)))

        ElevatedButton(
            onClick =  {navController.navigate("Home")},
            modifier = Modifier
                .padding(15.dp)
                .width(120.dp)
                .height(50.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer)
        ) {

        }

    }
}




