package test.example.gridjetackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme

import androidx.compose.ui.tooling.preview.Preview
import test.example.gridjetackcompose.presentation.MainScreen
import test.example.gridjetackcompose.ui.theme.GridJetackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}

