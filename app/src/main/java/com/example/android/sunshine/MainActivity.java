/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // completed(1) Create a field to store the weather display TextView
    TextView mWeatherDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // completed (2) Use findViewById to get a reference to the weather display TextView
        mWeatherDisplayTextView = (TextView) findViewById(R.id.tv_weather_data);

        // completed (3) Create an array of Strings that contain fake weather data
        String[] weatherData = {
                "Today, July 07 - Clear - 81°F / 57°F",
                "Tomorrow, Sunday - Sunny - 83°F / 58°F",
                "Thursday - Rainy- 30°C / 11°C", // just copy the list data from the solution file
                "Friday - Thunderstorms - 21°C / 9°C",
                "Saturday - Thunderstorms - 16°C / 7°C",
                "Sunday - Rainy - 16°C / 8°C",
                "Monday - Partly Cloudy - 15°C / 10°C",
                "Tue, July 24 - Meatballs - 16°C / 18°C",
                "Wed, July 25 - Cloudy - 19°C / 15°C",
                "Thu, July 26 - Stormy - 30°C / 11°C",
                "Fri, July 27 - Hurricane - 21°C / 9°C",
                "Sat, July 28 - Meteors - 16°C / 7°C",
                "Sun, July 29 - Apocalypse - 16°C / 8°C",
                "Mon, July 30 - Post Apocalypse - 15°C / 10°C",
        };

        // Completed (4) Append each String from the fake weather data array to the TextView
        for (String weather : weatherData){
            mWeatherDisplayTextView.append(weather + "\n\n\n");
        }
    }
}