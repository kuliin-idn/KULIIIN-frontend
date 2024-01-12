package ray.kotlin.kuliin.client

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ray.kotlin.kuliin.data.api.model.KuliData

@Composable
fun Workers_Profile(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.4f))
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(10.dp)
                        .size(70.dp),
                    color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.1f),
                    shape = CircleShape,
                    border = BorderStroke(0.5.dp, Color.LightGray)
                ) {
                }

                Text(
                    text = "",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        color = MaterialTheme.colorScheme.onSecondaryContainer.copy(
                            alpha = 0.05f
                        )
                    )
            )
            Text(
                modifier = Modifier.padding(vertical = 15.dp),
                text = "kuliDataItem.Description",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Justify,
            )
        }

        
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
        )
        {
            ExtendedFloatingActionButton(
                onClick = {
                    /* do something */
                },
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(text = "Keranjang")
            }
            ExtendedFloatingActionButton(
                onClick = {
                    /* do something */
                },
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(text = "Pesan Segera")
            }
        }
    }
}


