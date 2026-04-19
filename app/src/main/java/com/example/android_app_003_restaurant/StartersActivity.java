package com.example.android_app_003_restaurant;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

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

        Dish[] dishes = {
                new Dish("Trout and scallop dumplings",
                        "Thin pastry cases stuffed with smoked trout and scallop",
                        "flour | water | salt | sugar | trout | scallop",
                        12),
                new Dish("Sausage and garam masala gyoza",
                        "Thin pastry cases stuffed with chunky sausage and garam masala",
                        "flour | water | salt | onions | sausage | garam masala",
                        11),
                new Dish("Jalapeno and chilli gyoza",
                        "Thin pastry cases stuffed with fresh jalapeno and habanero chilli",
                        "flour | water | salt | onions | jalapeno | chilli",
                        10),
                new Dish("Trout and feta soup",
                        "Smoked trout and tangy feta combined into smooth soup",
                        "onion | trout | feta",
                        13),
                new Dish("Horseradish and aubergine gyoza",
                        "Thin pastry cases stuffed with fresh horseradish and salted aubergine",
                        "flour | water | salt | onions | horseradish | aubergine",
                        12),
                new Dish("Pheasant and trout gyoza",
                        "Thin pastry cases stuffed with pheasant and freshly-caught trout",
                        "flour | water | salt | onions | pheasant | trout",
                        10),
                new Dish("Garam masala and cabbage wontons",
                        "Thin wonton cases stuffed with garam masala and chinese cabbage",
                        "flour | water | salt | onions | garam masala | cabbage",
                        8),
                new Dish("Mustard and garlic soup",
                        "Dried mustard and fresh garlic combined into chunky soup",
                        "garlic | mustard",
                        13),
                new Dish("Fish and rosemary parcels",
                        "Thin filo pastry cases stuffed with fish and fresh rosemary",
                        "flour | water | salt | onions | fish | rosemary",
                        11),
                new Dish("Parsley and onion soup",
                        "Fresh parsley and caramalised onion combined into chunky soup",
                        "onion | parsley",
                        10),
                new Dish("Avocado and egg maki",
                        "Toasted seaweed wrapped around sushi rice, filled with fresh avocado and free range eggs",
                        "rice | rice vinegar | sugar | avocado | egg",
                        12),
                new Dish("Cod and pesto dumplings",
                        "Thin pastry cases stuffed with fresh cod and green pesto",
                        "flour | water | salt | onions | cod | pesto",
                        13),
                new Dish("Kale and cheese soup",
                        "Fresh kale and mature cheese combined into smooth soup",
                        "onion | kale | cheese",
                        20),
                new Dish("Ricotta and sausage dumplings",
                        "Thin pastry cases stuffed with ricotta and spicy sausage",
                        "flour | water | salt | onions | ricotta | sausage",
                        25),
                new Dish("Leek and aubergine dumplings",
                        "Thin pastry cases stuffed with fresh leek and marinaded aubergine",
                        "flour | water | salt | onions | leek | aubergine",
                        12),
                new Dish("Swede and beetroot soup",
                        "Swede and fresh beetroot combined into creamy soup",
                        "onion | swede | beetroot | cream",
                        14),
                new Dish("Crab and tofu wontons",
                        "Thin wonton cases stuffed with crab and silken tofu",
                        "flour | water | salt | onions | crab | tofu",
                        15),
                new Dish("Artichoke and wine soup",
                        "Fresh artichoke and red wine combined into creamy soup",
                        "onion | artichoke | wine | cream",
                        17),
                new Dish("Tofu and rosemary gyoza",
                        "Thin pastry cases stuffed with silken tofu and dried rosemary",
                        "flour | water | salt | onions | tofu | rosemary",
                        8),
                new Dish("Sprout and tomato soup",
                        "Fresh sprout and baby plum tomatoes combined into smooth soup",
                        "onion | sprout | tomato",
                        9)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}

