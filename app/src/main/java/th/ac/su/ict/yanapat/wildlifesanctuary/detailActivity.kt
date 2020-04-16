package th.ac.su.ict.yanapat.wildlifesanctuary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class detailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val animalName = intent.getStringExtra("animalName")
        val description = intent.getStringExtra("description")
        val imageFile = intent.getStringExtra("imageFile")
        val caption = intent.getStringExtra("caption")

        tvAnimalName.setText(animalName)
        tvNameRestaurant.setText(caption)
        TVdetail.setText(description)

        val res = resources
        val drawableId:Int = res.getIdentifier(imageFile,"drawable",packageName)

        imgView.setImageResource(drawableId)
    }
}
