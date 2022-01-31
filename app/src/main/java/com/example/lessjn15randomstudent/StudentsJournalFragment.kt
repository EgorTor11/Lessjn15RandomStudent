package com.example.lessjn15randomstudent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class StudentsJournalFragment : Fragment() {
    var str = ""
    val arreyListIdFrag = mutableListOf<Int>()
    val dataModel: DataModel by activityViewModels()
    val mapStudentsFrag = mutableMapOf(
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
        11 to Student("Анна", true, R.drawable.nastya),
        12 to Student("Андрей", true, R.drawable.nastya)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jornal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.rcView)
        val clickListener: (Int) -> Unit = { posicion: Int ->
            if (arreyListIdFrag.contains(posicion)){
                arreyListIdFrag.remove(posicion)
                str=""
            }else{ arreyListIdFrag.add(posicion)}
            str = arreyListIdFrag.joinToString(" ")
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        val adap = JornalStudentsRecyclerViewAdapter(mapStudentsFrag,clickListener)
        recyclerView.adapter = adap
val btnOk=view.findViewById<Button>(R.id.btnOK_)



        btnOk?.setOnClickListener {
            dataModel.message.value = str
            str=""
arreyListIdFrag.clear()
          //  getActivity()?.getSupportFragmentManager()?.beginTransaction()?.remove(this)?.commit();
parentFragmentManager.beginTransaction().remove(this).commit()
        }
    }

 companion object{
     @JvmStatic
     fun newInstance(): StudentsJournalFragment {
         return StudentsJournalFragment()
     }
    }

}
