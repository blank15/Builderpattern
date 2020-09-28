package id.yudistiro.builderpattern.builder

import android.content.Context
import android.widget.TextView

/**
 * Created by yudistiro15 on 27/09/20
 */

object Car{
    private var bodyColor:String  =""
    private var carSeat:Int = 4
    private var wheelsCar:Int = 4
    private lateinit var resultString: TextView

    fun setBodyColor(color:String) : Car {
        bodyColor = color
        return this
    }

    fun getReturn(resultInterface: ResultInterface) : Car{
        val data = carSeat * wheelsCar
        resultInterface.jumlahRoda(data)
        return this
    }

    fun setCarSeat(count:Int) : Car {
        carSeat = count
        return this
    }

    fun setToTextView(textView: TextView) : Car {
        resultString = textView
        return this
    }

    fun setWheelsCar(count:Int) : Car {
        wheelsCar = count
        return this
    }

    fun showResult(context: Context) : Car {
        resultString.text = "Objek car dengan warna $bodyColor kursi $carSeat buah dan roda $wheelsCar buah"
        return this
    }

}