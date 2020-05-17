package com.ankitangra.www.recipies.ui.recipelist

import android.os.Bundle
import com.ankitangra.www.recipies.R
import com.ankitangra.www.recipies.BaseActivity
import kotlinx.android.synthetic.main.recipe_list_activity.*

class RecipeListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_list_activity)

        button.setOnClickListener() {
            showProgressDialog()
        }
    }

}