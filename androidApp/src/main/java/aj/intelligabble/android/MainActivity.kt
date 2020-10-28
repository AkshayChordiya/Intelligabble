package aj.intelligabble.android

import aj.intelligabble.IntelligabbleDataSource
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = IntelligabbleDataSource.getData()
        setContent {
            title = stringResource(id = R.string.appName)
            geekTermsList(data)
        }
    }

    @Composable
    fun geekTermsList(data: Map<String, String>) {
        LazyColumnFor(data.entries.toList()) { (term, description) ->
            ListItem(
                text = {
                    Text(term)
                },
                secondaryText = {
                   Text(description, modifier = Modifier.padding(vertical = 4.dp))
                },
            )
            Divider(color = Color(0x11000000))
        }
    }
}