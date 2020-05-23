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

package code.name.monkey.retromusic.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.core.text.HtmlCompat
import androidx.fragment.app.DialogFragment
import code.name.monkey.retromusic.R
import code.name.monkey.retromusic.model.smartplaylist.AbsSmartPlaylist
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class ClearSmartPlaylistDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val playlist = requireArguments().getParcelable<AbsSmartPlaylist>("playlist")
        val title = R.string.clear_playlist_title

        val message = HtmlCompat.fromHtml(
            getString(R.string.clear_playlist_x, playlist!!.name),
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )

        return MaterialAlertDialogBuilder(
            requireContext(),
            R.style.ThemeOverlay_MaterialComponents_Dialog_Alert
        )
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(R.string.clear_action) { _, _ ->
                playlist.clear(requireActivity())
            }
            .setNegativeButton(android.R.string.cancel, null)
            .create()
    }

    companion object {

        fun create(playlist: AbsSmartPlaylist): ClearSmartPlaylistDialog {
            val dialog = ClearSmartPlaylistDialog()
            val args = Bundle()
            args.putParcelable("playlist", playlist)
            dialog.arguments = args
            return dialog
        }
    }
}