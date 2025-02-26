package com.firebaseapp.charlieandroidblog.hilt_example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.firebaseapp.charlieandroidblog.hilt_example.domain.MyCustomObject
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
                        name = myCustomObject.nombre,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name!",
        modifier = modifier
    )
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