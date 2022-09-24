package com.bignerdranch.android.livedemo_assetsandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var toggleButton: Button
    lateinit var dudeImage: ImageView

    var glassesState: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {

        //
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        this.connectViews()
        this.setupCallbacks()
    }

    //
    private fun connectViews(){
        this.toggleButton = this.findViewById(R.id.toggle_button)
        this.dudeImage = this.findViewById(R.id.dude_image)
    }

    //
    private fun setupCallbacks(){

        //
        this.toggleButton.setOnClickListener {v: View ->
            //
            this.glassesState = !this.glassesState
            this.updateDudeImage()

            println("Toggle button was clicked!")
        }
    }

    //
    private fun updateDudeImage() {

        //
        val newImageId: Int = if(this.glassesState){
            R.drawable.dude_glasses
        }
        else {
            R.drawable.dude
        }

        //
        this.dudeImage.setImageResource(newImageId)
    }
}