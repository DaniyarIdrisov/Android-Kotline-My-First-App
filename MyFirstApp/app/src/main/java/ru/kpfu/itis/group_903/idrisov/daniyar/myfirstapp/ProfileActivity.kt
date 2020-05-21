package ru.kpfu.itis.group_903.idrisov.daniyar.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun toMainAct(view: View?) {
        val toMainIntent = Intent(this, MainActivity::class.java)
        startActivity(toMainIntent)
    }

}
