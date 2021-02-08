package com.example.arthimaticcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.arthimaticcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


    activityMainBinding.button.setOnClickListener {
        addition(it)
    }
        activityMainBinding.buttonSub.setOnClickListener {
            substraction(it)
        }
        activityMainBinding.buttonDivision.setOnClickListener {
            division(it)
        }

        activityMainBinding.buttonMultiply.setOnClickListener {
            multiply(it)
        }
        activityMainBinding.buttonModulus.setOnClickListener {
            modulus(it)
        }
        activityMainBinding.button6.setOnClickListener {
            activityMainBinding.editTextNumberSigned2.text=null
            activityMainBinding.editTextNumberSigned.text=null
            activityMainBinding.textView.text=null
        }

    }
    private fun addition(view: View){
       var first=activityMainBinding.editTextNumberSigned.text.toString().toDouble()
        var second=activityMainBinding.editTextNumberSigned2.text.toString().toDouble()
        var third= first+second
        activityMainBinding.textView.text=  third.toString()
    }

    private fun substraction(view: View){
        var first=activityMainBinding.editTextNumberSigned.text.toString().toDouble()
        var second=activityMainBinding.editTextNumberSigned2.text.toString().toDouble()
        var third= first-second
        activityMainBinding.textView.text=  third.toString()
    }
    private fun division(view: View){
        var first=activityMainBinding.editTextNumberSigned.text.toString().toDouble()
        var second=activityMainBinding.editTextNumberSigned2.text.toString().toDouble()
        var third= first/second
        activityMainBinding.textView.text=  third.toString()
    }
    private fun multiply(view: View){
        var first=activityMainBinding.editTextNumberSigned.text.toString().toDouble()
        var second=activityMainBinding.editTextNumberSigned2.text.toString().toDouble()
        var third= first*second
        activityMainBinding.textView.text=  third.toString()
    }
    private fun modulus(view: View){
        var first=activityMainBinding.editTextNumberSigned.text.toString().toDouble()
        var second=activityMainBinding.editTextNumberSigned2.text.toString().toDouble()
        var third= first%second
        activityMainBinding.textView.text=  third.toString()
    }
}
