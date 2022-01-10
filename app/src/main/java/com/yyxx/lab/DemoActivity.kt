package com.yyxx.lab

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp), onClick = {
            Toast.makeText(context, "测试Toast", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "哈哈")
        }
    }
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