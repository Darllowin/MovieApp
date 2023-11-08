package com.example.appfilms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appfilms.databinding.AuthLayoutBinding

class AuthActivity : AppCompatActivity() {
    lateinit var  binding: AuthLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AuthLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        binding.apply {
            reg.setOnClickListener {
                val intent = Intent(this@AuthActivity, RegActivity::class.java)
                startActivity(intent)
                finish()
            }

            auth.setOnClickListener {
                val userEmail = email.text.toString().trim()
                val userPass = pass.text.toString().trim()

                if (userEmail.isEmpty() || userPass.isEmpty())
                    Toast.makeText(this@AuthActivity, "Не все поля заполнены", Toast.LENGTH_LONG).show()
                else {
                    val db = DbHelper(this@AuthActivity, null )
                    val isAuth = db.getUser(userEmail, userPass)

                    if (isAuth) {
                        Toast.makeText(this@AuthActivity, "Пользователь $userEmail авторизован", Toast.LENGTH_LONG).show()
                        email.text.clear()
                        pass.text.clear()

                        val intent = Intent(this@AuthActivity, MainLayoutActivity::class.java)
                        startActivity(intent)
                    } else
                        Toast.makeText(this@AuthActivity, "Пользователь $userEmail не авторизован", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}