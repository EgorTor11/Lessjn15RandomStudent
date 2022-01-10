package com.example.lessjn15randomstudent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels


class BlankFragment : Fragment() {
    var str = ""
    val arreyListIdFrag = mutableListOf<Int>()
    var mFragmentManager: FragmentManager? = null
    val mFragmentTransaction: FragmentTransaction? = null
    val dataModel: DataModel by activityViewModels()
    val mapStudentsFrag = mutableMapOf(
        R.id.checkBox0 to Student("Стас", true, R.drawable.img0),
        R.id.checkBox1 to Student("Alex", true, R.drawable.img1),
        R.id.checkBox2 to Student("Саня", true, R.drawable.img2),
        R.id.checkBox3 to Student("Марина", true, R.drawable.img3),
        R.id.checkBox4_ to Student("Надежда", true, R.drawable.img4),
        R.id.checkBox5_ to Student("Наталья", true, R.drawable.img5),
        R.id.checkBox6_ to Student("Дарья", true, R.drawable.img6),
        R.id.checkBox7_ to Student("Дмитрий", true, R.drawable.img7),
        R.id.checkBox8_ to Student("Егор", true, R.drawable.img8),
        R.id.checkBox9_ to Student("Антон", true, R.drawable.img9),
        R.id.checkBox10_ to Student("Ярослав", true, R.drawable.img10)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnOk = view?.findViewById<Button>(R.id.btnOK_)
        var checkBox0 = view.findViewById<CheckBox>(R.id.checkBox0)
        var checkBox1 = view.findViewById<CheckBox>(R.id.checkBox1)
        var checkBox2 = view.findViewById<CheckBox>(R.id.checkBox2)
        var checkBox3 = view.findViewById<CheckBox>(R.id.checkBox3)
        var checkBox4 = view.findViewById<CheckBox>(R.id.checkBox4_)
        var checkBox5 = view.findViewById<CheckBox>(R.id.checkBox5_)
        var checkBox6 = view.findViewById<CheckBox>(R.id.checkBox6_)
        var checkBox7 = view.findViewById<CheckBox>(R.id.checkBox7_)
        var checkBox8 = view.findViewById<CheckBox>(R.id.checkBox8_)
        var checkBox9 = view.findViewById<CheckBox>(R.id.checkBox9_)
        var checkBox10 = view.findViewById<CheckBox>(R.id.checkBox10_)
        checkBox0.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox1.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox2.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox3.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox4.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox5.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox6.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox7.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox8.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox9.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }
        checkBox10.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                arreyListIdFrag.add(it.id)
                str =arreyListIdFrag.joinToString  (" ")
            }else{
                arreyListIdFrag.remove(it.id)
                str=arreyListIdFrag.joinToString  (" ")
            }
        }

        btnOk?.setOnClickListener {
dataModel.message.value=str
            //  mapStudentsFrag.values.toList().filter{}
            getActivity()?.getSupportFragmentManager()?.beginTransaction()?.remove(this)?.commit();

        }
    }

//    fun onCheckBoxClick(view: View) {
//        view as CheckBox
//        mapStudentsFrag.get(view.id)?.isEnabled = !view.isChecked
//    }

}
