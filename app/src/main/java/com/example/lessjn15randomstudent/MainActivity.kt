package com.example.lessjn15randomstudent

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.lessjn15randomstudent.R
import java.util.*

class MainActivity : AppCompatActivity() {
    var tableRow: TableRow? = null
    var tvRandomStudent: TextView? = null
    var imageView: ImageView? = null
    var arrayListsOtsut = ArrayList<Int>()
    var btnStartSelect: Button? = null
    var btnVybOtsut: Button? = null
    var linearLayout: LinearLayout? = null
    var checkBox0: CheckBox? = null
    var checkBox1: CheckBox? = null
    var checkBox2: CheckBox? = null
    var checkBox3: CheckBox? = null
    var checkBox4: CheckBox? = null
    var checkBox5: CheckBox? = null
    var checkBox6: CheckBox? = null
    var checkBox7: CheckBox? = null
    var checkBox8: CheckBox? = null
    var checkBox9: CheckBox? = null
    var checkBox10: CheckBox? = null
    var arrayListStudents = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        tvRandomStudent = findViewById(R.id.tvRandomStudent)
        btnStartSelect = findViewById(R.id.btnStartSelect)
        btnVybOtsut = findViewById(R.id.btnVybOtsut)
        linearLayout = findViewById(R.id.linlay)
        tableRow = findViewById(R.id.tbrIm)
        checkBox0 = findViewById(R.id.checkBox0)
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)
        checkBox5 = findViewById(R.id.checkBox5)
        checkBox6 = findViewById(R.id.checkBox6)
        checkBox7 = findViewById(R.id.checkBox7)
        checkBox8 = findViewById(R.id.checkBox8)
        checkBox9 = findViewById(R.id.checkBox9)
        checkBox10 = findViewById(R.id.checkBox10)
        arrayListStudents.add(0, "Cтас")
        arrayListStudents.add(1, "Alex")
        arrayListStudents.add(2, "Саня")
        arrayListStudents.add(3, "Марина")
        arrayListStudents.add(4, "Надежда")
        arrayListStudents.add(5, "Наталья")
        arrayListStudents.add(6, "Дарья")
        arrayListStudents.add(7, "Дмитрий")
        arrayListStudents.add(8, "Егор")
        arrayListStudents.add(9, "Антон")
        arrayListStudents.add(10, "Ярослав")
    }

    fun onBtnStartClick(view: View?) {
        btnStartSelect!!.setBackgroundColor(Color.RED)
        val random = Random()
        val sluc = random.nextInt(11)
        if (arrayListsOtsut.contains(sluc)) {
            tvRandomStudent!!.text = "Ярослав"
            imageView!!.setImageResource(R.drawable.img10)
        } else {
            tvRandomStudent!!.text = arrayListStudents[sluc]
            when (sluc) {
                0 -> imageView!!.setImageResource(R.drawable.img0)
                1 -> imageView!!.setImageResource(R.drawable.img1)
                2 -> imageView!!.setImageResource(R.drawable.img2)
                3 -> imageView!!.setImageResource(R.drawable.img3)
                4 -> imageView!!.setImageResource(R.drawable.img4)
                5 -> imageView!!.setImageResource(R.drawable.img5)
                6 -> imageView!!.setImageResource(R.drawable.img6)
                7 -> imageView!!.setImageResource(R.drawable.img7)
                8 -> imageView!!.setImageResource(R.drawable.img8)
                9 -> imageView!!.setImageResource(R.drawable.img9)
                10 -> imageView!!.setImageResource(R.drawable.img10)
            }
        }
    }

    fun onBtnVyborOtsutClick(view: View?) {
        linearLayout!!.visibility = View.VISIBLE
        tableRow!!.visibility = View.GONE
        btnVybOtsut!!.visibility = View.GONE
        btnStartSelect!!.visibility = View.GONE
        tvRandomStudent!!.visibility = View.GONE
        btnStartSelect!!.setBackgroundColor(Color.BLUE)
    }

    fun onBtnOkClick(view: View?) {
        linearLayout!!.visibility = View.GONE
        btnVybOtsut!!.visibility = View.VISIBLE
        btnStartSelect!!.visibility = View.VISIBLE
        tvRandomStudent!!.visibility = View.VISIBLE
        tableRow!!.visibility = View.VISIBLE
    }

    fun onCheckboxClicked(view: View) {
        val integer0 = 0
        val integer1 = 1
        val integer2 = 2
        val integer3 = 3
        val integer4 = 4
        val integer5 = 5
        val integer6 = 6
        val integer7 = 7
        val integer8 = 8
        val integer9 = 9
        val integer10 = 10
        // Получаем флажок
        val checkBox = view as CheckBox
        // Получаем, отмечен ли данный флажок
        val checked = checkBox.isChecked
        when (view.getId()) {
            R.id.checkBox0 -> if (checked) {
                arrayListsOtsut.add(integer0)
            } else arrayListsOtsut.remove(integer0)
            R.id.checkBox1 -> if (checked) {
                arrayListsOtsut.add(integer1)
            } else {
                arrayListsOtsut.remove(integer1)
            }
            R.id.checkBox2 -> if (checked) {
                arrayListsOtsut.add(integer2)
            } else arrayListsOtsut.remove(integer2)
            R.id.checkBox3 -> if (checked) {
                arrayListsOtsut.add(integer3)
            } else arrayListsOtsut.remove(integer3)
            R.id.checkBox4 -> if (checked) {
                arrayListsOtsut.add(integer4)
            } else arrayListsOtsut.remove(integer4)
            R.id.checkBox5 -> if (checked) {
                arrayListsOtsut.add(integer5)
            } else arrayListsOtsut.remove(integer5)
            R.id.checkBox6 -> if (checked) {
                arrayListsOtsut.add(integer6)
            } else arrayListsOtsut.remove(integer6)
            R.id.checkBox7 -> if (checked) {
                arrayListsOtsut.add(integer7)
            } else arrayListsOtsut.remove(integer7)
            R.id.checkBox8 -> if (checked) {
                arrayListsOtsut.add(integer8)
            } else arrayListsOtsut.remove(integer8)
            R.id.checkBox9 -> if (checked) {
                arrayListsOtsut.add(integer9)
            } else arrayListsOtsut.remove(integer9)
            R.id.checkBox10 -> if (checked) {
                arrayListsOtsut.add(integer10)
            } else arrayListsOtsut.remove(integer10)
        }
    }
}