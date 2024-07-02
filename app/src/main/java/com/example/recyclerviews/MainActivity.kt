package com.example.recyclerviews

import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val names = listOf("Ann","Bernice","Carol","Diana","Edith","Faith","Hellen","Ivy","Jane",
            "John","Dylan","Steph","Oscar","Peter","Ivy","Jane","Queen","Ataraha","Lilian",
            "Mary","Nate","Richard","Faith","Gina","Bernice","Agnes","George")
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter = namesAdapter


//        exa
//        val contact1 = Contact("Anne")

        }
    }

//data class contact