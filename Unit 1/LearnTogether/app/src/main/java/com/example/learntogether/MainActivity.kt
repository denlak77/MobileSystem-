package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTutorialScreen()
                }
            }
        }
    }
}

@Composable
fun LearnTogetherTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}

@Composable
fun ComposeTutorialScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Изображение, заполняющее всю ширину экрана
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background), // Замените на ваш ID ресурса
            contentDescription = stringResource(R.string.jetpack_compose_title),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        // Первый Text - заголовок с размером шрифта 24sp и отступами 16dp со всех сторон
        Text(
            text = stringResource(R.string.jetpack_compose_title),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineMedium
        )

        // Второй Text - подзаголовок с выравниванием Justify и отступами по бокам
        Text(
            text = stringResource(R.string.jetpack_compose_subtitle),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyLarge
        )

        // Пространство между подзаголовком и основным текстом
        Spacer(modifier = Modifier.height(8.dp))

        // Третий Text - основной текст с выравниванием Justify и отступами со всех сторон
        Text(
            text = stringResource(R.string.jetpack_compose_body),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeTutorialScreenPreview() {
    LearnTogetherTheme {
        ComposeTutorialScreen()
    }
}