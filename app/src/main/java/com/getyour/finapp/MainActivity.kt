package com.getyour.finapp

<<<<<<< HEAD
=======
import android.content.Intent
>>>>>>> 82e404f (Initial commit)
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
<<<<<<< HEAD
=======
import com.getyour.finapp.home.HomeFragment
import com.getyour.finapp.profile.ProfileFragment
import com.getyour.finapp.settings.SettingsActivity
import com.getyour.finapp.settings.SettingsFragment
>>>>>>> 82e404f (Initial commit)

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
<<<<<<< HEAD
//        btnSettings.setOnClickListener {
//            val intent = Intent(this,SettingsActivity::class.java)
//            intent.putExtra("username","Indra")
//            startActivity(intent)
//        }
=======
        btnSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            intent.putExtra("username","Indra")
            startActivity(intent)
        }
>>>>>>> 82e404f (Initial commit)


        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
<<<<<<< HEAD
        btnSettings.setOnClickListener {
            loadFragment(SettingsFragment())
        }
=======
//        btnSettings.setOnClickListener {
//            loadFragment(SettingsFragment())
//        }
>>>>>>> 82e404f (Initial commit)



    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commitNow()
    }
}