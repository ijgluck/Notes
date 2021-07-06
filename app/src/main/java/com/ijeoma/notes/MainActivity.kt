package com.ijeoma.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ijeoma.notes.Model.Adapter.NoteAdapter
import com.ijeoma.notes.Model.NoteDataBase
import com.ijeoma.notes.Model.Notes
import com.ijeoma.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var  binding: ActivityMainBinding
private lateinit var database: NoteDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = Room.databaseBuilder(this, NoteDataBase:: class.java,
        "notes_datatbase"
        ).build()
        notesAdapter=NoteAdapter ( datatbse.notesAdapter)
    }
    private fun saveNote(title:String, content:String){
val note = Notes (id = 0, title, content)
    }
}