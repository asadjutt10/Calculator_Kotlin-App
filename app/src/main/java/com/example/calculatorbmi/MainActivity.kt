package com.example.calculatorbmi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAc.setOnClickListener {
            binding.inputtext.text = ""
            binding.outputtext.text = ""
        }
        binding.btn0.setOnClickListener {
            binding.inputtext.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btndot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.btnadd.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.btnminus.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.btnmul.setOnClickListener {
            binding.inputtext.append("*")
        }
        binding.btndivide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.btnopen.setOnClickListener {
            binding.inputtext.append("(")
        }
        binding.btnclose.setOnClickListener {
            binding.inputtext.append(")")
        }
        binding.btnequal.setOnClickListener {
            val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()
            if (result == longresult.toDouble()) {
                binding.outputtext.text = longresult.toString()
            } else {
                binding.outputtext.text = result.toString()
            }
        }
    }
}