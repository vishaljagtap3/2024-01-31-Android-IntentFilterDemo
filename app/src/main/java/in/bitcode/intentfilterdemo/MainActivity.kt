package `in`.bitcode.intentfilterdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import `in`.bitcode.intentfilterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder().build()
        )


        binding.btnView.setOnClickListener {
            val intent = Intent("in.bitcode.media.VIEW")
            intent.addCategory("in.bitcode.category.GENERAL")
            intent.action = "in.bitcode.media.VIEW"
            intent.setDataAndType(
                Uri.parse("file://${binding.edtPath.text.toString()}"),
                "image/png"
            )
            //intent.putExtra("path", "file://${binding.edtPath.text.toString()}")
            startActivity(intent)
        }
    }
}