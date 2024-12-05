package ru.mrapple100.activity2819

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import ru.mrapple100.activity2819.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)

        binding.First1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Text","Monkey")
            //startActivityForResult(intent,123)
            launcher.launch(intent)
        }

    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(requestCode==123 && resultCode==0){
//           val string =  data?.getStringExtra("MyName")
//            Toast.makeText(this,string,Toast.LENGTH_SHORT).show()
//        }
//
//    }







    val launcher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback {
            if( it.resultCode==0){
                val string =  it.data?.getStringExtra("MyName")
                Toast.makeText(this,string,Toast.LENGTH_SHORT).show()
            }
    })
}