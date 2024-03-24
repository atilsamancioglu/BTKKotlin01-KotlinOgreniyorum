package com.atilsamancioglu.kotlinogreniyorum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("merhaba dünya")
        println("loglara ikinci yazdırılacak satır")
        // yorum satırı
        println(5 * 2)
        println(10 / 5)
        println(5/2)

        //Kotlin'de veri tipleri ve değişkenler


        //Integer - Tam Sayı
        println("---------Integer--------")
        var x = 10
        println(x)
        println(x * 20)

        x = 30
        println(x * 20)

        var y = 5
        println(y)
        println(x + y)

        //implicit
        val z = 20
        println(z * 50)

        val ornek : Long = 10
        println(ornek * 10)

        //explicit
        val ornekShort : Short = 20
        val ornekByte : Byte = 15
        val ornekInt : Int = 30
        println(ornekByte * ornekShort)

        val kullaniciyasi = 35
        val kullanici_yasi  = 35
        val kullaniciYasi = 35

        // snake_case
        // camelCase

        val m = 10
        val n = 20
        val sonuc = m + n
        println(sonuc)

        //Double - Float - Kesirli sayılar
        println("-------Double&Float-------")

        val pi = 3.14
        println(pi * 2)

        println(5/2)
        println(5.0/2.0)
        val ornekDouble = 3.0

        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat * 2)

        //Unsigned Integer

        val unsignedByte : UByte = 10u
        val unsignedShort : UShort = 10u
        val unsignedInteger : UInt = 10u
        val unsignedLong : ULong = 10u

        //String -> metinler
        println("----------String--------")

        val benimString = "Benim String'im"
        println(benimString)

        val ornekString : String = "ornek"

        val isim = "atıl"
        println(isim.uppercase())

        val soyisim = "samancıoğlu"
        println(isim + " " + soyisim)

        val yas = "25"
        val ornekDeger = "20"
        println(yas + ornekDeger)

        val benimStr : String
        //benimStr.uppercase()
        benimStr = "benim stringim" //initalize, init, initialization

        //Conversion
        val yasInt = yas.toInt()
        val xLong = x.toLong()
        println(xLong)

        println(yasInt * 20)

        //Boolean
        println("------Boolean-------")

        var benimBool : Boolean = true
        benimBool = false

        println(3 > 5)
        println(3 < 5)
        println(4 == 4)

        val kullaniciYas = "35"
        println(kullaniciYas.toInt() > 18)

        // <     küçüktür
        // >     büyüktür
        // <=    küçük eşit
        // >=    büyük eşit
        // ==    eşittir
        // !=    eşit değildir
        // &&    ve
        // ||    veya

        println("atil" == "atil")
        println(10 != 10)

        println(4>3 && 3>5)
        println(4>3 || 3>5)


    }
}