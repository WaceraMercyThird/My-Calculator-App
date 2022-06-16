package dev.waceramercythird.mycal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var btnAddition:Button
    lateinit var btnMinus:Button
    lateinit var btnModulus:Button
    lateinit var btnDiv:Button
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout
    lateinit var etNum1:TextInputEditText
    lateinit var etNum2:TextInputEditText
    lateinit var tvCAL:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        btnAddition=findViewById(R.id.btnAddition)
        btnMinus = findViewById(R.id.btnMinus)
        btnModulus = findViewById(R.id.btnModulus)
        btnDiv = findViewById(R.id.btnDivision)
        tilNum1 = findViewById(R.id.tilNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvCAL = findViewById(R.id.tvCal)
                btnAddition.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            if (num1.isBlank()){
                tilNum1.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                tilNum2.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            adding(num1.toInt(),num2.toInt())
        }

                btnMinus.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            if (num1.isBlank()){
                tilNum1.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                tilNum1.error="Fill in the Blank Place"
            }
            sub(num1.toInt(),num2.toInt())
        }

                btnModulus.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            if (num1.isBlank()){
                tilNum1.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                tilNum2.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            multiply(num1.toInt(),num2.toInt())
        }
                btnDiv.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            if (num1.isBlank()){
                tilNum1.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                tilNum2.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            modulus(num1.toInt(),num2.toInt())
        }

    }

    private fun adding(num1:Int, num2:Int){
        val plus= num1+num2
        tvCAL.text=plus.toString()
    }
    fun sub(num1:Int, num2:Int){
        val minus = num1-num2
        tvCAL.text=minus.toString()
    }
    fun multiply(num1:Int, num2:Int){
        val times = num1*num2
        tvCAL.text=times.toString()
    }
    fun modulus(num1:Int, num2:Int){
        val reminder = num1%num2
        tvCAL.text=reminder.toString()
    }
    }











