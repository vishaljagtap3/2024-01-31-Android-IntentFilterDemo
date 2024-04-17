package `in`.bitcode.intentfilterdemo

import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MyImageActivity : AppCompatActivity() {

    private lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        img = ImageView(this)
        setContentView(img)



        img.setImageURI(
            intent.data
        )

        //old
        /*if(intent.hasExtra("path")) {
            img.setImageURI(
                Uri.parse(
                    intent.getStringExtra("path")
                )
            )
        }*/
    }

}