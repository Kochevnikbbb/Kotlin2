package kg.geektech.kotlin2

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.net.URL

//extensions
fun ImageView.glide(uri: String){
    Glide.with(this).load(uri).into(this)
}
fun Context.showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
