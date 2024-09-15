package com.cobu.tarus

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    var prompt by rememberSaveable { mutableStateOf(String()) }
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) { Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")
                TextField(value = prompt,  onValueChange = {
                    prompt = it
                } , label = { Text(text = stringResource(id = R.string.label_prompt))
                },
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                    )
                    );
                ElevatedButton(onClick = { /*TODO*/ }, elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 20.dp,
                    pressedElevation = 5.dp,
                    disabledElevation = 0.dp
                ), modifier = Modifier.size(width = 300.dp, height = 50.dp)) {
                    Icon(imageVector = Icons.Filled.Send, contentDescription = "Enter Button",
                        modifier = Modifier.size(size = 500.dp))
                }
            }
        },
        topBar = {

            TopAppBar(title = { Text("Tarus")}, navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            } )
        }
    ) {
        paddingValues  -> Text(text = "Content goes here", modifier = Modifier.padding(paddingValues))
    }
}