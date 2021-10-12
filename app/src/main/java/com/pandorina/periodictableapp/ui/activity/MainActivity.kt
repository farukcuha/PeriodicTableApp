package com.pandorina.periodictableapp.ui.activity

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.databinding.ActivityMainBinding
import com.pandorina.periodictableapp.ui.fragment.SearchFragment
import com.pandorina.periodictableapp.ui.fragment.SettingsFragment
import com.pandorina.periodictableapp.ui.fragment.TableFragment
import com.pandorina.periodictableapp.util.Language

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.replace(TableFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.periodic_table -> {
                    supportFragmentManager.replace(TableFragment())
                }
                R.id.search -> {
                    supportFragmentManager.replace(SearchFragment())
                }
                R.id.settings -> {
                    supportFragmentManager.replace(SettingsFragment())
                }
            }
            return@setOnItemSelectedListener true
        }

        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)
    }

    private fun FragmentManager.replace(fragment: Fragment) {
        beginTransaction()
            .replace(R.id.container, fragment)
            .setCustomAnimations(R.anim.scale_in, R.anim.scale_out)
            .commit()
    }


}