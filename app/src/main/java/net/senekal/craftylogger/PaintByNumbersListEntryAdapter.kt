package net.senekal.craftylogger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    class PaintByNumbersListEntryAdapter(private val entries: MutableList<PaintByNumbersListEntry>) : RecyclerView.Adapter<PaintByNumbersListEntryAdapter.PaintByNumbersListEntryViewHolder>() {




        // Internal nested class
        class PaintByNumbersListEntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val image: ImageView = itemView.findViewById(R.id.image_view_item_picture)
            private val headerText: TextView = itemView.findViewById(R.id.text_view_heading)
            private val descriptionText: TextView = itemView.findViewById(R.id.text_view_description)
            private val ratingBar: RatingBar = itemView.findViewById(R.id.rating_bar)

            public fun bind(entry: PaintByNumbersListEntry,position: Int){
                image.setImageResource(entry.image)
                val headingString: String = "" + (position + 1) + ". " + entry.heading
                headerText.text = entry.heading
                descriptionText.text = entry.description
                ratingBar.rating = entry.rating
            }

        }

        override fun getItemCount(): Int {
            return entries.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaintByNumbersListEntryViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_paint_by_numbers_list_entry, parent, false)
            return PaintByNumbersListEntryViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: PaintByNumbersListEntryViewHolder, position: Int) {
            val entry = entries[position]
            holder.bind(entry,position)
        }


    }