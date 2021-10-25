package com.pandorina.periodictableapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.databinding.ActivityMainBinding
import com.pandorina.periodictableapp.ui.fragment.SearchFragment
import com.pandorina.periodictableapp.ui.fragment.SettingsFragment
import com.pandorina.periodictableapp.ui.fragment.TableFragment
import java.io.File

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    companion object {
        val adRequest: AdRequest = AdRequest.Builder().build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.replace(TableFragment())
        deleteCache()

        MobileAds.initialize(this)

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

        binding.adView.loadAd(adRequest)
    }

    private fun deleteCache() {
        try {
            deleteDir(cacheDir)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun deleteDir(dir: File?): Boolean {
        if (dir != null && dir.isDirectory) {
            for (i in dir.list()) {
                val success: Boolean = deleteDir(File(dir, i))
                if (!success) {
                    return false
                }
            }
            return dir.delete()
        } else if (dir != null && dir.isFile) {
            return dir.delete()
        } else {
            return false
        }
    }

    private fun FragmentManager.replace(fragment: Fragment) {
        beginTransaction()
            .replace(R.id.container, fragment)
            .setCustomAnimations(R.anim.scale_in, R.anim.scale_out)
            .commit()
    }
}