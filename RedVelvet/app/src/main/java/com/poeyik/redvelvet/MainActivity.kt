package com.poeyik.redvelvet

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.image1에 ImageView에 있는 redvelvet_1을 가져와라
        val image1 = findViewById<ImageView>(R.id.redelvet_1)
        //2.사진이 클릭되면 1번 클릭완료를 출력
        image1.setOnClickListener{
            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_SHORT).show()
            //3.클릭되면 다음화면으로 넘어가서 화면이 커짐
            var intent = Intent(this,RedVelvet1Activity::class.java)
            startActivity(intent)
        }
        //7개 사진들 클릭시 해당 액티비티로 이동
        val image2 = findViewById<ImageView>(R.id.redelvet_2)
        val image3 = findViewById<ImageView>(R.id.redelvet_3)
        val image4 = findViewById<ImageView>(R.id.redelvet_4)
        val image5 = findViewById<ImageView>(R.id.redelvet_5)
        val image6 = findViewById<ImageView>(R.id.redelvet_6)
        val image7 = findViewById<ImageView>(R.id.redelvet_7)
        image2.setOnClickListener{
            var intent = Intent(this,RedVelvet2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{
            var intent = Intent(this,RedVelvet3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{
            var intent = Intent(this,RedVelvet4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{
            var intent = Intent(this,RedVelvet5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{
            var intent = Intent(this,RedVelvet6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{
            var intent = Intent(this,RedVelvet7Activity::class.java)
            startActivity(intent)
        }
    }
}