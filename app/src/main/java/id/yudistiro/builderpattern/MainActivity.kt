package id.yudistiro.builderpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.yudistiro.builderpattern.builder.Car
import id.yudistiro.builderpattern.builder.ResultInterface
import id.yudistiro.builderpattern.builder.Sepeda
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * With Object
         */
//        Car.setBodyColor("hijau")
//            .setCarSeat(4)
//            .setToTextView(result)
//            .setWheelsCar(4)
//            .getReturn(object:ResultInterface{
//                override fun jumlahRoda(count: Int) {
//                    Log.d("data oke","adalah $count")
//                }
//
//            })
//            .showResult(this)

        /**
         * With Class
         */
        Sepeda.Builder(this)
             .setData("data")
            .setname("name")
            .setTextView(result)
            .build()
    }
}