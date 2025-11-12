package test.example.gridjetackcompose.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items

@Composable
fun ListSampleScreen(innerPadding: PaddingValues = PaddingValues()) {
    val listItems = remember { sampleData }

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)) {
        items(listItems) { item ->
            GridItemCard(item)
        }
    }
}
