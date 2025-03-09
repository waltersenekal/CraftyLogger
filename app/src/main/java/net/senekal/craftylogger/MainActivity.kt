package net.senekal.craftylogger

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupClickListeners()
        createAppFolders(this)
    }

    fun createAppFolders(context: Context) {
        // Define the folder paths
        val folderPaths = listOf(
            "DiamondDot/Images/Main",
            "DiamondDot/Images/Extra",
            "PaintByNumbers/Images/Main",
            "PaintByNumbers/Images/Extra"
        )

        // Create each folder
        folderPaths.forEach { path ->
            val folder = File(context.filesDir, path) // Use internal storage
            if (!folder.exists()) {
                folder.mkdirs() // Create the folder structure if it doesn't exist
            }
        }
    }


    private fun setupClickListeners() {
        val diamondDotCardView: CardView = findViewById(R.id.card_view_diamond_dot)
        val paintByNumbersCardView: CardView = findViewById(R.id.card_view_paint_by_numbers)
        diamondDotCardView.setOnClickListener {
            val intent = Intent(this, DiamondDotList::class.java)
            //intent.putExtra("key", "value") // Pass any additional data if required
            startActivity(intent)
        }

        paintByNumbersCardView.setOnClickListener {
            val intent = Intent(this, PaintByNumbersList::class.java) // Replace TargetActivity with your desired Activity
            //intent.putExtra("key", "value") // Pass any additional data if required
            startActivity(intent)
        }



    }
}