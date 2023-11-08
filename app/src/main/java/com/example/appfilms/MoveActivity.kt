package com.example.appfilms

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appfilms.databinding.ActivityMoveBinding

class MoveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val message = intent.getStringExtra("key")

        binding.apply {
            backButton.setOnClickListener {
                finish()
            }
            when(message) {
                "a1" -> {
                    mainImg.setImageResource(R.drawable.primer_film)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.the_magicians)
                    opisFilm.text = resources.getText(R.string.opisFilm)
                    image1.setImageResource(R.drawable.themagicians)
                    image2.setImageResource(R.drawable.themagicians2)
                    image3.setImageResource(R.drawable.themagicians3)
                }
                "a" -> {
                    mainImg.setImageResource(R.drawable.lucifer_alt_oblozhka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.luciferName)
                    opisFilm.text = resources.getText(R.string.luciferOpis)
                    image1.setImageResource(R.drawable.lucifer_frame_1)
                    image2.setImageResource(R.drawable.lucifer_frame_2)
                    image3.setImageResource(R.drawable.lucifer_frame_3)
                }
                "b" -> {
                    mainImg.setImageResource(R.drawable.got_alt_oblozhka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.gotName)
                    opisFilm.text = resources.getText(R.string.gotOpis)
                    image1.setImageResource(R.drawable.got_frame_1)
                    image2.setImageResource(R.drawable.got_frame_2)
                    image3.setImageResource(R.drawable.got_frame_3)
                }
                "c" -> {
                    mainImg.setImageResource(R.drawable.sex_educ_alt_oblozhkajpg)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.sexEduc)
                    opisFilm.text = resources.getText(R.string.sexEducOpis)
                    image1.setImageResource(R.drawable.sex_educ_frame_1)
                    image2.setImageResource(R.drawable.sex_educ_frame_2)
                    image3.setImageResource(R.drawable.sex_educ_frame_3)
                }
                "d" -> {
                    mainImg.setImageResource(R.drawable.reason_why_alt_oblozhka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.reasonWhyName)
                    opisFilm.text = resources.getText(R.string.reasonWhyOpis)
                    image1.setImageResource(R.drawable.reason_why_frame_1)
                    image2.setImageResource(R.drawable.reason_why_frame_2)
                    image3.setImageResource(R.drawable.reason_why_frame_3)
                }
                "e" -> {
                    mainImg.setImageResource(R.drawable.the_walking_dead_alt_oblochka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.theWalkingDeadName)
                    opisFilm.text = resources.getText(R.string.theWalkingDeadOpis)
                    image1.setImageResource(R.drawable.the_walking_dead_frame_1)
                    image2.setImageResource(R.drawable.the_walking_dead_frame_2)
                    image3.setImageResource(R.drawable.the_walking_dead_frame_3)
                }
                "f" -> {
                    mainImg.setImageResource(R.drawable.west_world_alt_oblochka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.westWorldName)
                    opisFilm.text = resources.getText(R.string.westWorldOpis)
                    image1.setImageResource(R.drawable.west_world_frame_1)
                    image2.setImageResource(R.drawable.west_world_frame_2)
                    image3.setImageResource(R.drawable.west_world_frame_3)
                }
                "g" -> {
                    mainImg.setImageResource(R.drawable.jessica_jones_alt_oblozhka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.jessicaName)
                    opisFilm.text = resources.getText(R.string.jessicaOpis)
                    image1.setImageResource(R.drawable.jessica_jones_frame_1)
                    image2.setImageResource(R.drawable.jessica_jones_frame_2)
                    image3.setImageResource(R.drawable.jessica_jones_frame_3)
                }
                "h" -> {
                    mainImg.setImageResource(R.drawable.constantin_alt_oblozhka)
                    darkFon.setImageResource(R.drawable.zatem)
                    nameFilm.text = resources.getText(R.string.constantinName)
                    opisFilm.text = resources.getText(R.string.constantinOpis)
                    image1.setImageResource(R.drawable.constantin_frame_1)
                    image2.setImageResource(R.drawable.constantin_frame_2)
                    image3.setImageResource(R.drawable.constantin_frame_3)
                }
            }
        }

    }
}