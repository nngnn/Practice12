package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun apple(view: View) {
        val photo:ImageView = findViewById(R.id.imageView)
        val apple:Int = R.drawable.apple
        photo.setImageResource(apple)
    }
    fun pear(view: View) {
        val photo:ImageView = findViewById(R.id.imageView)
        val pear:Int = R.drawable.pear
        photo.setImageResource(pear)
    }
    fun grape(view: View) {
        val photo:ImageView = findViewById(R.id.imageView)
        val grapes:Int = R.drawable.grapes
        photo.setImageResource(grapes)
    }

    fun checkBoxApple(view: View) {
        val imageViewApple:ImageView=findViewById(R.id.imageViewApple)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.apple))
        val checkBoxApple:CheckBox=findViewById(R.id.checkBox)
        if (!checkBoxApple.isChecked)
            imageViewApple.setImageDrawable(null)
    }
    fun checkBoxPear(view: View) {
        val imageViewPear:ImageView=findViewById(R.id.imageViewPear)
        imageViewPear.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pear))
        val checkBoxPear:CheckBox=findViewById(R.id.checkBox2)
        if (!checkBoxPear.isChecked)
            imageViewPear.setImageDrawable(null)
    }
    fun checkBoxGrapes(view: View) {
        val imageViewGrapes:ImageView=findViewById(R.id.imageViewGrapes)
        imageViewGrapes.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.grapes))
        val checkBoxGrapes:CheckBox=findViewById(R.id.checkBox3)
        if (!checkBoxGrapes.isChecked)
            imageViewGrapes.setImageDrawable(null)
    }
}