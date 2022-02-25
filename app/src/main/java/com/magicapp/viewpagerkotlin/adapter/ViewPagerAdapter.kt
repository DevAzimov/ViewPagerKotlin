package com.magicapp.viewpagerkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.magicapp.viewpagerkotlin.R
import com.magicapp.viewpagerkotlin.model.ProductModel

class ViewPagerAdapter(var context: Context, var items: ArrayList<ProductModel>):
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var image: ImageView
        var title: TextView

        init {
            image = view.findViewById(R.id.image)
            title = view.findViewById(R.id.tv_feedback)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        var feed = items[position]

        if (holder is Pager2ViewHolder){
            var image = holder.image
            var title = holder.title

            image.setImageResource(feed.image)
            title.text = feed.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}