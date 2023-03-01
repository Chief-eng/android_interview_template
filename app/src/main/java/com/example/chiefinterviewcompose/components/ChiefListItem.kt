package com.example.chiefinterviewcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.chiefinterviewcompose.data.Chief

@Composable
fun ChiefListItem(chief: Chief) {
    Row {
        Column {
            Text(text = chief.title, style = typography.h6)
            Text(text = "VIEW DETAIL", style = typography.caption)
        }
    }
}