package aj.intelligabble.android

import aj.intelligabble.IntelligabbleDataSource
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.material.ListItem
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
        val textState = remember { mutableStateOf(TextFieldValue()) }
        Column(Modifier.padding(16.dp)) {
            TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = textState.value,
                    onValueChange = { textState.value = it },
                    label = { Text("Search") },
                    leadingIcon = { Icon(Icons.Filled.Search) },
                    textStyle = TextStyle(fontSize = 16.sp)
            )
            LazyColumnFor(data.filterKeys { it.contains(textState.value.text) }.entries.toList()) { (term, description) ->
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
}
