package com.raywenderlich.android.lab1.screens

import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import java.lang.reflect.Modifier

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier){

    Box(modifier = modifier.fillMaxHeight()) {
        MySurface(modifier = modifier.align(Layout.Alignment.Center))
    }

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MySurface(modifier: Modifier) {
    Surface(
        modifier = modifier.size(100.dp),
        color = Color.LightGray,
        contentColor = colorResource(id = R.color.colorPrimary),
        elevation = 1.dp,
        border = BorderStroke(1.dp, Color.Black)
    ){
        MyColumn()
    }
}