package unam.mx.simpletext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.MotionEvent
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById(R.id.textimage)
        val text = resources.openRawResource(R.raw.image).bufferedReader().use{it.readText() }
        textView.text=text
        //textView.movementMethod= ScrollingMovementMethod()
    }

}