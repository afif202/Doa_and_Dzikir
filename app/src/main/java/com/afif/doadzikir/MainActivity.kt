package com.afif.doadzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pagi_petang_dzikir.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var llQauliyahShalatActivity: LinearLayout
    private lateinit var llSetiapSaatDzikirActivity: LinearLayout
    private lateinit var llHarianDzikirDoaActivity: LinearLayout
    private lateinit var llPagiPetangDzikirActivity: LinearLayout
    private lateinit var vpArtikel: ViewPager2
    private lateinit var sliderDots: LinearLayout


    private lateinit var dotsIndicator: Array<ImageView?>
    private var listArtikel: ArrayList<Artikel> = arrayListOf()

    private val slidingCallback = object : ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            for (i in 0 until listArtikel.size){
//                dotsIndicator[i]?.setImage
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        llQauliyahShalatActivity = findViewById(R.id.ll_qauliyah_shalat)
        llSetiapSaatDzikirActivity = findViewById(R.id.ll_setiap_saat_dzikir)
        llHarianDzikirDoaActivity = findViewById(R.id.ll_dzikir_doa_harian)
        llPagiPetangDzikirActivity = findViewById(R.id.ll_dzikir_pagi_petang)

        llQauliyahShalatActivity.setOnClickListener(this)
        llSetiapSaatDzikirActivity.setOnClickListener(this)
        llHarianDzikirDoaActivity.setOnClickListener(this)
        llPagiPetangDzikirActivity.setOnClickListener(this)

    }

    private fun initView() {
        val llQauliyahShalatActivity: LinearLayout = findViewById(R.id.ll_qauliyah_shalat)
        llQauliyahShalatActivity.setOnClickListener{
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        }

        val llSetiapSaatDzikirActivity: LinearLayout = findViewById(R.id.ll_setiap_saat_dzikir)
        llSetiapSaatDzikirActivity.setOnClickListener{
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        }

        val llHarianDzikirDoaActivity: LinearLayout = findViewById(R.id.ll_dzikir_doa_harian)
        llHarianDzikirDoaActivity.setOnClickListener{
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        }

        val llPagiPetangDzikirActivity: LinearLayout = findViewById(R.id.ll_dzikir_pagi_petang)
        llPagiPetangDzikirActivity.setOnClickListener{
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        }
    }

    override fun onClick(view: View?) {
/*        if (view?.id == R.id.ll_qauliyah_shalat) {
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        } else if (view?.id == R.id.ll_setiap_saat_dzikir) {
            startActivity(Intent(this, ll_setiap_saat_dzikir::class.java))
        } else if (view?.id == R.id.ll_dzikir_doa_harian) {
            startActivity(Intent(this, HarianDzikirDoaActivity::class.java))
        } else if (view?.id == R.id.ll_dzikir_pagi_petang) {
            startActivity(Intent(this, PagiPetangDzikirActivity::class.java))
        } else {

        }*/

        when (view?.id) {
            R.id.ll_qauliyah_shalat -> startActivity(
                Intent(
                    this,
                    QauliyahShalatActivity::class.java
                )
            )
            R.id.ll_setiap_saat_dzikir -> startActivity(
                Intent(
                    this,
                    SetiapSaatDzikirActivity::class.java
                )
            )
            R.id.ll_dzikir_doa_harian -> startActivity(
                Intent(
                    this,
                    HarianDzikirDoaActivity::class.java
                )
            )
            R.id.ll_dzikir_pagi_petang -> startActivity(
                Intent(
                    this,
                    PagiPetangDzikirActivity::class.java
                )
            )
        }
    }
}