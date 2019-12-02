package fr.delcey.nino.htmlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        textview_1.setText(R.string.html_text)
        textview_1.movementMethod = LinkMovementMethod.getInstance()

        textview_2.text = getText(R.string.html_text)
        textview_2.movementMethod = LinkMovementMethod.getInstance()

        textview_3.text = getString(R.string.html_text)
        textview_3.movementMethod = LinkMovementMethod.getInstance()

        textview_4.setText(R.string.html_text)

        textview_5.setText(R.string.a_link)
    }
}
