package kg.geektech.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kg.geektech.kotlin2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val url = mutableListOf(
        "http://pikstok.ru/images/images/1528372927887.jpg",
        "http://pikstok.ru/images/images/1528373472979.jpg",
        "http://pikstok.ru/images/images/1528373740179.jpg",
        "http://pikstok.ru/images/images/1528373740274.jpg",
        "http://pikstok.ru/images/images/1528373792494.jpg",
        "http://pikstok.ru/images/images/1528373861984.jpg",
        "http://pikstok.ru/images/images/1528374482410.jpg",
        "http://pikstok.ru/images/images/1528374508404.jpg",
        "http://pikstok.ru/images/images/1528374597898.jpg",
        "https://pic.lyricshub.ru/img/0/n/d/n/s4qc1nndn0.jpg",
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            submit()
        }

        binding.btnRandom.setOnClickListener {
            randomButton()
        }
    }

    private fun submit() {
        val submit = binding.etText.text.toString()
        if (submit.isEmpty()) {
            showToast("edit text пустой, добавьте ссылку")
        } else {
            url.add(submit)
            binding.etText.setText("")
            Glide.with(this).load(submit).into(binding.ivImage)
            showToast("Успешно")
        }
    }

    private fun randomButton() {
        val random = Random.nextInt(url.size)
        val randomImage = url[random]
        Glide.with(this).load(randomImage).into(binding.ivImage)
    }
}