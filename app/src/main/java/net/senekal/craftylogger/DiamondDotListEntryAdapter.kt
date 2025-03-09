package net.senekal.craftylogger

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.io.File


class DiamondDotListEntryAdapter(
    private val entries: MutableList<DiamondDotListEntry>,
    private val context: Context,
    private val onItemClick: (DiamondDotListEntry) -> Unit) : RecyclerView.Adapter<DiamondDotListEntryAdapter.DiamondDotListEntryViewHolder>() {

    // Internal nested class
    class DiamondDotListEntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image_view_item_picture)
        private val headerText: TextView = itemView.findViewById(R.id.text_view_heading)
        private val statusText: TextView = itemView.findViewById(R.id.text_view_status)

        public fun bind(entry: DiamondDotListEntry,context: Context,onItemClick: (DiamondDotListEntry) -> Unit){
            var filePath = "DiamondDot/Images/Small/" + entry.image
            Glide.with(itemView.context)
                .load(File(context.filesDir, filePath)) // Load from internal storage
                //.load(entry.image) // Replace this with the path or file reference
                .placeholder(R.drawable.diamond_dot_screen_image) // Optional: Placeholder while loading
                .into(image)
            //image.setImageBitmap(entry.image)
            headerText.text = entry.heading
            statusText.text = entry.status
            // Set the click listener for the item view
            itemView.setOnClickListener { onItemClick(entry) }
        }

    }

    override fun getItemCount(): Int {
        return entries.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiamondDotListEntryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_diamond_dot_list_entry, parent, false)
        return DiamondDotListEntryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DiamondDotListEntryViewHolder, position: Int) {
        holder.bind(entries[position],context,onItemClick)
    }


}