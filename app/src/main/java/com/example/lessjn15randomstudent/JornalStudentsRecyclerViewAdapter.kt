package com.example.lessjn15randomstudent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView


class JornalStudentsRecyclerViewAdapter(val names: Map<Int, Student>, val clickListener: (Int) -> Unit) :
    RecyclerView.Adapter<JornalStudentsRecyclerViewAdapter.MyViewHolder>() {
    var listIntPosicion = mutableListOf<Int>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val checkBoxRc: CheckBox = itemView.findViewById(R.id.checkBoxRC)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.checkBoxRc.isChecked = false

        holder.checkBoxRc.isChecked = listIntPosicion.contains(position) // через конструкцию  if лично мне понятнее и читабельнее

        holder.checkBoxRc.text = names.get(position)?.name
        holder.checkBoxRc.setOnClickListener {
            it as CheckBox
            if (it.isChecked) {
                clickListener.invoke(position)
                listIntPosicion.add(position)
            } else {
                listIntPosicion.remove(position)
                clickListener.invoke(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }


}