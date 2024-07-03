package pro.inc.navigatingscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pro.inc.navigatingscreen.ui.theme.NavigatingScreenTheme

@Composable

fun FirstScreen(navigationToSecondScreen:(String, Int) -> Unit) {
    var name = remember {
        mutableStateOf("")

    }

    var age = remember {
        mutableStateOf("")
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is the first screen",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineMedium
        )

        OutlinedTextField(value = name.value, onValueChange = {
            name.value = it
        },
            label = { Text("Enter your name") },
            modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = age.value, onValueChange = {
            age.value = it
        },

        )


        Button(onClick = {
            val ageInt = try {
                age.value.toInt()
            } catch (e: NumberFormatException) {
                // handle the exception (e.g., show a toast message to the user)
                25
            }
            navigationToSecondScreen(name.value, ageInt)
        }) {
            Text(text ="Navigate to second screen",
                modifier = Modifier.padding(16.dp))
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NavigatingScreenTheme {
//        FirstScreen({})
//    }
//}