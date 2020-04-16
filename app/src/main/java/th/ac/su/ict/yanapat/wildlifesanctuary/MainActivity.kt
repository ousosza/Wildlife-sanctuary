package th.ac.su.ict.yanapat.wildlifesanctuary


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.ict.yanapat.wildlifesanctuary.Data.animal
import th.ac.su.ict.yanapat.wildlifesanctuary.Data.animalAdapter
import th.ac.su.ict.yanapat.wildlifesanctuary.Utils.getJsonDataFromAsset
import java.util.zip.Inflater


class MainActivity : AppCompatActivity() {

    var itemList:ArrayList<animal> = ArrayList<animal>()
    lateinit var arrayAdapter: ArrayAdapter<animal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"animal_data.json")


        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<animal>>(){}.type

        var animalList : ArrayList<animal> = gson.fromJson(jsonFileString,listItemType)

        itemList = animalList

        val adapter = animalAdapter(this@MainActivity,itemList)

        listView.adapter = adapter

    }
}

