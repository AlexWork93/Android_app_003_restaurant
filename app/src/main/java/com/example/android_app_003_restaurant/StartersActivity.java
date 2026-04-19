 package com.example.android_app_003_restaurant;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartersActivity extends AppCompatActivity {

    ListView startersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_starters);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        startersList = findViewById(R.id.list_view_starters);

        String[] starterNames = {
                "Trout and scallop dumplings",
                "Sausage and garam masala gyoza",
                "Jalapeno and chilli gyoza",
                "Trout and feta soup",
                "Horseradish and aubergine gyoza",
                "Pheasant and trout gyoza",
                "Garam masala and cabbage wontons",
                "Mustard and garlic soup",
                "Fish and rosemary parcels",
                "Parsley and onion soup",
                "Avocado and egg maki",
                "Cod and pesto dumplings",
                "Kale and cheese soup",
                "Ricotta and sausage dumplings",
                "Leek and aubergine dumplings",
                "Swede and beetroot soup",
                "Crab and tofu wontons",
                "Artichoke and wine soup",
                "Tofu and rosemary gyoza",
                "Sprout and tomato soup"
        };

        String[] starterDescriptions = {
                "Thin pastry cases stuffed with smoked trout and scallop",
                "Thin pastry cases stuffed with chunky sausage and garam masala",
                "Thin pastry cases stuffed with fresh jalapeno and habanero chilli",
                "Smoked trout and tangy feta combined into smooth soup",
                "Thin pastry cases stuffed with fresh horseradish and salted aubergine",
                "Thin pastry cases stuffed with pheasant and freshly-caught trout",
                "Thin wonton cases stuffed with garam masala and chinese cabbage",
                "Dried mustard and fresh garlic combined into chunky soup",
                "Thin filo pastry cases stuffed with fish and fresh rosemary",
                "Fresh parsley and caramalised onion combined into chunky soup",
                "Toasted seaweed wrapped around sushi rice, filled with fresh avocado and free range eggs",
                "Thin pastry cases stuffed with fresh cod and green pesto",
                "Fresh kale and mature cheese combined into smooth soup",
                "Thin pastry cases stuffed with ricotta and spicy sausage",
                "Thin pastry cases stuffed with fresh leek and marinaded aubergine",
                "Swede and fresh beetroot combined into creamy soup",
                "Thin wonton cases stuffed with crab and silken tofu",
                "Fresh artichoke and red wine combined into creamy soup",
                "Thin pastry cases stuffed with silken tofu and dried rosemary",
                "Fresh sprout and baby plum tomatoes combined into smooth soup"
        };

        String[] starterIngredients = {
                "flour | water | salt | sugar | trout | scallop",
                "flour | water | salt | onions | sausage | garam masala",
                "flour | water | salt | onions | jalapeno | chilli",
                "onion | trout | feta",
                "flour | water | salt | onions | horseradish | aubergine",
                "flour | water | salt | onions | pheasant | trout",
                "flour | water | salt | onions | garam masala | cabbage",
                "garlic | mustard",
                "flour | water | salt | onions | fish | rosemary",
                "onion | parsley",
                "rice | rice vinegar | sugar | avocado | egg",
                "flour | water | salt | onions | cod | pesto",
                "onion | kale | cheese",
                "flour | water | salt | onions | ricotta | sausage",
                "flour | water | salt | onions | leek | aubergine",
                "onion | swede | beetroot | cream",
                "flour | water | salt | onions | crab | tofu",
                "onion | artichoke | wine | cream",
                "flour | water | salt | onions | tofu | rosemary",
                "onion | sprout | tomato"
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, starterNames);
        startersList.setAdapter(dishesAdapter);
    }
}

