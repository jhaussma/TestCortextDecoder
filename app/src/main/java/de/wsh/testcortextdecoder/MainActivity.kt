package de.wsh.testcortextdecoder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import de.wsh.testcortextdecoder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btStartScan.setOnClickListener {
            Log.d("testCortex", "Start ScanActivity..")
            startActivity(Intent(this, ScanActivity::class.java))
        }


    }
}