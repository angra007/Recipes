package com.ankitangra.www.recipies

import android.app.ProgressDialog
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var textViewScreenTitle: TextView
    private lateinit var imageButtonBack: ImageButton
    private lateinit var progressDialog: ProgressDialog

    override fun setContentView(layoutResID: Int) {
        var coordinatorLayout: CoordinatorLayout = layoutInflater.inflate(R.layout.base_activity, null) as CoordinatorLayout
        var activityContainer: FrameLayout = coordinatorLayout.findViewById(R.id.layout_container)
        textViewScreenTitle = coordinatorLayout.findViewById(R.id.text_screen_title) as TextView
        imageButtonBack = coordinatorLayout.findViewById(R.id.image_back_button)
        layoutInflater.inflate(layoutResID, activityContainer, true)
        super.setContentView(coordinatorLayout)
    }

    fun setScreenTitle(resId: Int) {
        textViewScreenTitle.text = getString(resId)
    }

    fun setScreenTitle(title: String) {
        textViewScreenTitle.text = title
    }

    fun getBackButton(): ImageButton {
        return imageButtonBack;
    }

    fun showProgressDialog() {
        if(!progressDialog.isShowing) {
            progressDialog.show()
        }
    }

    fun dismissProgressDialog() {
        if (progressDialog.isShowing) {
            progressDialog.dismiss()
        }
    }

}