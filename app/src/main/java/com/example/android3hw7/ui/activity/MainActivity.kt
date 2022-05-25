package com.example.android3hw7.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android3hw7.ui.adapter.Adapter
import com.example.android3hw7.databinding.ActivityMainBinding
import com.example.android3hw7.model.CarModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillList()
        setAdapter()
    }

    private fun fillList(): ArrayList<CarModel> {
        val list: ArrayList<CarModel> = arrayListOf(
            CarModel("объем багажника: 150 литров"),
            CarModel("объем двигателя: 5.0 литров"),
            CarModel("объем салона: 1000 литров"),
            CarModel("объем бензобака: 300 литров"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем бачка омывателя: 2 литра"),
            CarModel("объем радиатора: 5 литров")
        )
        return list
    }

    private fun setAdapter() {
        adapter = Adapter(fillList())
        binding.recyclerView.adapter = adapter
    }
}