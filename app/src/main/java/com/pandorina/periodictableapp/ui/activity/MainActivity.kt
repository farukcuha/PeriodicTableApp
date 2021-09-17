package com.pandorina.periodictableapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.databinding.ActivityMainBinding
import com.pandorina.periodictableapp.ui.fragment.SearchFragment
import com.pandorina.periodictableapp.ui.fragment.TableFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add<TableFragment>(R.id.container)
            setReorderingAllowed(true)
        }

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.periodic_table -> {
                    supportFragmentManager.commit {
                        replace<TableFragment>(R.id.container)
                        setReorderingAllowed(true)
                    }
                }
                R.id.search -> {
                    supportFragmentManager.commit {
                        replace<SearchFragment>(R.id.container)
                        setReorderingAllowed(true)
                    }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}