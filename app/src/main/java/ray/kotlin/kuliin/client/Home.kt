package ray.kotlin.kuliin.client

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Column (modifier = Modifier
        .padding(vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(modifier = Modifier
            .width(370.dp)
            .background(color = Color.Red.copy(alpha = 0.05f)),
            horizontalArrangement = Arrangement.End) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Menu, contentDescription = "Menu Button")
            }
        }

        Box(modifier = Modifier
            .padding(vertical = 15.dp)
            .height(200.dp)
            .width(370.dp)
            .background(color = Color.Green.copy(alpha = 0.2f)))

        Row(modifier = Modifier
            .padding(vertical = 15.dp)
            .width(370.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom) {
            CreateNavButton(onClick = {
                navController.navigate("Workers_Marketplace")
            })
            CreateNavButton()
            CreateNavButton()
            CreateNavButton()
            CreateNavButton()
        }

        Box(modifier = Modifier
            .padding(vertical = 15.dp)
            .height(350.dp)
            .width(350.dp)
            .background(color = Color.Magenta.copy(alpha = 0.1f)))
    }
}

@Composable
fun CreateNavButton(onClick: () -> Unit = {}) {
    ElevatedButton(
        onClick =  onClick,
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .width(50.dp)
            .height(50.dp),
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer)
    ) {

    }
}