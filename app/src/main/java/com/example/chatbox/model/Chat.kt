package com.example.chatbox.model

import androidx.compose.ui.graphics.Color


data class Chat(val  name : String,val lastMessage: String,val timeStamp : String,val unreadCount:Int,val avatarColor : Color){


}