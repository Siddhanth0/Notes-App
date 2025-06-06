package com.example.notesapp.feature_note.domain.util

import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.presentation.notes.NoteOrder

data class NotesState (
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
