package com.fast.odc_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.fast.odc_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        Glide.with(binding.root.context)
            .load(getString(R.string.url_img_twitter_black_background))
            .into(binding.imgTwitterBlackBackgroundGlide)

        Glide.with(binding.root.context)
            .load(getString(R.string.url_img_twitter_white_background))
            .into(binding.imgTwitterWhiteBackgroundGlide)

        Glide.with(binding.root.context)
            .load(getString(R.string.url_img_zommed_twitter_black_background))
            .into(binding.imgZommedTwitterBlackBackgroundGlide)

        Glide.with(binding.root.context)
            .load(getString(R.string.url_img_zommed_twitter_white_background))
            .into(binding.imgZommedTwitterWhiteBackgroundGlide)


    }
}