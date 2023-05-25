package com.pelatihan.mysimplenote.data

import java.text.SimpleDateFormat
import java.util.*

object DateNoteHelper {
    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFormat.format(date)
    }
}