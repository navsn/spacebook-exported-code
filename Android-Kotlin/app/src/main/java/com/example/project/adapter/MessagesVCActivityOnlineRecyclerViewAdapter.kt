/*
 * MessagesVCActivityOnlineRecyclerViewAdapter
 * Spacebook
 *
 * Created by [Author].
 * Copyright © 2018 Supernova. All rights reserved.
 */

package com.example.project.adapter

import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.project.R
import com.example.project.activity.*
import java.util.*
import android.support.v7.widget.RecyclerView


class MessagesVCActivityOnlineRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

	companion object {

		private val WWYREQAU_DZ_CELL_VIEW_TYPE = 1
		private val MOCK_DATA = listOf(WWYREQAU_DZ_CELL_VIEW_TYPE, WWYREQAU_DZ_CELL_VIEW_TYPE, WWYREQAU_DZ_CELL_VIEW_TYPE)
	}


	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

		when(viewType) {
			WWYREQAU_DZ_CELL_VIEW_TYPE -> return wwyreqauDZ_CellViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.wwyreqau_dz_cell, parent, false))
		}
		
		throw RuntimeException("Unsupported view type")
	}


	override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

		// Here you can bind RecyclerView item data.

	}


	override fun getItemCount(): Int {

		// Defines number of items in RecyclerView.

		return 3
	}


	override fun getItemViewType(position: Int): Int {

		// Defines item type of the item. You will get the returned value in onCreateViewHolder method.

		return MOCK_DATA.get(position)
	}


	class wwyreqauDZ_CellViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

		init {
			init()
		}

		private fun init() {

			
			// Additional item ViewHolder initialization code can go here.

		}
	}

}

