/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import code.name.monkey.retromusic.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.play.core.review.ReviewManagerFactory

object AppRater {
    private const val DO_NOT_SHOW_AGAIN = "do_not_show_again"// Package Name
    private const val APP_RATING = "app_rating"// Package Name
    private const val LAUNCH_COUNT = "launch_count"// Package Name
    private const val DATE_FIRST_LAUNCH = "date_first_launch"// Package Name

    private const val DAYS_UNTIL_PROMPT = 3//Min number of days
    private const val LAUNCHES_UNTIL_PROMPT = 5//Min number of launches

    @JvmStatic
    fun appLaunched(context: Activity) {
        return
    }
}