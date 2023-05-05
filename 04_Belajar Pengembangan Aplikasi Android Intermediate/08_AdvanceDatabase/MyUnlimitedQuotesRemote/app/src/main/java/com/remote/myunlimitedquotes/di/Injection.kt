package com.remote.myunlimitedquotes.di

import android.content.Context
import com.remote.myunlimitedquotes.data.QuoteRepository
import com.remote.myunlimitedquotes.database.QuoteDatabase
import com.remote.myunlimitedquotes.network.ApiConfig

object Injection {
    fun provideRepository(context: Context): QuoteRepository {
        val database = QuoteDatabase.getDatabase(context)
        val apiService = ApiConfig.getApiService()
        return QuoteRepository(database, apiService)
    }
}