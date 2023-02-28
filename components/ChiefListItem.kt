import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme

@Composable
fun ChiefListItem(
    modifier: Modifier = Modifier,
    chief: Chief
) {
    Card(
        modifier = modifier.padding(8.dp),
        elevation = Elevations.MinimumElevation,
        shape = MaterialTheme.shapes.small
        ) {
        Column {
            Text(
                text = chief.title,
                style = typography.h6
            )
            Text(
                text = "VIEW DETAIL",
                style = typography.caption
            )
        }
    }
}