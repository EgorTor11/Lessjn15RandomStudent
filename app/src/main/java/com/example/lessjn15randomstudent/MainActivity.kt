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
    val mapStudents = mutableMapOf(
        R.id.checkBox0 to  Student("Стас",true,R.drawable.img0),
        R.id.checkBox1 to  Student("Alex",true,R.drawable.img1),
        R.id.checkBox2 to   Student("Саня",true,R.drawable.img2),
        R.id.checkBox3 to   Student("Марина",true,R.drawable.img3),
        R.id.checkBox4 to   Student("Надежда",true,R.drawable.img4),
        R.id.checkBox5 to    Student("Наталья",true,R.drawable.img5),
        R.id.checkBox6 to  Student("Дарья",true,R.drawable.img6),
        R.id.checkBox7 to   Student("Дмитрий",true,R.drawable.img7),
        R.id.checkBox8 to   Student("Егор",true,R.drawable.img8),
        R.id.checkBox9 to   Student("Антон",true,R.drawable.img9),
        R.id.checkBox10 to   Student("Ярослав",true,R.drawable.img10))

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

    }

    fun onBtnStartClick(view: View?) {
        btnStartSelect!!.setBackgroundColor(Color.RED)
     val ran  = mapStudents.values.toList().filter { it.isEnabled}.random() // преобразовал мапу в лист чисто по значениям, а его отфильтровал по полям
        tvRandomStudent?.setText(ran.name)
    imageView?.setImageResource(ran.imageID)
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
        val checkBox = view as CheckBox
        val checked = checkBox.isChecked
        for (a in mapStudents){
            if (a.key==view.getId()){
                if (checked){
                    a.value.isEnabled=false
                }else{a.value.isEnabled=true}
            }

        }

    }
}