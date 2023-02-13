package com.example.stickyheadyt

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stickyheadyt.ui.theme.StickyHeadYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            DrawContent(
                content = listOf(
                    Content('a', listOf("aa", "atif", "asafar", "amir", "amola", "ajera")),
                    Content('b', listOf("bb", "bhai", "bhaijan", "bhaiji", "bhera", "bhoja")),
                    Content(
                        'c',
                        listOf("cc", "chutiya", "chaman", "chamkadal", "chalak", "chayan")
                    ),
                    Content('a', listOf("aa", "atif", "asafar", "amir", "amola", "ajera")),
                    Content('b', listOf("bb", "bhai", "bhaijan", "bhaiji", "bhera", "bhoja")),
                    Content(
                        'c',
                        listOf("cc", "chutiya", "chaman", "chamkadal", "chalak", "chayan")
                    ),
                    Content('a', listOf("aa", "atif", "asafar", "amir", "amola", "ajera")),
                    Content('b', listOf("bb", "bhai", "bhaijan", "bhaiji", "bhera", "bhoja")),
                    Content(
                        'c',
                        listOf("cc", "chutiya", "chaman", "chamkadal", "chalak", "chayan")
                    ),
                )
            )

        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DrawContent(content: List<Content>) {

    LazyColumn(modifier = Modifier.fillMaxSize()) {

        content.map {
            stickyHeader {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Red)
                ) {
                    Text(text = it.char.toString(), color = Color.White)
                }
            }
            items(it.list) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Green)
                ) {
                    Text(text = it)
                }
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

    }

}

data class Content(
    val char: Char,
    val list: List<String>
)