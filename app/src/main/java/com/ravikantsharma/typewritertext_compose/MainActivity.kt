package com.ravikantsharma.typewritertext_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ravikantsharma.typewritertext_compose.ui.theme.TypewriterTextComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TypewriterTextComposeTheme {

            }
        }
    }
}