package net.senekal.craftylogger

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import java.io.File
import java.io.FileOutputStream

class DiamondDotList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diamond_dot_list)
        setupList()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycler_view_diamond_dot_list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun setupList(){
        //resizeImages()
        var myList= mutableListOf<DiamondDotListEntry>()
        myList.add( DiamondDotListEntry("DP001  Diamond Name", "Completed  Keep", "001.jpg"))
        myList.add( DiamondDotListEntry("DP002  Diamond Name", "Completed  Keep", "002.jpg"))
        myList.add( DiamondDotListEntry("DP003  Diamond Name", "Completed  Keep", "003.jpg"))
        myList.add( DiamondDotListEntry("DP004  Diamond Name", "Completed  Keep", "004.jpg"))
        myList.add( DiamondDotListEntry("DP005  Diamond Name", "Completed  Keep", "005.jpg"))
        myList.add( DiamondDotListEntry("DP006  Diamond Name", "Completed  Keep", "006.jpg"))
        myList.add( DiamondDotListEntry("DP007  Diamond Name", "Completed  Keep", "007.jpg"))
        myList.add( DiamondDotListEntry("DP008  Diamond Name", "Completed  Keep", "008.jpg"))
        myList.add( DiamondDotListEntry("DP009  Diamond Name", "Completed  Keep", "009.jpg"))
        myList.add( DiamondDotListEntry("DP010  Diamond Name", "Completed  Keep", "010.jpg"))
        myList.add( DiamondDotListEntry("DP011  Diamond Name", "Completed  Keep", "011.jpg"))
        myList.add( DiamondDotListEntry("DP015  Diamond Name", "Completed  Keep", "015.jpg"))
        myList.add( DiamondDotListEntry("DP016  Diamond Name", "Completed  Keep", "016.jpg"))
        myList.add( DiamondDotListEntry("DP017  Diamond Name", "Completed  Keep", "017.jpg"))
        myList.add( DiamondDotListEntry("DP018  Diamond Name", "Completed  Keep", "018.jpg"))
        myList.add( DiamondDotListEntry("DP019  Diamond Name", "Completed  Keep", "019.jpg"))
        myList.add( DiamondDotListEntry("DP020  Diamond Name", "Completed  Keep", "020.jpg"))
        myList.add( DiamondDotListEntry("DP021  Diamond Name", "Completed  Keep", "021.jpg"))
        myList.add( DiamondDotListEntry("DP022  Diamond Name", "Completed  Keep", "022.jpg"))
        myList.add( DiamondDotListEntry("DP023  Diamond Name", "Completed  Keep", "023.jpg"))
        myList.add( DiamondDotListEntry("DP024  Diamond Name", "Completed  Keep", "024.jpg"))
        myList.add( DiamondDotListEntry("DP025  Diamond Name", "Completed  Keep", "025.jpg"))
        myList.add( DiamondDotListEntry("DP026  Diamond Name", "Completed  Keep", "026.jpg"))
        myList.add( DiamondDotListEntry("DP027  Diamond Name", "Completed  Keep", "027.jpg"))
        myList.add( DiamondDotListEntry("DP028  Diamond Name", "Completed  Keep", "028.jpg"))
        myList.add( DiamondDotListEntry("DP029  Diamond Name", "Completed  Keep", "029.jpg"))
        myList.add( DiamondDotListEntry("DP030  Diamond Name", "Completed  Keep", "030.jpg"))
        myList.add( DiamondDotListEntry("DP032  Diamond Name", "Completed  Keep", "032.jpg"))
        myList.add( DiamondDotListEntry("DP033  Diamond Name", "Completed  Keep", "033.jpg"))
        myList.add( DiamondDotListEntry("DP034  Diamond Name", "Completed  Keep", "034.jpg"))
        myList.add( DiamondDotListEntry("DP036  Diamond Name", "Completed  Keep", "036.jpg"))
        myList.add( DiamondDotListEntry("DP037  Diamond Name", "Completed  Keep", "037.jpg"))
        myList.add( DiamondDotListEntry("DP038  Diamond Name", "Completed  Keep", "038.jpg"))
        myList.add( DiamondDotListEntry("DP039  Diamond Name", "Completed  Keep", "039.jpg"))
        myList.add( DiamondDotListEntry("DP040  Diamond Name", "Completed  Keep", "040.jpg"))
        myList.add( DiamondDotListEntry("DP041  Diamond Name", "Completed  Keep", "041.jpg"))
        myList.add( DiamondDotListEntry("DP042  Diamond Name", "Completed  Keep", "042.jpg"))
        myList.add( DiamondDotListEntry("DP043  Diamond Name", "Completed  Keep", "043.jpg"))
        myList.add( DiamondDotListEntry("DP044  Diamond Name", "Completed  Keep", "044.jpg"))
        myList.add( DiamondDotListEntry("DP045  Diamond Name", "Completed  Keep", "045.jpg"))
        myList.add( DiamondDotListEntry("DP046  Diamond Name", "Completed  Keep", "046.jpg"))
        myList.add( DiamondDotListEntry("DP047  Diamond Name", "Completed  Keep", "047.jpg"))
        myList.add( DiamondDotListEntry("DP048  Diamond Name", "Completed  Keep", "048.jpg"))
        myList.add( DiamondDotListEntry("DP049  Diamond Name", "Completed  Keep", "049.jpg"))
        myList.add( DiamondDotListEntry("DP050  Diamond Name", "Completed  Keep", "050.jpg"))
        myList.add( DiamondDotListEntry("DP052  Diamond Name", "Completed  Keep", "052.jpg"))
        myList.add( DiamondDotListEntry("DP053  Diamond Name", "Completed  Keep", "053.jpg"))
        myList.add( DiamondDotListEntry("DP054  Diamond Name", "Completed  Keep", "054.jpg"))
        myList.add( DiamondDotListEntry("DP055  Diamond Name", "Completed  Keep", "055.jpg"))
        myList.add( DiamondDotListEntry("DP056  Diamond Name", "Completed  Keep", "056.jpg"))
        myList.add( DiamondDotListEntry("DP057  Diamond Name", "Completed  Keep", "057.jpg"))
        myList.add( DiamondDotListEntry("DP058  Diamond Name", "Completed  Keep", "058.jpg"))
        myList.add( DiamondDotListEntry("DP059  Diamond Name", "Completed  Keep", "059.jpg"))
        myList.add( DiamondDotListEntry("DP060  Diamond Name", "Completed  Keep", "060.jpg"))
        myList.add( DiamondDotListEntry("DP061  Diamond Name", "Completed  Keep", "061.jpg"))
        myList.add( DiamondDotListEntry("DP063  Diamond Name", "Completed  Keep", "063.jpg"))
        myList.add( DiamondDotListEntry("DP065  Diamond Name", "Completed  Keep", "065.jpg"))
        myList.add( DiamondDotListEntry("DP066  Diamond Name", "Completed  Keep", "066.jpg"))
        myList.add( DiamondDotListEntry("DP067  Diamond Name", "Completed  Keep", "067.jpg"))
        myList.add( DiamondDotListEntry("DP068  Diamond Name", "Completed  Keep", "068.jpg"))
        myList.add( DiamondDotListEntry("DP069  Diamond Name", "Completed  Keep", "069.jpg"))
        myList.add( DiamondDotListEntry("DP070  Diamond Name", "Completed  Keep", "070.jpg"))
        myList.add( DiamondDotListEntry("DP071  Diamond Name", "Completed  Keep", "071.jpg"))
        myList.add( DiamondDotListEntry("DP072  Diamond Name", "Completed  Keep", "072.jpg"))
        myList.add( DiamondDotListEntry("DP073  Diamond Name", "Completed  Keep", "073.jpg"))
        myList.add( DiamondDotListEntry("DP075  Diamond Name", "Completed  Keep", "075.jpg"))
        myList.add( DiamondDotListEntry("DP076  Diamond Name", "Completed  Keep", "076.jpg"))
        myList.add( DiamondDotListEntry("DP077  Diamond Name", "Completed  Keep", "077.jpg"))
        myList.add( DiamondDotListEntry("DP078  Diamond Name", "Completed  Keep", "078.jpg"))
        myList.add( DiamondDotListEntry("DP079  Diamond Name", "Completed  Keep", "079.jpg"))
        myList.add( DiamondDotListEntry("DP080  Diamond Name", "Completed  Keep", "080.jpg"))
        myList.add( DiamondDotListEntry("DP082  Diamond Name", "Completed  Keep", "082.jpg"))
        myList.add( DiamondDotListEntry("DP083  Diamond Name", "Completed  Keep", "083.jpg"))



//        myList.add( DiamondDotListEntry("DP001 - Diamond Name", "Not Received", loadImageFromMainFolder(    "001.jpg")))
//        myList.add( DiamondDotListEntry("DP002 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("002.jpg")))
//        myList.add( DiamondDotListEntry("DP003 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("003.jpg")))
//        myList.add( DiamondDotListEntry("DP004 - Diamond Name", "Not Started", loadImageFromMainFolder(     "004.jpg")))
//        myList.add( DiamondDotListEntry("DP005 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("005.jpg")))
//        myList.add( DiamondDotListEntry("DP006 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("006.jpg")))
//        myList.add( DiamondDotListEntry("DP007 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("007.jpg")))
//        myList.add( DiamondDotListEntry("DP008 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("008.jpg")))
//        myList.add( DiamondDotListEntry("DP009 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("009.jpg")))
//        myList.add( DiamondDotListEntry("DP010 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("010.jpg")))
//        myList.add( DiamondDotListEntry("DP011 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("011.jpg")))
//        myList.add( DiamondDotListEntry("DP015 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("015.jpg")))
//        myList.add( DiamondDotListEntry("DP016 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("016.jpg")))
//        myList.add( DiamondDotListEntry("DP017 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("017.jpg")))
//        myList.add( DiamondDotListEntry("DP018 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("018.jpg")))
//        myList.add( DiamondDotListEntry("DP019 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("019.jpg")))
//        myList.add( DiamondDotListEntry("DP020 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("020.jpg")))
//        myList.add( DiamondDotListEntry("DP021 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("021.jpg")))
//        myList.add( DiamondDotListEntry("DP022 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("022.jpg")))
//        myList.add( DiamondDotListEntry("DP023 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("023.jpg")))
//        myList.add( DiamondDotListEntry("DP024 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("024.jpg")))
//        myList.add( DiamondDotListEntry("DP026 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("026.jpg")))
//        myList.add( DiamondDotListEntry("DP027 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("027.jpg")))
//        myList.add( DiamondDotListEntry("DP028 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("028.jpg")))
//        myList.add( DiamondDotListEntry("DP029 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("029.jpg")))
//        myList.add( DiamondDotListEntry("DP030 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("030.jpg")))
//        myList.add( DiamondDotListEntry("DP032 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("032.jpg")))
//        myList.add( DiamondDotListEntry("DP033 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("033.jpg")))
//        myList.add( DiamondDotListEntry("DP034 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("034.jpg")))
//        myList.add( DiamondDotListEntry("DP036 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("036.jpg")))
//        myList.add( DiamondDotListEntry("DP037 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("037.png")))
//        myList.add( DiamondDotListEntry("DP038 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("038.png")))
//        myList.add( DiamondDotListEntry("DP039 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("039.png")))
//        myList.add( DiamondDotListEntry("DP040 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("040.png")))
//        myList.add( DiamondDotListEntry("DP041 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("041.jpg")))
//        myList.add( DiamondDotListEntry("DP042 - Diamond Name", "Completed - Keep", loadImageFromMainFolder("042.png")))

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_diamond_dot_list)
        val adapter =  DiamondDotListEntryAdapter(myList,this ){ selectedEntry ->
            openDetailsPage(selectedEntry) // Handle item click
        }
        recyclerView.adapter = adapter


    }
    private fun openDetailsPage(entry: DiamondDotListEntry) {
        val intent = Intent(this, DiamondDotListItemDetails::class.java).apply {
            putExtra("image", entry.image)
            putExtra("heading", entry.heading)
            putExtra("status", entry.status)
        }
        startActivity(intent)
    }
    fun loadImageFromMainFolder( fileName: String): Bitmap {
        val folderPath = File(this.filesDir, "DiamondDot/Images/Main")
        val file = File(folderPath, fileName)

        return if (file.exists()) {
            BitmapFactory.decodeFile(file.absolutePath)
        } else {
            // Create a red bitmap as fallback
            createRedBitmap(100, 100) // Default size of 100x100 pixels
        }
    }

    // Helper function to create a red bitmap
    private fun createRedBitmap(width: Int, height: Int): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        bitmap.eraseColor(Color.RED) // Set the entire bitmap to red
        return bitmap
    }

    private fun resizeImages() {
        val mainFolder = File(this.filesDir,"DiamondDot/Images/Main")
        val smallFolder = File(this.filesDir,"DiamondDot/Images/Small")

        // Create the "Small" folder if it doesn't exist
        if (!smallFolder.exists()) {
            smallFolder.mkdirs()
        }

        // Iterate through all image files in the "Main" folder
        mainFolder.listFiles()?.forEach { file ->
            if (file.extension.lowercase() in listOf("jpg", "jpeg", "png")) {
                // Load the bitmap
                val bitmap = BitmapFactory.decodeFile(file.absolutePath)

                // Calculate the new width and height while maintaining aspect ratio
                val newWidth = 1080
                val aspectRatio = bitmap.height.toFloat() / bitmap.width
                val newHeight = (newWidth * aspectRatio).toInt()

                // Resize the bitmap
                val resizedBitmap = Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, true)

                // Save the resized bitmap as JPG in the "Small" folder
                val outputFile = File(smallFolder, file.nameWithoutExtension + ".jpg")
                saveBitmapAsJPG(resizedBitmap, outputFile)
            }
        }
    }

    private fun saveBitmapAsJPG(bitmap: Bitmap, file: File) {
        // Save the bitmap as JPG (quality 90%)
        FileOutputStream(file).use { out ->
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out)
        }
    }
}