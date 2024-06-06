package com.example.latihan
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: AdapterList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        val itemsList = listOf(
            itemList(
                "Java",
                "A high-level, class-based, object-oriented programming language.",
                "https://download.logo.wine/logo/Java_(programming_language)/Java_(programming_language)-Logo.wine.png"
            ),
            itemList(
                "Python",
                "An interpreted, high-level, general-purpose programming language.",
                "https://logos-download.com/wp-content/uploads/2016/10/Python_logo_icon.png"
            ),
            itemList(
                "JavaScript",
                "A programming language that is one of the core technologies of the World Wide Web.",
                "https://logodownload.org/wp-content/uploads/2022/04/javascript-logo-0.png"
            ),
            itemList(
                "C++",
                "A general-purpose programming language created as an extension of the C programming language.",
                "https://download.logo.wine/logo/C%2B%2B/C%2B%2B-Logo.wine.png"
            ),
        )
        val adapter = AdapterList(itemsList)
        recyclerView.adapter = adapter
    }
}