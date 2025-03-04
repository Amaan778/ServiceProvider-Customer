package com.app.serviceprovidercust.auth

import android.app.Dialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.serviceprovidercust.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btn: Button
    private lateinit var reg: TextView
    private lateinit var auth: FirebaseAuth
    private var diaog: Dialog?=null
    var sharedPreferences: SharedPreferences?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



    }

    private fun saved(){
        sharedPreferences=applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        val editor=sharedPreferences!!.edit()
        editor.putBoolean("clicked",true)
        editor.apply()
    }

    private fun restore():Boolean{
        sharedPreferences=applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        return sharedPreferences!!.getBoolean("clicked",false)
    }

    private fun showdialog(){
        diaog= Dialog(this)
        diaog?.setContentView(R.layout.progress_dialog)
        diaog?.setCancelable(false)
        diaog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        diaog?.show()
    }
}