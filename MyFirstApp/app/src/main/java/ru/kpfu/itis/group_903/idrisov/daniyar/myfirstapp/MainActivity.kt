package ru.kpfu.itis.group_903.idrisov.daniyar.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toProfAct(view: View?) {
        val toProfileIntent = Intent(this, ProfileActivity::class.java)
        var email : String = findViewById<EditText>(R.id.email).text.toString()
        var pass: String = findViewById<EditText>(R.id.password).text.toString()
        if (email.equals(email1) && pass.equals(pass1)) {
            startActivity(toProfileIntent)
        }
        else{
            if (email.equals(email2) && pass.equals(pass2)) {
                startActivity(toProfileIntent)
            }
            else {
                Toast.makeText(this, "Wrong e-mail or password!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private var email1 = "daniyar.idrisov@itis.ru"
    private var pass1 = "Qwerty123"
    private var email2 = "da.id@it.ru"
    private var pass2 = "Qwerty456"

}
