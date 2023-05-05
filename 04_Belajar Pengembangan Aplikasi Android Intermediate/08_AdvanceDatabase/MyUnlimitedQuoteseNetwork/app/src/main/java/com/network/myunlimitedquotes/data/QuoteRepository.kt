package com.network.myunlimitedquotes.data

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.network.myunlimitedquotes.database.QuoteDatabase
import com.network.myunlimitedquotes.network.ApiService
import com.network.myunlimitedquotes.network.QuoteResponseItem

class QuoteRepository(private val quoteDatabase: QuoteDatabase, private val apiService: ApiService) {
    fun getQuote(): LiveData<PagingData<QuoteResponseItem>> {
        return Pager(
            config = PagingConfig(
                pageSize = 5
            ),
            pagingSourceFactory = {
                QuotePagingSource(apiService)
            }
        ).liveData
    }
}