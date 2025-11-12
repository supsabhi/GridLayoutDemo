package test.example.gridjetackcompose.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import test.example.gridjetackcompose.R
import test.example.gridjetackcompose.data.model.GridItem

val sampleData = listOf(
    GridItem(R.drawable.ic_launcher_foreground, "Sunset", "Nature", "Beautiful evening sky"),
    GridItem(R.drawable.ic_launcher_foreground, "Mountains", "Adventure", "Calm and peaceful"),
    GridItem(R.drawable.ic_launcher_foreground, "Ocean", "Travel", "Blue and endless"),
    GridItem(R.drawable.ic_launcher_foreground, "Desert", "Landscape", "Golden sands"),
    GridItem(R.drawable.ic_launcher_foreground, "Forest", "Wildlife", "Green and dense"),
    GridItem(R.drawable.ic_launcher_foreground, "City", "Urban", "Modern lifestyle")
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridSampleScreen(innerPadding: PaddingValues = PaddingValues()) {
    val gridItems = remember { sampleData }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // change to GridCells.Adaptive(150.dp) for dynamic sizing
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(gridItems) { item ->
            GridItemCard(item)
        }
    }
}

@Composable
fun GridHorizontalSampleScreen(innerPadding: PaddingValues = PaddingValues()) {
    val gridItems = remember { sampleData }

    LazyHorizontalGrid(
        rows = GridCells.Fixed(2), // change to GridCells.Adaptive(150.dp) for dynamic sizing
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(gridItems) { item ->
            HorizontalGridItemCard(item)
        }
    }
}

@Composable
fun GridItemCard(item: GridItem) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = item.title, style = MaterialTheme.typography.titleMedium)
            Text(
                text = item.subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = item.info, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun HorizontalGridItemCard(item: GridItem) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .height(100.dp)
            .width(220.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(12.dp))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = item.title, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = item.subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = item.info, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}