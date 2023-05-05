package com.network.myunlimitedquotes.di

import android.content.Context
import com.network.myunlimitedquotes.data.QuoteRepository
import com.network.myunlimitedquotes.database.QuoteDatabase
import com.network.myunlimitedquotes.network.ApiConfig

object Injection {
    fun provideRepository(context: Context): QuoteRepository {
        val database = QuoteDatabase.getDatabase(context)
        val apiService = ApiConfig.getApiService()
        return QuoteRepository(database, apiService)
    }
}