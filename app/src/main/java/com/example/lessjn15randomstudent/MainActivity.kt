package com.example.lessjn15randomstudent

import android.content.Intent
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


    val mapStudents = mutableMapOf(
        R.id.checkBox0 to Student("Стас", true, R.drawable.img0),
        R.id.checkBox1 to Student("Alex", true, R.drawable.img1),
        R.id.checkBox2 to Student("Саня", true, R.drawable.img2),
        R.id.checkBox3 to Student("Марина", true, R.drawable.img3),
        R.id.checkBox4 to Student("Надежда", true, R.drawable.img4),
        R.id.checkBox5 to Student("Наталья", true, R.drawable.img5),
        R.id.checkBox6 to Student("Дарья", true, R.drawable.img6),
        R.id.checkBox7 to Student("Дмитрий", true, R.drawable.img7),
        R.id.checkBox8 to Student("Егор", true, R.drawable.img8),
        R.id.checkBox9 to Student("Антон", true, R.drawable.img9),
        R.id.checkBox10 to Student("Ярослав", true, R.drawable.img10)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        tvRandomStudent = findViewById(R.id.tvRandomStudent)

        btnStartSelect = findViewById(R.id.btnStartSelect)

        btnVybOtsut = findViewById(R.id.btnVybOtsut)
        linearLayout = findViewById(R.id.linlay)
        tableRow = findViewById(R.id.tbrIm)


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
//
        startActivityForResult(Intent(this, MainActivity2::class.java), 11)

    }

    var str = ""
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 11) {
            str = data?.getStringExtra("id").toString()
        }
        proverka()
    }


    fun proverka() {
        for (i in mapStudents.keys.toList()) {
            mapStudents.get(i)?.isEnabled = !str.split(" ").contains(i.toString())
        }
    }


    // mapStudents.get(buttonView.id)?.isEnabled = !isChecked


}
