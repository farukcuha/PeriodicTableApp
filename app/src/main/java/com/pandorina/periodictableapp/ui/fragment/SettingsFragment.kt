package com.pandorina.periodictableapp.ui.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.pandorina.periodictableapp.databinding.FragmentSettingsBinding
import com.pandorina.periodictableapp.ui.activity.MainActivity
import com.pandorina.periodictableapp.util.Constant
import com.pandorina.periodictableapp.util.Constant.LANGUAGE
import com.pandorina.periodictableapp.util.Constant.LANG_EN
import com.pandorina.periodictableapp.util.Constant.LANG_TR
import com.pandorina.periodictableapp.util.Language
import me.grantland.widget.AutofitHelper

class SettingsFragment : BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate) {
    lateinit var preferences: SharedPreferences

    companion object {
        const val APP_URL = "https://play.google.com/store/apps/details?id=com.pandorina.periodictableapp"
        const val MY_MAIL_ADDRESS = "ahmetfarukcuha@gmail.com"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        preferences = requireContext().getSharedPreferences(
            Constant.DEFAULT_PREFERENCE_KEY,
            Context.MODE_PRIVATE
        )

        AutofitHelper.create(binding.tvEn)
        AutofitHelper.create(binding.tvTur)

        checkLanguageConfiguration()
        binding.cvEn.setOnClickListener { setLanguage(LANG_EN) }
        binding.cvTr.setOnClickListener { setLanguage(LANG_TR) }
        binding.tvRate.setOnClickListener {
            Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(APP_URL)
                startActivity(this)
            }
        }
        binding.tvContact.setOnClickListener {
            Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$MY_MAIL_ADDRESS")
                startActivity(this)
            }

        }
        binding.tvShare.setOnClickListener {
            Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, APP_URL)
                type = "text/plain"
                val shareIntent = Intent.createChooser(this, null)
                startActivity(shareIntent)
            }
        }
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