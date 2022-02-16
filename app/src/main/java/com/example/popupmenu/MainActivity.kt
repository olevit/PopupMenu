package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val popupMenu = PopupMenu(this, imageView)// (this, button),(this, textView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.menu1 -> {
                    textView.text= "Ви вибрали PopuMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Ви вибрали PopuMenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Ви вибрали PopuMenu 3"
                    true
                }
                else  -> false
            }
        }
        button.setOnClickListener {
            popupMenu.show()
        }
        textView.setOnClickListener {
            popupMenu.show()
        }
        imageView.setOnClickListener {
            popupMenu.show()
        }
    }
}
