package com.example.newsapp.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.newsapp.databinding.FragmentSearchNewsBinding
import com.example.newsapp.ui.NewsActivity
import com.example.newsapp.utlis.BaseFragment
import com.example.newsapp.view_models.NewsViewModel

class SearchNewsFragment : BaseFragment<FragmentSearchNewsBinding>(FragmentSearchNewsBinding::inflate) {

    lateinit var viewModel: NewsViewModel

    override fun startCreating(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }

    private fun init(){
        viewModel = (activity as NewsActivity).viewModel
    }
}