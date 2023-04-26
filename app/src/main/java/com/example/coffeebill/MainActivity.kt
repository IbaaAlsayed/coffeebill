package com.example.coffeebill

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rg=findViewById<Button>(R.id.button)
        val ch=findViewById<RadioGroup>(R.id.radioGroup)
        val cream=findViewById<CheckBox>(R.id.chcream)
        val sugar=findViewById<CheckBox>(R.id.chsugar)
        rg.setOnClickListener {
            val selectedButton:Int=ch.checkedRadioButtonId
            val btn=findViewById<RadioButton>(selectedButton)
            val yourVote: String = btn.text.toString()
            var checkBoxChoices = "$yourVote coffee"
            if (cream.isChecked) {
                checkBoxChoices +=" & " +cream.text.toString()
            }
            if (sugar.isChecked) {
                checkBoxChoices +=" & " +sugar.text.toString()
            }
            Toast.makeText(this,checkBoxChoices,Toast.LENGTH_SHORT).show()

        }

    }
}