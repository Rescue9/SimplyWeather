package com.corridor9design.simplyweather.ui.screens;

@Composable
fun WeatherScreen(){
    Surface(modifier = Modifier.fillMaxSize()) {
        WeatherMain()
    }
}

fun WeatherMain(){
    val isLightTheme = MaterialTheme.colors.isLight
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = Weather().date,
            style = MaterialTheme.typography.caption,
        )
        Spacer(modifier = Modifier.size(4.dp))
        Row(modifier = Modifier.wrapContentSize(), verticalAlignment = Alignment.CenterVertically){
            ReusableImage(
                image = if (isLightTheme) {
                    R.drawable.ic_location_light
                } else {
                    R.drawable.ic_location_dark
                },
                contentScale = ContentScale.Fit,
                contentDesc = "Location Icon",
                modifier = Modifier
                    .size(16.dp)
                    .padding(end = 4.dp)
            )
            Text(
                text = Weather().location,
                style = MaterialTheme.typography.body2,
            )
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .matchParentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    ReusableImage(
                        image =
                        if (isLightTheme){
                            R.drawable.ic_world_map_light
                        } else {
                            R.drawable.ic_world_map_dark
                        },
                        contentScale = ContentScale.Fit,
                        contentDesc = "Background",
                        modifier = Modifier.offset(y = (-20).dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ReusableImage(
                        image = R.drawable.ic_cloud_zappy,
                        contentScale = ContentScale.Fit,
                        contentDEsc = "Weather img",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(top = 40.dp, bottom = 20.dp)
                    )
                    Text(text = Weather().condition, style = MaterialTheme.typography.subtitle1)
                    Spacer(modifier = Modifier.size(4.dp))
                    Row(modifier = Modifier.wrapContentSize()){
                        Text(
                            text = Weather().update.first().temp,
                            style = MaterialTheme.typography.h1,
                            modifier = Modifier.ofset(y = (-24).dp)
                        )
                        ReusableImage(
                            image = R.drawable.ic_degree,
                            contentScale = ContentScale.Fit,
                            contentDesc = "Degree Icon",
                            modifier = Modifier
                        )
                    }
                    Text(
                        text = Weather().description,
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                }
            }
            //TODO: Add bottom here
            @Composable
            fun DailyWeatherItem(weatherUpdate: Weather.WeatherUpdate) {
                Card(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(4.dp),
                    elevation = 1.dp,
                    shape = MaterialTheme.shapes.small
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
                    ) {
                        ReusableImage(
                            image = when (weatherUpdate.icon) {
                                "wind" -> R.drawable.ic_moon_cloud_fast_wind
                                "rain" -> R.drawable.ic_moon_cloud_mid_rain
                               "angledRain" -> R.drawable.ic_sun_cloud_angled_rain
                                "thunder" -> R.drawable.ic_zaps
                                else -> R.drawable.ic_moon_cloud_fast_wind
                            },
                            contentScale = ContentScale.Fit,
                            contentDesc = "Weather Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .padding(bottom = 4.dp)
                        )
                        Text(
                            text = weatherUpdate.time,
                            style = MaterialTheme.typography.caption,
                            modifier = Modifier.padding(4.dp)
                        )
                        Text(
                            text = "${weatherUpdate.temp}°",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(4.dp)
                        )
                    }
                }
            }
        }
    }
}    
