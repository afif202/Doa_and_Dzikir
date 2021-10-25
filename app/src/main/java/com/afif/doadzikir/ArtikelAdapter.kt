package com.afif.doadzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

/*
class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) : RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    inner class  MyViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val imgArtikel: ImageView = view.findViewById(R.id.img_artikel)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_artikel, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val holderImage = holder.imgArtikel
        holderImage.apply {
            setImageResource(listArtikel[position].imageArtikel)
            imgArtikel.setOnClickListener{
                val intent = Itent(holder.imgArtikel.context, DetailArtikelActivity::class.java)
                intent.putExtra(DetailArtikelActivity.DATA_TITLE,listArtikel[position].titleArtikel)
                intent.putExtra(DetailArtikelActivity.DATA_DESC,listArtikel[position].descArtikel)
                intent.putExtra(DetailArtikelActivity.DATA_IMAGE,listArtikel[position].imageAtikel)
                context.startActivities(intent)
            }
        }
    }

    override fun getItemCount() = listArtikel.size
}*/
