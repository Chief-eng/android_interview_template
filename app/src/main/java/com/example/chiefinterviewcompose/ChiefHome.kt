package com.example.chiefinterviewcompose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

@Composable
fun ChiefHomeContent() {
    val chiefs = remember { DataProvider.chiefList }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
            items(
                items = chiefs,
                itemContent = {
                    ChiefListItem(chief = it)
                })
    }
}

