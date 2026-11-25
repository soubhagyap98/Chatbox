package com.example.chatbox.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.chatbox.ui.theme.PrimaryGreen
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(){

    Box(modifier = Modifier.fillMaxSize()){

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Box(modifier = Modifier
                .size(110.dp)
                .clip(CircleShape)
                .background(color = PrimaryGreen),
                contentAlignment = Alignment.Center){
                Icon(Icons.Filled.Whatsapp, contentDescription = "Chatbox logo",tint = Color.White, modifier = Modifier.size(55.dp))

            }
            Text(text = "Chatbox", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = PrimaryGreen, modifier = Modifier.padding(top = 16.dp))
            Text(text = "Stay Connected,Stay Close.", fontSize = 14.sp,color= Color.Gray, modifier = Modifier.padding(top=8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    SplashScreen()
}

