package com.example.appfilms

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import com.example.appfilms.databinding.MainLayoutBinding

class MainLayoutActivity : AppCompatActivity() {
    private lateinit var binding: MainLayoutBinding
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            reklamFilm.setOnClickListener {
                val intent = Intent(this@MainLayoutActivity, MoveActivity::class.java).apply {
                    putExtra("key", "a1")
                }
                startActivity(intent)
            }
            mainLayout.children.filterIsInstance<ImageButton>().forEach { imageButton ->
                imageButton.setOnClickListener {
                    val buttonText = imageButton.tag.toString()

                    val intent = Intent(this@MainLayoutActivity, MoveActivity::class.java).apply {
                        putExtra("key", buttonText)
                    }
                    startActivity(intent)
                }
            }
            secondLayout.children.filterIsInstance<ImageButton>().forEach { imageButton ->
                imageButton.setOnClickListener {
                    val buttonText = imageButton.tag.toString()

                    val intent = Intent(this@MainLayoutActivity, MoveActivity::class.java).apply {
                        putExtra("key", buttonText)
                    }
                    startActivity(intent)
                }
            }

            imButton1.setOnClickListener {
                imButton1.setImageResource(R.drawable.action_active11)
                imButton2.setImageResource(R.drawable.action_inactive)
                imButton3.setImageResource(R.drawable.action_inactive_1)
                imButton4.setImageResource(R.drawable.action_inactive_2)
            }
            imButton2.setOnClickListener {
                imButton1.setImageResource(R.drawable.action_active1)
                imButton2.setImageResource(R.drawable.action_inactive1)
                imButton3.setImageResource(R.drawable.action_inactive_1)
                imButton4.setImageResource(R.drawable.action_inactive_2)
            }
            imButton3.setOnClickListener {
                imButton1.setImageResource(R.drawable.action_active1)
                imButton2.setImageResource(R.drawable.action_inactive)
                imButton3.setImageResource(R.drawable.action_inactive_11)
                imButton4.setImageResource(R.drawable.action_inactive_2)
            }
            imButton4.setOnClickListener {
                imButton1.setImageResource(R.drawable.action_active1)
                imButton2.setImageResource(R.drawable.action_inactive)
                imButton3.setImageResource(R.drawable.action_inactive_1)
                imButton4.setImageResource(R.drawable.action_inactive_22)
            }
            imButton5.setOnClickListener {
                val intent = Intent(this@MainLayoutActivity, AuthActivity::class.java)
                startActivity(intent)
            }
        }
    }
}