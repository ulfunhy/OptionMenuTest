package kr.hs.emirim.s2233.optionmenutest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색과 버튼 변경"
        linear = findViewById(R.id.linear)
        btn = findViewById(R.id.btn)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.itemRed -> {
                linear.setBackgroundColor(Color.RED)
                return true;// 정상적인 실행이 되었으므로 true를 리턴
            }

            R.id.itemBlue -> {
                linear.setBackgroundColor(Color.BLUE)
                return true;// 정상적인 실행이 되었으므로 true를 리턴
            }

            R.id.itemMagenta -> {
                linear.setBackgroundColor(Color.MAGENTA)
                return true;// 정상적인 실행이 되었으므로 true를 리턴
            }

            R.id.subRotate -> {
                btn.rotation += 45f
                return true
            }

            R.id.minusSize -> {
                btn.scaleX -= 2f
                return true
            }

            R.id.SubSize -> {
                btn.scaleX += 2f// 2배
                return true
            }

            R.id.subInit -> {
                btn.scaleX = 1f
                btn.rotation = 0f
                return true
            }
        }
        return false;// 항목이 아닌 부분을 클릭했을 때 실행이 되지 않기 위함
    }
}