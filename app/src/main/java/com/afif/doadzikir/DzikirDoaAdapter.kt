package com.afif.doadzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) : //constructor untuk mendistribusikan data
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //initialization view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvArab: TextView = view.findViewById(R.id.tv_arab)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_indo)
    }

    //menampilkan data sesuai dengan posisi layout yang ditentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //mendistribusikan data dengan tampilan
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvArab.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].indo
    }

    //menentukan jumlah data yang ditampilkan
    override fun getItemCount() = listDzikirDoa.size

    }