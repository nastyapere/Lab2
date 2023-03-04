package com.raywenderlich.android.lab1.screens

import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import java.lang.reflect.Modifier

@Composable
fun BowScreen(){
    MyBox()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyBox(
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.one),
            fontSize = 22.sp,
            modifier = contentModifier.align(Layout.Alignment.TopStart)
        )

        Text(
            text = stringResource(id = R.string.two),
            fontSize = 22.sp,
            modifier = contentModifier.align(Layout.Alignment.BottomEnd)
        )
    }
}