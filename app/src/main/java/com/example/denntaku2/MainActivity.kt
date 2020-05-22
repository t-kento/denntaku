package com.example.denntaku2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numb1 = 0
        var numb2 = 0
        var numb3 = 0
        var op = 0

        var num1 = findViewById<TextView>(R.id.num1)
        var num2 = findViewById<TextView>(R.id.num2)
        var num3 = findViewById<TextView>(R.id.num3)
        var div0 = findViewById<TextView>(R.id.div0)
        val operator = findViewById<TextView>(R.id.operator)
        val equal2 = findViewById<Button>(R.id.equal2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)
        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)
        val del = findViewById<Button>(R.id.del)
        val ans = findViewById<Button>(R.id.ans)
　　　　
        //全て消し去る作業
        del.setOnClickListener {
            op = 0
            operator.text = ""
            num1.text = "0"
            num2.text = ""
            num3.text = ""
            div0.text = ""
        }
　　　　//数値を読み取って表示
        fun numBotton(num: String) {
            if (op == 0) {
                if (num1.text == "0") {
                    num1.text = num.toString()
                } else {
                    num1.text = num1.text.toString() + num.toString()
                }
                numb1 = num1.text.toString().toInt()
            } else {
                if (num2.text == "0") {
                    num2.text = num.toString()
                } else {
                    num2.text = num2.text.toString() + num.toString()

                }
                numb2 = num2.text.toString().toInt()
            }
        }

　　　　//数値の入力
        button1.setOnClickListener {
            numBotton("1")
        }
        button2.setOnClickListener {
            numBotton("2")
        }
        button3.setOnClickListener {
            numBotton("3")
        }
        button4.setOnClickListener {
            numBotton("4")
        }
        button5.setOnClickListener {
            numBotton("5")
        }
        button6.setOnClickListener {
            numBotton("6")
        }
        button7.setOnClickListener {
            numBotton("7")
        }
        button8.setOnClickListener {
            numBotton("8")
        }
        button9.setOnClickListener {
            numBotton("9")
        }
        button0.setOnClickListener {
            numBotton("0")
        }
        //演算子を入力
        add.setOnClickListener {
            op = 1
            operator.text = "+"
        }
        sub.setOnClickListener {
            op = 2
            operator.text = "-"
        }
        mul.setOnClickListener {
            op = 3
            operator.text = "×"
        }
        div.setOnClickListener {
            op = 4
            operator.text = "÷"
        }
        //計算処理
        equal2.setOnClickListener {
            if (op == 0) {
                numb3 = num1.text.toString().toInt()
                num3.text = numb3.toString()
            } else {
                if (op == 1) {
                    numb3 = num1.text.toString().toInt() + num2.text.toString().toInt()
                    num3.text = numb3.toString()
                } else {
                    if (op == 2) {
                        numb3 = num1.text.toString().toInt() - num2.text.toString().toInt()
                        num3.text = numb3.toString()
                    } else {
                        if (op == 3) {
                            numb3 = num1.text.toString().toInt() * num2.text.toString().toInt()
                            num3.text = numb3.toString()
                        } else {
                            if (op == 4) {
                                if (num2.text.toString().toInt() == 0) {//0で割ったときの処理
                                    div0.text = "０で割ったらダメなんだよ"

                                } else {
                                    numb3 = num1.text.toString().toInt() / num2.text.toString().toInt()
                                    num3.text = numb3.toString()
                                }
                            }

                        }
                    }
                }
            }
            ans.setOnClickListener {
                num1.text = num3.text.toString()
                op = 5 //num1には入力できないように
                operator.text = " "
                num2.text = ""
                num3.text = ""

            }


        }

    }
}





