package test.example.gridjetackcompose.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Grid Example") })
        }
    ) {
        GridSampleScreen(it) // this will display vertical grid
        // GridHorizontalSampleScreen(it)  //uncomment the line to display horizontal grid
        //ListSampleScreen(it) // uncomment the line to display LazyColumn
    }

}
