package com.example.chatbox.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatbox.model.Chat
import com.example.chatbox.ui.theme.PrimaryGreen
import com.example.chatbox.ui.theme.SecondaryText

val chatList = listOf(
    Chat(
        name = "Anu",
        lastMessage = "Hey,How Are you?",
        timeStamp = "10:30 AM",
        unreadCount = 2,
        avatarColor =  Color.Blue
    ),
    Chat(
        name = "Banu",
        lastMessage = "How Are you?",
        timeStamp = "10:50 AM",
        unreadCount = 1,
        avatarColor = Color.Magenta
    ),
    Chat(
        name = "Sonu",
        lastMessage = "Hello",
        timeStamp = "5:30 PM",
        unreadCount = 1,
        avatarColor = Color.Yellow
    ),
    Chat(
        name = "Manu",
        lastMessage = "Where are you",
        timeStamp = "8:50 AM",
        unreadCount = 1,
        avatarColor = Color.Gray
    ),
    Chat(
        name = "Appu",
        lastMessage = "Hey,?",
        timeStamp = "10:25 AM",
        unreadCount = 1,
        avatarColor = Color.Cyan
    )
)

@Composable
fun ChatsScreen() {
    Column() {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp, vertical = 4
                    .dp
            )
            .background(color = PrimaryGreen)) {
            Text(
                text = "ChatBox",
                modifier = Modifier.weight(1.0f),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.MoreVert, contentDescription = "More", tint = Color.White)
            }
        }
        LazyColumn() {
            items(chatList) { chat->
                ChatItem(chat = chat)
                HorizontalDivider(color = Color.LightGray, thickness = 0.5.dp,modifier = Modifier.padding(start = 72.dp)

                )
                

            }
        }


    }
}

@Composable
fun ChatItem(chat: Chat, modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp,vertical = 10.dp), verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier.padding(end = 8.dp)
                .size(48.dp)
                .clip(CircleShape)
                .background(chat.avatarColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = chat.name[0].toString(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
        }
        Column(modifier.weight(2.0f)) {
            Text(text = chat.name, fontSize = 16.sp, fontWeight = FontWeight.Medium,color = Color.DarkGray)
            Text(text = chat.lastMessage, fontSize = 14.sp, color = Color.Gray, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Column(horizontalAlignment = Alignment.End) {
            Text(text = chat.timeStamp, fontSize = 12.sp, color = SecondaryText, fontWeight = FontWeight.Normal)
            if(chat.unreadCount > 0) {
                Box(
                    modifier.clip(CircleShape).size(22.dp).background(PrimaryGreen).padding(top =4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = chat.unreadCount.toString(), color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewChatsScreen(){
    ChatsScreen()
}
