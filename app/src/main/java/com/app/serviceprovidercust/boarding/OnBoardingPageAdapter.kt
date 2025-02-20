package com.app.serviceprovidercust.boarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingPageAdapter(activity: FragmentActivity) :FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return OnBoardingFragment.newInstance(position)
    }
}