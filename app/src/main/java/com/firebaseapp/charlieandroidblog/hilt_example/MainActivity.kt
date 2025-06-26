package com.firebaseapp.charlieandroidblog.hilt_example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.firebaseapp.charlieandroidblog.hilt_example.domain.MyCustomObject
import com.firebaseapp.charlieandroidblog.hilt_example.ui.UtilsUi
import com.firebaseapp.charlieandroidblog.hilt_example.ui.theme.Hilt_exampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    @Named("myObject")
    lateinit var myCustomObject: MyCustomObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Log.d("zzzz", "onCreate: "+myCustomObject.nombre)

        setContent {
            Hilt_exampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        nombre = myCustomObject.nombre,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(nombre: String, modifier: Modifier = Modifier) {
    var name = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Spacer(modifier = Modifier.fillMaxWidth().height(150.dp))
        Text(text = nombre,modifier.testTag("my_tag"))
        Spacer(modifier = Modifier.fillMaxWidth().height(20.dp))
        TextField(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            value = name.value,
            onValueChange = {
                name.value = it
            },
            label = { Text(text = "E - mail") },
            placeholder = { Text(text = "E-mail") }
        )
        TextField(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Password.") }
        )

        Button(
            onClick = {
                Log.d("zzz", "getLoginElements: ")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
        ) {
            Text("Login", color = Color.White)
        }
        Button(
            onClick = {
                Log.d("zzz", "getLoginElements: ")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
        ) {
            Text("Enter No Login", color = Color.White)
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Hilt_exampleTheme {
        Greeting("Android")
    }
}
/*
for dependencies in gradle project add
id("com.google.dagger.hilt.android") version "2.55" apply false

in gradle modelue add:  this plugins
    id ("kotlin-android")
    id ("dagger.hilt.android.plugin")
    id("kotlin-kapt")

and this dependencies:
    implementation("com.google.dagger:hilt-android:2.55")
    kapt("com.google.dagger:hilt-compiler:2.55")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.55")
    androidTestAnnotationProcessor("com.google.dagger:hilt-compiler:2.55")
    testImplementation("com.google.dagger:hilt-android-testing:2.55")
    testAnnotationProcessor("com.google.dagger:hilt-compiler:2.55")

 */