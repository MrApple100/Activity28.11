package ru.mrapple100.activity2819

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ru.mrapple100.activity2819.databinding.ActivityMainBinding
import ru.mrapple100.activity2819.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_second)
        setContentView(binding.root)
        if(intent.hasExtra("Text"))
            binding.Second2.text = intent.getStringExtra("Text")
        binding.Click2.setOnClickListener{
            val intent = Intent()
            intent.putExtra("MyName","Sasha")
            setResult(0,intent)
            finish()

        }
    }
}