package com.teamfairy.feature.community

import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.teamfairy.core_ui.base.BindingFragment
import com.teamfairy.feature.R
import com.teamfairy.feature.databinding.FragmentCommunityBinding

class CommunityFragment : BindingFragment<FragmentCommunityBinding>(R.layout.fragment_community) {
    override fun initView() {
        initCommunityTabAdapter()
        initNavigateToPostingBtnClickListener()
    }

    private fun initCommunityTabAdapter() {
        binding.vpCommunity.adapter = CommunityViewpagerAdapter(this)
        TabLayoutMediator(binding.tablayoutCommunity, binding.vpCommunity) { tab, position ->
            when (position) {
                0 -> tab.text = "daily"
                else -> tab.text = "share delivery"
            }
        }.attach()
    }

    private fun initNavigateToPostingBtnClickListener() {
        binding.ivCommunityFragmentPosting.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_community_to_communityPosting)
        }
    }
}