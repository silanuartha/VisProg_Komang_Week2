package com.example.komangvisprogweek2

import android.graphics.Color.blue
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal1View() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF87CEFA))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.down),
                contentDescription = "Down Logo",
                modifier = Modifier.size(25.dp)
            )
            Text(
                text = "Liked Songs",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Image(
                painter = painterResource(id = R.drawable.more),
                contentDescription = "More Logo",
                modifier = Modifier.size(25.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.cover_album),
            contentDescription = "Album Cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(14.dp))
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Hold On, We're Going Home",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "Drake",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = "Like Button",
                modifier = Modifier.size(35.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(horizontal = 28.dp)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "0:02", fontSize = 14.sp, color = Color.Black)
                Text(text = "-3:36", fontSize = 14.sp, color = Color.Black)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.prev),
                contentDescription = "Previous Button",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.play),
                contentDescription = "Play Button",
                modifier = Modifier.size(80.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "Next Button",
                modifier = Modifier.size(40.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

       Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                .background(Color(0xFF2980B9))
                .verticalScroll(rememberScrollState())
                .padding(30.dp)
        ) {
            Text(
                text = "Lyrics",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            Text(
                text = """
                    I got my eyes on you
                    You're everything that I see
                    I want your hot love and emotion, endlessly
                    I can't get over you
                    You left your mark on me
                    I want your high love and emotion, endlessly
                    'Cause you're a good girl and you know it
                    You act so different around me
                    'Cause you're a good girl and you know it
                    I know exactly who you could be
                    Just hold on, we're going home
                    Just hold on, we're going home
                    It's hard to do these things alone
                    Just hold on, we're going home, ho-oh-oh
                    I got my eyes on you
                    You're everything that I see
                    I want your hot love and emotion, endlessly
                    I can't get over you
                    You left your mark on me
                    I want your high love and emotion, endlessly
                """.trimIndent(),
                fontSize = 16.sp,
                color = Color.White,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSoal1View() {
    Soal1View()
}