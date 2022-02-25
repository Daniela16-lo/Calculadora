package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var num1: Int= 0
    private var num2: Int= 0
    private var operacion: Int= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0: Button = findViewById<Button>(R.id.button16)
        val button1: Button = findViewById<Button>(R.id.unoBoton)
        textView = findViewById<TextView>(R.id.textView)
        val button2: Button = findViewById<Button>(R.id.button13)
        val button3: Button = findViewById<Button>(R.id.button14)
        val button4: Button = findViewById<Button>(R.id.button8)
        val button5: Button = findViewById<Button>(R.id.button9)
        val button6: Button = findViewById<Button>(R.id.button10)
        val button7: Button = findViewById<Button>(R.id.button2)
        val button8: Button = findViewById<Button>(R.id.button4)
        val button9: Button = findViewById<Button>(R.id.button6)
        val button10: Button = findViewById<Button>(R.id.button)
        val buttonSum: Button = findViewById<Button>(R.id.button15)
        val buttonRes: Button = findViewById<Button>(R.id.button11)
        val buttonMult: Button = findViewById<Button>(R.id.button7)
        val buttonDiv: Button = findViewById<Button>(R.id.button3)
        val buttonIg: Button = findViewById<Button>(R.id.button18)




        textView?.text = ""

        button0?.setOnClickListener { numeroPresionado("0")}
        button1?.setOnClickListener { numeroPresionado("1")}
        button2?.setOnClickListener { numeroPresionado("2")}
        button3?.setOnClickListener { numeroPresionado("3")}
        button4?.setOnClickListener { numeroPresionado("4")}
        button5?.setOnClickListener { numeroPresionado("5")}
        button6?.setOnClickListener { numeroPresionado("6")}
        button7?.setOnClickListener { numeroPresionado("7")}
        button8?.setOnClickListener { numeroPresionado("8")}
        button9?.setOnClickListener { numeroPresionado("9")}
        button10?.setOnClickListener {
            num1=0
            num2=0
            textView?.text = ""
            operacion = No_op}

        buttonSum?.setOnClickListener { operacionPresionada(SUMA ) }
        buttonRes?.setOnClickListener { operacionPresionada(RESTA ) }
        buttonMult?.setOnClickListener { operacionPresionada(MULTIPLICACION) }
        buttonDiv?.setOnClickListener { operacionPresionada(DIVISION) }

        buttonIg?.setOnClickListener {
            var resultado = when(operacion){
                SUMA -> num1 + num2
                RESTA -> num1 - num2
                MULTIPLICACION -> num1 * num2
                DIVISION-> num1 / num2
                else -> 0
            }
            textView?.text = resultado.toString()
        }

    }
    private fun numeroPresionado(digito: String){
        textView?.text= "${textView?.text}$digito"
        if (operacion == No_op){
            num1 = textView?.text.toString().toInt()
        }else {
            num2 = textView?.text.toString().toInt()
        }

    }

    private fun operacionPresionada(operacion: Int){
        this.operacion= operacion

       // num1 = textView?.text.toString().toDouble()
        textView?.text="0"
    }

    companion object{
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVISION = 4
        const val No_op = 5

    }

    }

