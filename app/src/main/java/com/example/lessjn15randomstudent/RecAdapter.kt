package com.example.lessjn15randomstudent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecAdapter(val names: Map<Int, Student>, val clickListener: (Int) -> Unit) :
    RecyclerView.Adapter<RecAdapter.MyViewHolder>() {
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
        if (listIntPosicion.contains(position)) {
            holder.checkBoxRc.isChecked = true
        }
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