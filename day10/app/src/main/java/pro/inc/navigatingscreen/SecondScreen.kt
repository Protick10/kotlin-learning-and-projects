package pro.inc.navigatingscreen



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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

fun SecondScreen(name: String, age:Int, navigationToThirdScreen:() -> Unit) {
//    var name = remember {
//        mutableStateOf("")
//
//    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is the Second screen",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineMedium
        )

        Text("Welcome $name , $age",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineLarge
            )

//        OutlinedTextField(value = name.value, onValueChange = {
//            name.value = it
//        },
//            label = { Text("Enter your name") },
//            modifier = Modifier.padding(16.dp))

        Button(onClick = {
            navigationToThirdScreen()
        }) {
            Text(text ="Navigate to first screen",
                modifier = Modifier.padding(16.dp))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SecondGreetingPreview() {
    NavigatingScreenTheme {
        SecondScreen("Protick",25,{})
    }
}