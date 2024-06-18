package com.alekseykostyunin.hw2_custom_view_group

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.alekseykostyunin.hw2_custom_view_group.databinding.PostViewBinding

class PostView (context: Context, attrs: AttributeSet? = null) : LinearLayout(context, attrs)  {

    private val binding: PostViewBinding

    init {
        val inlflatedView = inflate(context, R.layout.post_view, this)
        binding = PostViewBinding.bind(inlflatedView)
    }

    fun setTopMessageText(text: String) {
        binding.topTextPost.text = text
    }

    fun setBottomMessageText(text: String)  {
        binding.bottomTextPost.text = text
    }


}