package com.example.unitexml

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnEnable : Button
    private lateinit var btnDisable : Button
    private lateinit var btnTest : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 利用起来整块屏幕
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnEnable = findViewById(R.id.enable)
        btnDisable = findViewById(R.id.disable)
        btnTest = findViewById(R.id.test)

        btnEnable.setOnClickListener(this)
        btnDisable.setOnClickListener(this)
        btnTest.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.enable -> {
                btnTest.isEnabled = true
                btnTest.text = "启用了"
            }
            R.id.disable -> {
                btnTest.isEnabled = false
                btnTest.text = "禁用了"
            }
            R.id.test -> {
                val intent1 = Intent(this, MainActivity2::class.java)
                intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent1)
            }
        }
    }
}