package com.example.second

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cnvBtn: Button = findViewById(R.id.converterBtn)
        val showTexter: TextView = findViewById(R.id.texter)
        val inputStringer: EditText = findViewById(R.id.editText)

        var inputStr :String

        var output = ""

        cnvBtn.setOnClickListener() {

            inputStr = inputStringer.text.toString()

            val strLength = inputStr.length

            when (strLength){
                1 -> {
                    when (inputStr[0]) {
                        '1' -> output += "ერთი"
                        '2' -> output += "ორი"
                        '3' -> output += "სამი"
                        '4' -> output += "ოთხი"
                        '5' -> output += "ხუთი"
                        '6' -> output += "ექვსი"
                        '7' -> output += "შვიდი"
                        '8' -> output += "რვა"
                        '9' -> output += "ცხრა"
                    }
                }

                2 -> {

                    when (inputStr[0]) {
                        '2' -> output += "ოცდა"
                        '3' -> output += "ოცდა"
                        '4' -> output += "ორმოცდა"
                        '5' -> output += "ორმოცდა"
                        '6' -> output += "სამოცდა"
                        '7' -> output += "სამოცდა"
                        '8' -> output += "ოთხმოცდა"
                        '9' -> output += "ოთხმოცდა"
                    }

                    if (inputStr[0] == '1' || inputStr[0] == '3' || inputStr[0] == '5' || inputStr[0] == '7' || inputStr[0] == '9') {

                        when (inputStr[1]) {
                            '0' -> output += "ათი"
                            '1' -> output += "თერთმეტი"
                            '2' -> output += "თორმეტი"
                            '3' -> output += "ცამეტი"
                            '4' -> output += "თოთხმეტი"
                            '5' -> output += "თხუთმეტი"
                            '6' -> output += "თექვსმეტი"
                            '7' -> output += "ჩვიდმეტი"
                            '8' -> output += "თვრამეტი"
                            '9' -> output += "ცხრამეტი"
                        }
                    }
                    if (inputStr[0] == '0' || inputStr[0] == '2' || inputStr[0] == '4'|| inputStr[0] == '6' || inputStr[0] == '8') {
                        when (inputStr[1]) {
                            '0' -> {
                                output += "ი"
                                output = output.replace("და", "")
                            }
                            '1' -> output += "ერთი"
                            '2' -> output += "ორი"
                            '3' -> output += "სამი"
                            '4' -> output += "ოთხი"
                            '5' -> output += "ხუთი"
                            '6' -> output += "ექვსი"
                            '7' -> output += "შვიდი"
                            '8' -> output += "რვა"
                            '9' -> output += "ცხრა"
                        }
                    }
                }

                3 -> {
                    when (inputStr[0]) {
                        '1' -> output = "ას"
                        '2' -> output = "ორას"
                        '3' -> output = "სამას"
                        '4' -> output = "ოთხას"
                        '5' -> output = "ხუთას"
                        '6' -> output = "ექვსას"
                        '7' -> output = "შვიდას"
                        '8' -> output = "რვაას"
                        '9' -> output = "ცხრაას"
                    }
                    when (inputStr[1]) {
                        '2' -> output += "ოცდა"
                        '3' -> output += "ოცდა"
                        '4' -> output += "ორმოცდა"
                        '5' -> output += "ორმოცდა"
                        '6' -> output += "სამოცდა"
                        '7' -> output += "სამოცდა"
                        '8' -> output += "ოთხმოცდა"
                        '9' -> output += "ოთხმოცდა"
                    }

                    if (inputStr[1] == '0' || inputStr[1] == '2' || inputStr[1] == '4'|| inputStr[1] == '6' || inputStr[1] == '8') {

                        when (inputStr[2]) {
                            '0' -> {
                                output += "ი"
                                output = output.replace("და", "")
                            }
                            '1' -> output += "ერთი"
                            '2' -> output += "ორი"
                            '3' -> output += "სამი"
                            '4' -> output += "ოთხი"
                            '5' -> output += "ხუთი"
                            '6' -> output += "ექვსი"
                            '7' -> output += "შვიდი"
                            '8' -> output += "რვა"
                            '9' -> output += "ცხრა"
                        }

                    }

                    if (inputStr[1] == '1' || inputStr[1] == '3' || inputStr[1] == '5' || inputStr[1] == '7' || inputStr[1] == '9') {

                        when (inputStr[2]) {
                            '0' -> output += "ათი"
                            '1' -> output += "თერთმეტი"
                            '2' -> output += "თორმეტი"
                            '3' -> output += "ცამეტი"
                            '4' -> output += "თოთხმეტი"
                            '5' -> output += "თხუთმეტი"
                            '6' -> output += "თექვსმეტი"
                            '7' -> output += "ჩვიდმეტი"
                            '8' -> output += "თვრამეტი"
                            '9' -> output += "ცხრამეტი"
                        }

                    }
                }

                4 -> if (inputStr == "1000") output = "ათასი"
            }

            if (inputStr.toInt() > 1000 || inputStr.toInt() < 1)
                Toast.makeText(applicationContext, "შეყვანილი რიცხვი განსაზღვრულ საზღვრებში არ ჯდება", Toast.LENGTH_SHORT).show()

            showTexter.text = output
            output = ""
        }
    }
}



