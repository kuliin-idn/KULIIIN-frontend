package ray.kotlin.kuliin.client

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Workers_Marketplace(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Box(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .height(100.dp)
                .width(411.dp)
                .background(color = Color.Red.copy(alpha = 0.1f))
        ) {

        }
        ElevatedCard(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .height(170.dp)
                .width(370.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()) {
                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .size(70.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.4f),
                    shape = CircleShape,
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }

                Surface(
                    onClick = { navController.navigate("Workers_Profile") },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .width(120.dp)
                        .height(60.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }
            }
        }

        ElevatedCard(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .height(170.dp)
                .width(370.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()) {
                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .size(70.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.4f),
                    shape = CircleShape,
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }

                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .width(120.dp)
                        .height(60.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }
            }
        }

        ElevatedCard(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .height(170.dp)
                .width(370.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()) {
                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .size(70.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.4f),
                    shape = CircleShape,
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }

                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .width(120.dp)
                        .height(60.dp)
                        .padding(4.dp),
                    color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }
            }
        }


    }
}

