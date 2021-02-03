package com.nfproject.questionapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener{
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Please enter your name",
                    Toast.LENGTH_SHORT)
                    .show()
        }else {
                val intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString() )
                startActivity(intent)
                finish()
            }
        }
    }
}