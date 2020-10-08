package com.full.invokepage

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class FileReaderActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_reader)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.file_reader, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun openPdfReaderApplication() {
        // Open a specific Activity
        val intent = Intent()
        intent.`package` = "com.full.invokepage"
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        intent.data = Uri.parse("<File Uri>")
        startActivity(intent)
    }

    private fun openPdfReaderActivity() {
        // Open a specific Activity
        val intent = Intent(Intent.ACTION_MAIN)
//        intent.component = ComponentName("<Package>", "<Activity>")
        intent.component = ComponentName("com.full.invokepage", "com.full.invokepage.ViewPDFActivity")
        intent.data = Uri.parse("<File Uri>")
        startActivity(intent)
    }

    private fun openPdfReaderClass() {
        // Open a specific Activity
        val intent = Intent(Intent.ACTION_VIEW)
//        intent.component = ComponentName("<Package>", "<Class>")
        intent.setClassName("com.full.invokepage", "com.full.invokepage.ViewPDFActivity")
        intent.data = Uri.parse("<File Uri>")
        startActivity(intent)
    }


}