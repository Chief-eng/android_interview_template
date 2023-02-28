import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.MaterialTheme
@Composable
fun ChiefHomeContent() {
    val chiefs = remember { DataProvider.chiefList }


    fun doubleColorModifier(modifier: Modifier, index: Int): Modifier {
        return modifier.fillMaxWidth()
            .padding(8.dp)
    }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        itemsIndexed(
            items = chiefs,
            itemContent = { index, chief ->
                ChiefListItem(
                    modifier = doubleColorModifier(Modifier, index)
                    .background(if(index%2 == 0) MaterialTheme.colors.primary else MaterialTheme.colors.secondary)
                        ,
                    chief = chief
                )
            })
    }
}

