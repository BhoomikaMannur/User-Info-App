package com.example.myapplication.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.ui.theme.Primary

@Composable
fun HomePage(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color= Primary)
    ) {
        Column {
            NameCard()
            BranchDetails()
            DetailedInfo()
            Lang(
                navController
            )
            ContactBox ()
        }
    }
}

@Composable
fun NameCard(
    name: String = "Bhoomika"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(26.dp)
    ) {
        Column (
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "$name",
                color = Color.Black,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(text = "IIIT Dharwad",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        //Spacer
        Spacer(modifier = Modifier.width(20.dp))

        //    Component Two in row
        Image(painter = painterResource(id = R.drawable.img), contentDescription = "Profile Image",
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun BranchDetails()
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFFD339E0).copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "CSE 1st Year",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
            Text(
                text = "23BCS030",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                modifier = Modifier.padding(start = 3.dp)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Cyan)
//                .padding(2.dp)
        ) {
            Icon(
                Icons.Default.Info,
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Composable
fun BasicNewCard()
{
//      This is basic Component with predefined height
    Row (
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF00FF00).copy(0.8f))

            .fillMaxWidth()
            .height(300.dp)
    ){

    }
}