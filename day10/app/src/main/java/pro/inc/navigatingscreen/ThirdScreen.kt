package pro.inc.navigatingscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pro.inc.navigatingscreen.ui.theme.NavigatingScreenTheme


@Composable
fun ThirdScreen(navigatorToFirstScreen:() -> Unit){

    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is the Third screen",
            Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineMedium
        )

        Button(onClick = {
            navigatorToFirstScreen()
        }) {
            Text(text ="Navigate to first screen",
                Modifier.padding(16.dp)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview() {
    NavigatingScreenTheme {
        ThirdScreen({})
    }
}
