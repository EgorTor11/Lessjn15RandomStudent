package com.example.lessjn15randomstudent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton

class MainActivity2 : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    val arreyListId = mutableListOf<Int>()
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
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

        checkBox0?.setOnCheckedChangeListener(this)
        checkBox1?.setOnCheckedChangeListener(this)
        checkBox2?.setOnCheckedChangeListener(this)
        checkBox3?.setOnCheckedChangeListener(this)
        checkBox4?.setOnCheckedChangeListener(this)
        checkBox5?.setOnCheckedChangeListener(this)
        checkBox6?.setOnCheckedChangeListener(this)
        checkBox7?.setOnCheckedChangeListener(this)
        checkBox8?.setOnCheckedChangeListener(this)
        checkBox9?.setOnCheckedChangeListener(this)
        checkBox10?.setOnCheckedChangeListener(this)

    }

    var str = "255"
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        if (buttonView != null) {
            if (isChecked) {
                arreyListId.add(buttonView.id)
                str = arreyListId.joinToString(" ")
            }
        }
    }

    fun onBtnOkClick(view: View?) {

        intent.putExtra("id", str)
        setResult(RESULT_OK, intent)
        finish()
    }
}