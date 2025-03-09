package net.senekal.craftylogger

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import java.io.File


class DiamondDotListItemDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_diamond_dot_list_item_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setContentView(R.layout.activity_diamond_dot_list_item_details)

        val image = intent.getStringExtra("image")
        val heading = intent.getStringExtra("heading")
        val status = intent.getStringExtra("status")

        val imageView: ImageView = findViewById(R.id.image_view_detail_picture)
        val headingTextView: TextView = findViewById(R.id.text_view_detail_heading)
        val statusTextView: TextView = findViewById(R.id.text_view_detail_status)

        val filePath = "DiamondDot/Images/Small/" + image
        Glide.with(this)
            .load(File(filesDir, filePath))
            .placeholder(R.drawable.diamond_dot_screen_image)
            .into(imageView)

        headingTextView.text = heading
        statusTextView.text = status
    }
}