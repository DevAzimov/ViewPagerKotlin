package com.magicapp.viewpagerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.magicapp.viewpagerkotlin.adapter.ViewPagerAdapter
import com.magicapp.viewpagerkotlin.model.ProductModel
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2 : ViewPager2
    lateinit var indicator : CircleIndicator3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        indicator = findViewById(R.id.indicator)
        viewPager2 = findViewById(R.id.viewPager)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//        indicator.setViewPager(viewPager2)
        refreshAdapter(addProduct())
    }

    private fun refreshAdapter(product: ArrayList<ProductModel>) {
        val adapter =  ViewPagerAdapter(this,product)
        viewPager2.adapter = adapter
        indicator.setViewPager(viewPager2)
    }

    fun addProduct(): ArrayList<ProductModel>{
        val product : ArrayList<ProductModel> = ArrayList()
        product.add(ProductModel(R.drawable.masjid_4,"Salom"))
        product.add(ProductModel(R.drawable.masjid_4,"Javlonbek"))
        product.add(ProductModel(R.drawable.masjid_4,"Azimov Eshonxoja"))
        product.add(ProductModel(R.drawable.masjid_4,"Sarvarbek Khalmatov"))
        product.add(ProductModel(R.drawable.masjid_4,"Sherzodbek Jorabekov"))
        return product
    }
}