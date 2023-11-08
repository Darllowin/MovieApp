package com.example.appfilms

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appfilms.databinding.RegLayoutBinding

class RegActivity: AppCompatActivity() {
    private lateinit var binding: RegLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        binding.apply {
            auth.setOnClickListener {
                val intent = Intent(this@RegActivity, AuthActivity::class.java)
                startActivity(intent)
                finish()
            }

            reg.setOnClickListener {
                val userEmail = email.text.toString().trim()
                val userPass = pass.text.toString().trim()
                val userName = name.text.toString().trim()
                val userSurname = surname.text.toString().trim()
                val userTooPass = tooPass.text.toString().trim()

                if (userEmail.isEmpty() || userPass.isEmpty() || userName.isEmpty() || userSurname.isEmpty()
                    || userTooPass.isEmpty())
                    Toast.makeText(this@RegActivity, "Не все поля заполнены", Toast.LENGTH_LONG).show()
                else if (userTooPass != userPass)
                    Toast.makeText(this@RegActivity, "Пароли не совпадают", Toast.LENGTH_LONG).show()
                else if (!Patterns.EMAIL_ADDRESS.matcher(userEmail).matches())
                    Toast.makeText(this@RegActivity, "Почта введена неправильно", Toast.LENGTH_LONG).show()
                else {
                    val user = User(userEmail, userPass)
                    val db = DbHelper(this@RegActivity, null )

                    db.addUser(user)
                    Toast.makeText(this@RegActivity, "Пользователь $userEmail добавлен", Toast.LENGTH_LONG).show()
                    email.text.clear()
                    pass.text.clear()
                    name.text.clear()
                    surname.text.clear()
                    tooPass.text.clear()

                    val intent = Intent(this@RegActivity, MainLayoutActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}