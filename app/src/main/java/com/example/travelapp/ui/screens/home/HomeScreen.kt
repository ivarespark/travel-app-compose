package com.example.travelapp.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.travelapp.R
import com.example.travelapp.ui.theme.TravelAppTheme
import com.example.travelapp.ui.theme.containerColor
import com.example.travelapp.ui.theme.primaryColor

val horizontalPadding = 20.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = hiltViewModel()) {

    val dataList = homeViewModel.dataResult.value

    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp)
        ) {
            Text(
                modifier = Modifier.padding(horizontal = horizontalPadding),
                text = stringResource(id = R.string.home_title_text),
                style = MaterialTheme.typography.headlineSmall,
                fontSize = 28.sp
            )

            Spacer(modifier = Modifier.size(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(containerColor),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_airplane_24),
                        contentDescription = "Fly",
                        tint = primaryColor
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.LightGray.copy(alpha = 0.6f)),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_car_24),
                        contentDescription = "Travel",
                        tint = Color.Gray
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.LightGray.copy(alpha = 0.6f)),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_beach_24),
                        contentDescription = "Beach"
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.LightGray.copy(alpha = 0.6f)),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_hotel_24),
                        contentDescription = "Hotel"
                    )
                }
            }

            Spacer(modifier = Modifier.size(10.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = horizontalPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Mejores destinos",
                        style = MaterialTheme.typography.titleLarge
                    )
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Ver todo", color = primaryColor)
                    }


                }
            }
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    TravelAppTheme {
        HomeScreen()
    }
}
