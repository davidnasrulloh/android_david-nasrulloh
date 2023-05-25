package com.pelatihan.mysimplenote.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.pelatihan.mysimplenote.data.NoteEntity
import com.pelatihan.mysimplenote.databinding.NoteListBinding
import com.pelatihan.mysimplenote.ui.update.UpdateActivity

class Adapter : RecyclerView.Adapter<Adapter.NoteViewHolder>() {
    private val listNotes = ArrayList<NoteEntity>()
    fun setListNotes(listNotes: List<NoteEntity>) {
        val diffCallback = DiffUtilCallback(this.listNotes, listNotes)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.listNotes.clear()
        this.listNotes.addAll(listNotes)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding = NoteListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(listNotes[position])
    }

    override fun getItemCount(): Int {
        return listNotes.size
    }

    inner class NoteViewHolder(private val binding: NoteListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(note: NoteEntity) {
            with(binding) {
                tvItemTitle.text = note.title
                tvItemDate.text = note.date
                tvItemDescription.text = note.description
                cvItemNote.setOnClickListener {
                    val intent = Intent(it.context, UpdateActivity::class.java)
                    intent.putExtra(UpdateActivity.EXTRA_NOTE, note)
                    it.context.startActivity(intent)
                }
            }
        }
    }
}