package ro.pub.cs.systems.eim.practicaltest01var04

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var04MainActivity : AppCompatActivity() {
    private lateinit var navigateToSecond : Button
    private lateinit var check1 : CheckBox
    private lateinit var check2 : CheckBox
    private lateinit var inputOne : EditText
    private lateinit var inputTwo : EditText
    private lateinit var displayInfoButton : Button
    private lateinit var inputThree : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var04_main)

        navigateToSecond = findViewById(R.id.navigate_to_second_button)
        check1 = findViewById(R.id.checkBox1)
        check2 = findViewById(R.id.checkBox2)
        inputOne = findViewById(R.id.input1)
        inputTwo = findViewById(R.id.input2)
        displayInfoButton = findViewById(R.id.display_info_button)
        inputThree = findViewById(R.id.input3)

        // Ascultator pe buton
        displayInfoButton.setOnClickListener {
            var text1 = inputOne.text.toString()
            Log.d("input1", text1.toString())
            var text2 = inputTwo.text.toString()

            if (check1.isChecked) {
                if (inputOne.text.toString().isEmpty()) {
                    Toast.makeText(this, "Textul 1 este null", Toast.LENGTH_SHORT).show()
                }
            }

            if (check2.isChecked) {
                if (inputTwo.text.toString().isEmpty()) {
                    Toast.makeText(this, "Textul 1 este null", Toast.LENGTH_SHORT).show()
                }
            }

            var allText : String? = null
            if (check1.isChecked)
                allText = text1

            if (check2.isChecked)
                allText = allText + text2

            inputThree.setText(allText.toString())
        }


    }
}