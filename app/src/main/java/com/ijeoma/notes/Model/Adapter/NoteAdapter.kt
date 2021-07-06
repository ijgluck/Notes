package com.ijeoma.notes.Model.Adapter

import androidx.recyclerview.widget.RecyclerView
import com.ijeoma.notes.Model.Notes

class NoteAdapter(private val notes: List<Notes>): RecyclerView.Adapter<>()  {
    class NoteViewHolder(private val binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.)
    fun bindNote (note: Note){
        binding.apply{
            idDisplay.text= note. id. toString()
            titleDisplay.text = note
        }
    }
}