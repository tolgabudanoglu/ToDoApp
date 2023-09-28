package com.example.todoapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.todoapp.data.models.ToDoData
import kotlinx.coroutines.flow.Flow


@Dao
interface ToDoDao {

    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllData(): LiveData<List<ToDoData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(toDoData: ToDoData)
}