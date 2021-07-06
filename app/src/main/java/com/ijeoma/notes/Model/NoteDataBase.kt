package com.ijeoma.notes.Model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Notes::class], version = 1)
abstract class NoteDataBase: RoomDatabase() {
    abstract fun noteDAO(): NoteDAO
}