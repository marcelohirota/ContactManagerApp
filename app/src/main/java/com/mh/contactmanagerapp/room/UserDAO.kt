package com.mh.contactmanagerapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDAO {

    @Insert
    suspend fun insertUser(user: User): Long

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    // Custom queries
    @Query("DELETE FROM user")
    suspend fun deleteAllUsers()

    @Query("Select * FROM user")
    fun getAllUsers(): LiveData<List<User>>
}