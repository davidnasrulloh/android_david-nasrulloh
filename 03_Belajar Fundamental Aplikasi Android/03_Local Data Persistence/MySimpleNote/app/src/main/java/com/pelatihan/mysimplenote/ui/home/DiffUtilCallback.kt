package com.pelatihan.mysimplenote.ui.home

import androidx.recyclerview.widget.DiffUtil
import com.pelatihan.mysimplenote.data.NoteEntity

class DiffUtilCallback(
    private val mOldNoteList: List<NoteEntity>,
    private val mNewNoteList: List<NoteEntity>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return mOldNoteList.size
    }

    override fun getNewListSize(): Int {
        return mNewNoteList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mOldNoteList[oldItemPosition].id == mNewNoteList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldNoteList = mOldNoteList[oldItemPosition]
        val newNoteList = mNewNoteList[newItemPosition]
        return oldNoteList.title == newNoteList.title && oldNoteList.description == newNoteList.description
    }
}