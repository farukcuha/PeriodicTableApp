package com.pandorina.periodictableapp.ui.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.pandorina.periodictableapp.databinding.FragmentSettingsBinding
import com.pandorina.periodictableapp.ui.activity.MainActivity
import com.pandorina.periodictableapp.util.Constant
import com.pandorina.periodictableapp.util.Constant.LANG_EN
import com.pandorina.periodictableapp.util.Constant.LANGUAGE
import com.pandorina.periodictableapp.util.Constant.LANG_TR
import com.pandorina.periodictableapp.util.Language
import me.grantland.widget.AutofitHelper

class SettingsFragment : BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate) {
    lateinit var preferences: SharedPreferences
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        preferences = requireContext().getSharedPreferences(Constant.DEFAULT_PREFERENCE_KEY, Context.MODE_PRIVATE)

        AutofitHelper.create(binding.tvEn)
        AutofitHelper.create(binding.tvTur)

        checkLanguageConfiguration()
        binding.cvEn.setOnClickListener { setLanguage(LANG_EN) }
        binding.cvTr.setOnClickListener { setLanguage(LANG_TR) }
    }

    private fun restartApp(){
        val intent = Intent(requireContext(), MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
    }

    private fun setLanguage(lang_code: String){
        Language(requireContext()).set(lang_code)
        preferences.edit().putString(LANGUAGE, lang_code).apply()
        checkLanguageConfiguration()
        restartApp()
    }

    private fun checkLanguageConfiguration(){
        when(Language(requireContext()).get()){
            LANG_EN -> {
                binding.apply {
                    ivCheckEn.isVisible = true
                    ivCheckTr.isVisible = false
                }
            }
            LANG_TR -> {
                binding.apply {
                    ivCheckEn.isVisible = false
                    ivCheckTr.isVisible = true
                }
            }
        }
    }
}