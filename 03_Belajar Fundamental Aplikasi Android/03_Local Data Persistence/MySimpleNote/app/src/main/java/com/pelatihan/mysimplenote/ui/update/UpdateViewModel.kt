package com.pelatihan.mysimplenote.ui.update

import android.app.Application
import androidx.lifecycle.ViewModel
import com.pelatihan.mysimplenote.data.MyRepository
import com.pelatihan.mysimplenote.data.NoteEntity

class UpdateViewModel(app: Application) : ViewModel() {

    private val mNoteRepository = MyRepository(app)

    fun insertNote(note: NoteEntity) {
        mNoteRepository.insertNote(note)
    }

    fun updateNote(note: NoteEntity) {
        mNoteRepository.updateNote(note)
    }

    fun deleteNote(note: NoteEntity) {
        mNoteRepository.deleteNote(note)
    }

}