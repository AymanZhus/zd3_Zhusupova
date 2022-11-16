package com.example.zad3_zhusupova.database
import androidx.room.Dao
import androidx.room.Query
import java.util.*
import androidx.lifecycle.LiveData
import com.example.zad3_zhusupova.Crime

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}