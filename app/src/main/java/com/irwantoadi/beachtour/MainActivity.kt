package com.irwantoadi.beachtour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var doubleBackToExitOnce : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_1)
        val btn_menu_2: ImageButton = findViewById(R.id.btn_menu_2)
        val btn_menu_3: ImageButton = findViewById(R.id.btn_menu_3)
        val btn_menu_4: ImageButton = findViewById(R.id.btn_menu_4)
        val btn_menu_5: ImageButton = findViewById(R.id.btn_menu_5)
        val btn_menu_6: ImageButton = findViewById(R.id.btn_menu_6)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu1Activity::class.java)
            startActivity(intent)
        }
        btn_menu_2.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu2Activity::class.java)
            startActivity(intent)
        }
        btn_menu_3.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu3Activity::class.java)
            startActivity(intent)
        }
        btn_menu_4.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu4Activity::class.java)
            startActivity(intent)
        }
        btn_menu_5.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu5Activity::class.java)
            startActivity(intent)
        }
        btn_menu_6.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu6Activity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true;

        Toast.makeText(this, "Tekan satu kali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}