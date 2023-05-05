package com.network.myunlimitedquotes.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.network.myunlimitedquotes.adapter.LoadingStateAdapter
import com.network.myunlimitedquotes.adapter.QuoteListAdapter
import com.network.myunlimitedquotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels {
        ViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvQuote.layoutManager = LinearLayoutManager(this)

        getData()
    }

    private fun getData() {
        val adapter = QuoteListAdapter()

        binding.rvQuote.adapter = adapter.withLoadStateFooter(
            footer = LoadingStateAdapter {
                adapter.retry()
            }
        )

        binding.rvQuote.adapter = adapter
        mainViewModel.quote.observe(this) {
            adapter.submitData(lifecycle, it)
        }
    }
}