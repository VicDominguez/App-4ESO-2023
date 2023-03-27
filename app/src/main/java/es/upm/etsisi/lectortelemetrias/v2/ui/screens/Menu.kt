package es.upm.etsisi.lectortelemetrias.v2.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.upm.etsisi.lectortelemetrias.v2.R
import es.upm.etsisi.lectortelemetrias.v2.ui.navigation.AppRoutes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController)
{
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp))
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp,Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(stringResource(R.string.welcome_text))
            // Al pulsar el botón nos vemos a la pantalla de FilesList
            Button(onClick = { navController.navigate(AppRoutes.FilesList.route) })
            {
                Text(text = stringResource(R.string.select_file))
            }
        }
    }
}