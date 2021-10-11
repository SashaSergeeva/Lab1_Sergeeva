package com.example.lab1_sergeeva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1_sergeeva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val fw = FindingWords()
        bindingClass.tv1.text = fw.str
        bindingClass.tv2.text = "5 самых длинных слов из данного текста:"

        bindingClass.ok.setOnClickListener {
            bindingClass.tv3.text = fw.sortingAndOutput()
        }

    }
}