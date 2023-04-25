package com.example.AndroidCalculator

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.AndroidCalculator.R
import android.widget.Toast
import java.math.BigDecimal
import java.util.*

class AndroidCalculator : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        editText = findViewById(R.id.edit_text) as EditText
        val button1 = findViewById(R.id.button_1) as Button
        val button2 = findViewById(R.id.button_2) as Button
        val button3 = findViewById(R.id.button_3) as Button
        val button4 = findViewById(R.id.button_4) as Button
        val button5 = findViewById(R.id.button_5) as Button
        val button6 = findViewById(R.id.button_6) as Button
        val button7 = findViewById(R.id.button_7) as Button
        val button8 = findViewById(R.id.button_8) as Button
        val button9 = findViewById(R.id.button_9) as Button
        val button0 = findViewById(R.id.button_0) as Button
        val button_add = findViewById(R.id.button_add) as Button
        val button_sub = findViewById(R.id.button_sub) as Button
        val button_mul = findViewById(R.id.button_mul) as Button
        val button_div = findViewById(R.id.button_div) as Button
        val button_del = findViewById(R.id.button_del) as Button
        val button_neg = findViewById(R.id.button_neg) as Button
        val button_equ = findViewById(R.id.button_equ) as Button
        val button_pt = findViewById(R.id.button_pt) as Button
        val button_pc = findViewById(R.id.button_pc) as Button
        val button_fac = findViewById(R.id.button_fac) as Button
        val button_c = findViewById(R.id.button_c) as Button
        val button_root = findViewById(R.id.button_root) as Button
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button_add.setOnClickListener(this)
        button_sub.setOnClickListener(this)
        button_mul.setOnClickListener(this)
        button_div.setOnClickListener(this)
        button_del.setOnClickListener(this)
        button_neg.setOnClickListener(this)
        button_equ.setOnClickListener(this)
        button_pt.setOnClickListener(this)
        button_pc.setOnClickListener(this)
        button_fac.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_root.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var et = editText.getText().toString()
        when (v?.getId()) {
            R.id.button_0 -> {
                if (et == "0") et = "0" else et += "0"
                editText.setText(et)
            }
            R.id.button_1 -> {
                if (et == "0") et = "1" else et += "1"
                editText.setText(et)
            }
            R.id.button_2 -> {
                if (et == "0") et = "2" else et += "2"
                editText.setText(et)
            }
            R.id.button_3 -> {
                if (et == "0") et = "3" else et += "3"
                editText.setText(et)
            }
            R.id.button_4 -> {
                if (et == "0") et = "4" else et += "4"
                editText.setText(et)
            }
            R.id.button_5 -> {
                if (et == "0") et = "5" else et += "5"
                editText.setText(et)
            }
            R.id.button_6 -> {
                if (et == "0") et = "6" else et += "6"
                editText.setText(et)
            }
            R.id.button_7 -> {
                if (et == "0") et = "7" else et += "7"
                editText.setText(et)
            }
            R.id.button_8 -> {
                if (et == "0") et = "8" else et += "8"
                editText.setText(et)
            }
            R.id.button_9 -> {
                if (et == "0") et = "9" else et += "9"
                editText.setText(et)
            }
            R.id.button_pt -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.' ||
                (!et.contains("+") &&
                !et.contains("-") &&
                !et.contains("×") &&
                !et.contains("÷") &&
                et.contains("."))
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "."
                editText.setText(et)
            }
            R.id.button_add -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "+"
                editText.setText(et)
            }
            R.id.button_sub -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "-"
                editText.setText(et)
            }
            R.id.button_mul -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "×"
                editText.setText(et)
            }
            R.id.button_div -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "÷"
                editText.setText(et)
            }
            R.id.button_del -> {
                et = if (et.length > 1) {
                    if (et.length == 2 && et[0] == '-') {
                        "0"
                    } else et.substring(0, et.length - 1)
                } else {
                    "0"
                }
                editText.setText(et)
            }
            R.id.button_c -> {
                et = "0"
                editText.setText(et)
            }
            R.id.button_equ -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷') {
                Toast.makeText(
                    this@AndroidCalculator,
                    "Please complete the formula!",
                    Toast.LENGTH_SHORT
                ).show()
                editText.setText(et)
            } else {
                val res = getResult()
                if (res.contains("Infinity")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "0 cannot be used as a divior!",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText.setText("0")
                } else {
                    editText.setText(res)
                }
            }
            R.id.button_pc -> {
                var per = et.toDouble()
                per = per / 100
                var per1 = "" + per
                per1 = per1.replace("0+?$".toRegex(), "")
                per1 = per1.replace("[.]$".toRegex(), "")
                editText.setText(per1)
            }
            R.id.button_neg -> if (et[0] >= '0' && et[0] <= '9') {
                if (et == "0") {
                    editText.setText("0")
                } else {
                    editText.setText("-$et")
                }
            } else if (et[0] == '-') editText.setText(
                et.substring(1, et.length)
            ) else editText.setText(et)
            R.id.button_fac -> if (et.contains(".")) {
                Toast.makeText(this@AndroidCalculator,
                    "Not integer!",
                    Toast.LENGTH_SHORT).show()
            } else if (et[0] == '-') {
                Toast.makeText(this@AndroidCalculator,
                    "Not positive!",
                    Toast.LENGTH_SHORT).show()
            } else {
                if (et == "0") {
                    et = "1"
                    editText.setText(et)
                } else {
                    val num = et.toInt().toDouble()
                    var result = 1.0
                    var i = 1
                    while (i <= num) {
                        result = result * i
                        i++
                    }
                    et = result.toString()
                    editText.setText(et)
                }
            }
            R.id.button_root -> if (et[0] == '-') {
                Toast.makeText(
                    this@AndroidCalculator,
                    "Negative numbers cannot be squared!",
                    Toast.LENGTH_SHORT
                ).show()
                editText.setText("0")
            } else if (et.contains("+") ||
                et.contains("-") ||
                et.contains("×") ||
                et.contains("÷")
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Symbols cannot be squared!",
                    Toast.LENGTH_SHORT)
                    .show()
                editText.setText("0")
            } else {
                var x = et.toDouble()
                x = Math.sqrt(x)
                var x2 = formatResult(x)
                editText.setText(x2)
            }
            else -> {
                Toast.makeText(this@AndroidCalculator,
                    "Unexpected error!",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    fun formatResult(result: Double): String {
        var re = String.format("%.9f", result)
        re = re.replace("0+?$".toRegex(), "")
        re = re.replace("[.]$".toRegex(), "")
        return re
    }

    fun getResult(): String {
        val infix = editText.getText().toString()
        val postfix = toPostfix(infix)
        val result = toValue(postfix)
        var re = formatResult(result)
        return re
    }


    fun toPostfix(infix: String): StringBuffer {
        // 创建一个字符串类型的栈
        val stack = Stack<String>()
        // 创建一个字符串缓冲区，用于存放转换后的后缀表达式
        val postfix = StringBuffer(infix.length * 2)
        // 初始化下标变量i为0，用于遍历中缀表达式
        var i = 0
        // 遍历中缀表达式
        while (i < infix.length) {
            // 获取中缀表达式中的当前字符
            var ch = infix.get(i)
            // 根据字符类型进行不同的处理
            when (ch) {
                // 如果是加号，则弹出栈中所有优先级更高或相等的运算符，并将当前运算符压入栈中
                '+' -> {
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                // 如果是减号，则需要判断是负号还是减号
                '-' -> if (i == 0) {
                    // 如果是第一个字符，则为负号，需要将0和空格添加到后缀表达式中，并将左括号和减号压入栈中
                    postfix.append(0)
                    postfix.append(" ")
                    stack.push("(")
                    stack.push(ch.toString() + "")
                    i++
                } else {
                    // 否则，同样弹出栈中所有优先级更高或相等的运算符，并将当前运算符压入栈中
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                // 如果是乘号或除号，则弹出栈中所有优先级更高或相等的运算符，并将当前运算符压入栈中
                '×', '÷' -> {
                    while (!stack.isEmpty() &&
                        (stack.peek() == "×" || stack.peek() == "÷"))
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                // 如果是数字或小数点，则将其添加到后缀表达式中，直到遇到非数字或非小数点的字符为止，并在添加完数字后添加一个空格
                else -> if (i == 1 && infix.get(0) == '-') {
                    // 如果是负号，则需要特殊处理
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.') {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                    postfix.append('-')
                    stack.pop()
                    stack.pop()
                } else {
                    // 如果是数字或小数点，则同样需要特殊处理
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.') {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                }
            }
        }
        // 将栈中剩余的运算符弹出，加入到后缀表达式中
        while (!stack.isEmpty())
            postfix.append(stack.pop())
        // 返回转换后的后缀表达式
        return postfix
    }

    // 该函数用于将后缀表达式转换为结果值
    fun toValue(postfix: StringBuffer): Double {
        val stack = Stack<Double>() // 创建一个双端队列用于存储操作数
        var value = 0.0 // 存储操作数的值
        var j = 0 // j记录操作数的起始位置
        var i = 0 // i记录当前处理的位置
        while (i < postfix.length) { // 循环遍历后缀表达式的每一个字符
            j = i // 记录操作数的起始位置
            var ch = postfix.get(i) // 获取当前字符
            if (ch >= '0' && ch <= '9' || ch == '.') { // 如果当前字符是数字或小数点
                value = 0.0 // 将value初始化为0
                while (ch != ' ') { // 循环读取当前操作数的每一位数字
                    while (ch != ' ' && ch != '.') { // 处理整数部分
                        value = value * 10.0 + (ch - '0').toDouble() // 将当前数字加入value中
                        j++ // j向后移动一位
                        ch = postfix.get(++i) // 继续读取下一位字符
                    }
                    if (ch != ' ' && ch == '.') ch = postfix.get(++i) // 处理小数点
                    while (ch != ' ' && i >= j + 1) { // 处理小数部分
                        val valueBD = BigDecimal(value.toString()) // 将value转换为BigDecimal类型
                        val chBD = BigDecimal(ch - '0') // 将当前数字转换为BigDecimal类型
                        val nBD = BigDecimal(Math.pow(10.0, (i - j).toDouble())) // 计算小数点后面的位数
                        val temp = chBD.divide(nBD) // 计算当前小数位的值
                        value = valueBD.add(temp).toDouble() // 将当前小数位的值加入value中
                        ch = postfix.get(++i) // 继续读取下一位字符
                    }
                    stack.push(value) // 将当前操作数的值压入操作数栈中
                }
            } else { // 如果当前字符是操作符
                if (ch != ' ') { // 如果当前字符不是空格
                    var y: Double = stack.pop() // 弹出栈顶的操作数作为右操作数
                    var x: Double = stack.pop() // 弹出栈顶的操作数作为左操作数
                    value = when (ch) { // 根据当前操作符进行计算
                        '+' -> x + y
                        '-' -> x - y
                        '×' -> x * y
                        '÷' -> x / y
                        else -> 0.0
                    }
                    stack.push(value) // 将计算结果压入操作数栈中
                }
            }
            i++ // 继续处理下一个字符
        }
        return stack.pop() // 返回最终的计算结果
    }

}