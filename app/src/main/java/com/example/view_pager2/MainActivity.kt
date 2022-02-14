package com.example.view_pager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var View_Pager2: ViewPager2=findViewById(R.id.view_pager2)

        postToList()
        View_Pager2?.adapter = MyAdapter(titleList, descList, imagesList)
        View_Pager2?.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator: CircleIndicator3 = findViewById(R.id.indicator)
        indicator.setViewPager(View_Pager2)
    }

    private fun addToLst(title: String, description: String, image: Int) {
        titleList.add(title)
        descList.add(description)
        imagesList.add(image.toString())
    }

    private fun postToList() {
        for (i in 1..5) {
            addToLst("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }
    }
}