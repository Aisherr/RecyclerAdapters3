package com.example.recycleradapters3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleradapters3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.ceylon, "Ceylon"))
        list.add(Info(R.drawable.apache, "Apache"))
        list.add(Info(R.drawable.atom, "Atom"))
        list.add(Info(R.drawable.cakephp, "Cakephp"))
        list.add(Info(R.drawable.django, "Django"))
        list.add(Info(R.drawable.ionic, "Ionic"))
        list.add(Info(R.drawable.linux, "Linux"))
        list.add(Info(R.drawable.pycharm, "Pycharm"))
        list.add(Info(R.drawable.sequelize, "Sequelize"))
        list.add(Info(R.drawable.sketch, "Sketch"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}