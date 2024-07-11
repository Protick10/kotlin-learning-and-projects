package pro.inc.locationapp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import pro.inc.locationapp.ui.theme.LocationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LocationAppTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()

                ) {
                    MyApp()

                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val context = LocalContext.current //Basically what it says is give me the context of the current activity that I'm in.
    val locationUtils = LocationUtils(context)
    LocationDisplay(locationUtils, context)

}

@Composable
fun LocationDisplay(
    locationUtils: LocationUtils,
    context: Context
){


    //this could be used for any permissions that could be requested
    val requestPermissionLauncher = rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestMultiplePermissions(),
        onResult = {permissions ->
            if (permissions[android.Manifest.permission.ACCESS_FINE_LOCATION] == true
                &&
                permissions[android.Manifest.permission.ACCESS_COARSE_LOCATION] == true){

                //have access to location

            }else{

                // this is where we would show a rationale for why we need the location permission
                // It will just hold information whether we should show the permission rationale.
                //
                //So the reason we want to have permission or not.
                //
                //So if we need to let the user know about our reasons why we want to have the permission, we need to
                //
                //give a good reason.
               val rationaleRequired = ActivityCompat.shouldShowRequestPermissionRationale(
                   context as MainActivity,  //So basically we're just saying don't open this permission rationale inside of another screen, do it in the main activity
                   android.Manifest.permission.ACCESS_FINE_LOCATION
               ) || ActivityCompat.shouldShowRequestPermissionRationale(
                   context as MainActivity,
                   android.Manifest.permission.ACCESS_COARSE_LOCATION
               )

                //So if we need to display why we need access, we're just going to display this.
                if(rationaleRequired){
                    Toast.makeText(context,
                        "Location permission is required for this feature work",
                        Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context,
                        "Location permission is required for this feature work. Please enable it in settings.",
                        Toast.LENGTH_SHORT).show()
                }

            }

        }
    )




    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text("Location not available")

        Button(onClick = {
            if(locationUtils.hasLocationPermission(context)){
                // permission already granted. update the location
            }
            else{
                // request permission


                //And this is where we're actually launching the requesting of those permissions.
                //
                //So here we're using our request permission launcher.
                //
                //Basically we set everything up here with this request permission launcher.
                requestPermissionLauncher.launch(arrayOf(
                    android.Manifest.permission.ACCESS_FINE_LOCATION,
                    android.Manifest.permission.ACCESS_COARSE_LOCATION
                ))
            }
        }) {
            Text("Get Location")
        }
    }

}