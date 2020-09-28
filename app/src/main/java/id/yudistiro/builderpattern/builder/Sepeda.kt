package id.yudistiro.builderpattern.builder

import android.content.Context
import android.widget.TextView

/**
 * Created by yudistiro15 on 27/09/20
 */
class Sepeda constructor(val data:String, name:String) {

    data class Builder(val context: Context){
        private var data:String = ""
        private var nameBuilder:String =""
        private lateinit var textView: TextView
        fun setData(data2: String) =apply {
            data = data2
        }
        fun setname(name: String) = apply {
            nameBuilder = name
        }
        fun setTextView(textView: TextView) = apply {
            this.textView = textView
        }

        fun build() : Sepeda{
            textView.text = "Return ini $data $nameBuilder"
            return Sepeda(data,nameBuilder)
        }
    }
}