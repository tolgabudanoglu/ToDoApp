package com.example.todoapp.data


import androidx.room.TypeConverter
import com.example.todoapp.data.models.Priority

class TypeConverter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}
