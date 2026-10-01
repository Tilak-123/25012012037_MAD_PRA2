 package com.example.a25012012037_mad_pra2
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate function called")
        showSnackbar("onCreate function called")
    }
    fun showMessage(message: String) {
        Log.i(TAG, "showMessage: $message")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    fun showSnackbar(message: String) {
        val rootView = findViewById<android.view.View>(R.id.main)
        Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        showMessage("onRestart function called.")
        showSnackbar("onRestart function called.")
        super.onRestart()
    }
    override fun onStart() {
        showMessage("onStart function called.")
        showSnackbar("onStart function called.")
        super.onStart()
    }
    override fun onResume() {
        showMessage("onResume function called.")
        showSnackbar("onResume function called.")
        super.onResume()
    }
    override fun onPause() {
        showMessage("onPause function called.")
        showSnackbar("onPause function called.")
        super.onPause()
    }
    override fun onStop() {
        showMessage("onStop function called.")
        showSnackbar("onStop function called.")
        super.onStop()
    }
    override fun onDestroy() {
        showMessage("onDestroy function called.")
        showSnackbar("onDestroy function called.")
        super.onDestroy()
    }
}