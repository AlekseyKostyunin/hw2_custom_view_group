package com.alekseykostyunin.hw2_custom_view_group

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alekseykostyunin.hw2_custom_view_group.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.postView.setTopMessageText("Верхняя строка вставлена программно")
        binding.postView.setBottomMessageText("Нижняя вставлена программно")

    }
}