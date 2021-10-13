package com.pandorina.periodictableapp.ui.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate), View.OnClickListener {
    companion object {
        const val APP_URL = "https://play.google.com/store/apps/details?id=com.pandorina.periodictableapp"
        const val GITHUB_PROJECT_URL = "https://github.com/farukcuha/PeriodicTableApp"
        const val MY_MAIL_ADDRESS = "ahmetfarukcuha@gmail.com"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvRate.setOnClickListener(this)
        binding.tvContact.setOnClickListener(this)
        binding.tvShare.setOnClickListener(this)
        binding.tvGithub.setOnClickListener(this)
    }

    override fun onClick(item: View?) {
        var intent: Intent? = null
        when(item?.id){
            R.id.tv_rate -> {
                intent = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse(APP_URL) }
            }
            R.id.tv_contact -> {
                intent = Intent(Intent.ACTION_SENDTO).apply { data = Uri.parse("mailto:$MY_MAIL_ADDRESS") }
            }
            R.id.tv_share -> {
                Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, APP_URL)
                    type = "text/plain"
                    intent = Intent.createChooser(this, null)
                }
            }
            R.id.tv_github -> {
                intent = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse(GITHUB_PROJECT_URL) }
            }
        }
        startActivity(intent)
    }
}