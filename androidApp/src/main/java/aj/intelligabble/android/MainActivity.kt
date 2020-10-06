package aj.intelligabble.android

import aj.intelligabble.IntelligabbleDataSource
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Design the UI in Jetpack Compose
        setContentView(R.layout.activity_main)
        // TODO: Show the data on UI
        val data = IntelligabbleDataSource.getData()
    }
}
