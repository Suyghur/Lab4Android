package com.yyxx.lab

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yyxx.lab.ui.theme.Lab4AndroidTheme

/**
 * @author #Suyghur.
 * Created on 2022/01/10
 */
class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4AndroidTheme {
                Surface(color = MaterialTheme.colors.background) {
                    DemoPage()
                }
            }
        }
    }
}

@Composable
fun DemoPage() {
    Text(text = "哈哈")
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    Lab4AndroidTheme {
        Surface(color = MaterialTheme.colors.background) {
            DemoPage()
        }
    }
}