package com.example.viagemja.utils

import android.media.Image
import com.example.viagemja.common.NameDriverConstants
import com.example.viagemja.R

fun NameDriverUtils(name: String): Int {
    return when(name) {
        NameDriverConstants.SIMPSON -> R.drawable.hommer
        NameDriverConstants.BOND -> R.drawable.bond
        NameDriverConstants.TORETO -> R.drawable.vindiesel
        else -> R.drawable.hommer
    }
}