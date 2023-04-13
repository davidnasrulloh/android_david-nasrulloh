package com.davidnasrulloh.likesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.davidnasrulloh.likesapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTab()
    }

    private fun setTab(){
        binding.viewPager.adapter = SectionPagerAdapter(this)
        binding.viewPager.offscreenPageLimit = 2
        TabLayoutMediator(binding.tabs, binding.viewPager){
            tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

}