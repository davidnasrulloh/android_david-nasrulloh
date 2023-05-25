package com.pelatihan.mysimplenote.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pelatihan.mysimplenote.data.MyRepository
import com.pelatihan.mysimplenote.data.NoteEntity

class HomeViewModel(app: Application) : ViewModel() {
    private val mNoteRepository = MyRepository(app)
    fun getAllNotes(): LiveData<List<NoteEntity>> = mNoteRepository.getAllNotes()
}