package com.example.notesapp.feature_note.domain.repository

import com.example.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun addNote(note: Note)

    suspend fun deleteNote(note: Note)

}