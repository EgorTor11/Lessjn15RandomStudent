package com.example.lessjn15randomstudent

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.viewModels
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import java.util.*

class MainActivity : AppCompatActivity() {
    var tableRow: TableRow? = null
    var tvRandomStudent: TextView? = null
    var str = ""
    var imageView: ImageView? = null
    var arrayListsOtsut = ArrayList<Int>()
    var btnStartSelect: Button? = null
    var btnVybOtsut: Button? = null
    var linearLayout: LinearLayout? = null
    val dataModel:DataModel by viewModels()
    val blankfragment = BlankFragment();
    var mFragmentManager: FragmentManager? = null
    val mFragmentTransaction: FragmentTransaction? = null
    val mapStudents = mutableMapOf(
        0 to Student("Стас", true, R.drawable.img0),
        1 to Student("Alex", true, R.drawable.img1),
        2 to Student("Саня", true, R.drawable.img2),
        3 to Student("Марина", true, R.drawable.img3),
        4 to Student("Надежда", true, R.drawable.img4),
        5 to Student("Наталья", true, R.drawable.img5),
        6 to Student("Дарья", true, R.drawable.img6),
        7 to Student("Дмитрий", true, R.drawable.img7),
        8 to Student("Егор", true, R.drawable.img8),
        9 to Student("Антон", true, R.drawable.img9),
        10 to Student("Настя", true, R.drawable.nastya),
        11 to Student("Анна", true, R.drawable.anna),
        12 to Student("Андрей", true, R.drawable.andrey)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        tvRandomStudent = findViewById(R.id.tvRandomStudent)

        btnStartSelect = findViewById(R.id.btnStartSelect)

        btnVybOtsut = findViewById(R.id.btnVybOtsut)

        tableRow = findViewById(R.id.tbrIm)
       mFragmentManager=supportFragmentManager
dataModel.message.observe(this){
//Toast.makeText(this,it,Toast.LENGTH_LONG).show()
    str=it
    proverka()
}
    }

    fun onBtnStartClick(view: View?) {

        btnStartSelect!!.setBackgroundColor(Color.RED)
        if (!mapStudents.values.toList().filter { it.isEnabled }.isEmpty()) {
            val ran = mapStudents.values.toList().filter { it.isEnabled }
                .random() // преобразовал мапу в лист чисто по значениям, а его отфильтровал по полям
            tvRandomStudent?.setText(ran.name)
            imageView?.setImageResource(ran.imageID)
        } else Toast.makeText(this, "Все студенты отсутствуют!", Toast.LENGTH_LONG).show()

    }


    fun onBtnVyborOtsutClick(view: View?) {
        mFragmentManager?.beginTransaction()

            ?.replace(R.id.container,blankfragment)

            ?.commit();


    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 11) {
            str = data?.getStringExtra("id").toString()
        }

    }


    fun proverka() {
        for (i in mapStudents.keys.toList()) {
            mapStudents.get(i)?.isEnabled = !str.split(" ").contains(i.toString())
        }
    }





}
