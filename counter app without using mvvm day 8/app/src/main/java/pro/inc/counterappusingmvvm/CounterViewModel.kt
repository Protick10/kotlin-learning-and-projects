package pro.inc.counterappusingmvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.room.util.copy
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun CounterViewModel(){
    var count by remember { mutableStateOf(0) }

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count",
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
            color = Color.Black,
            style = MaterialTheme.typography.headlineLarge,
            )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { increment() },
                modifier = Modifier.padding(8.dp),

            ) {
                Text(text = "Increment")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { decrement() },
                modifier = Modifier.padding(8.dp),

                ) {
                Text(text = "Decrement")
            }

        }




    }
}