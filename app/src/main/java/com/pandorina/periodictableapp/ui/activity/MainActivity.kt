package com.pandorina.periodictableapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.*
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.databinding.ActivityMainBinding
import com.pandorina.periodictableapp.ui.fragment.SearchFragment
import com.pandorina.periodictableapp.ui.fragment.TableFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.scale_in, R.anim.scale_out)
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
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun FragmentManager.replace(fragment: Fragment) {
        beginTransaction()
            .replace(R.id.container, fragment)
            .setCustomAnimations(R.anim.scale_in, R.anim.scale_out)
            .commit()
    }
}