package com.getyour.finapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSettings: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_Profil)
        btnSettings = findViewById(R.id.btn_settings)

//        btnHome.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username","Indra")
//            startActivity(intent)
//        }
//        btnProfile.setOnClickListener {
//            val intent = Intent(this,ProfileActivity::class.java)
//            intent.putExtra("username","Indra")
//            startActivity(intent)
//        }
//        btnSettings.setOnClickListener {
//            val intent = Intent(this,SettingsActivity::class.java)
//            intent.putExtra("username","Indra")
//            startActivity(intent)
//        }


        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
        btnSettings.setOnClickListener {
            loadFragment(SettingsFragment())
        }



    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commitNow()
    }
}