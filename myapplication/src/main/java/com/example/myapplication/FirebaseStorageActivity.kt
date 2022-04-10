package com.example.myapplication

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.util.Log
import com.google.firebase.storage.FirebaseStorage


class FirebaseStorageActivity {
    private val TAG = "FirebaseStorageActivity"

    private val mStorageRef = FirebaseStorage.getInstance().reference
    private lateinit var mProgressDialog : ProgressDialog

    /*
     * Uploading the image
     * Parameter is the Image URI (This is like it's address)
      */
    fun uploadImage(mContext: Context, imageURI: Uri) {
        mProgressDialog = ProgressDialog(mContext)
        mProgressDialog.setMessage("Please wait, image being uploaded...")
        val imageFileName = "users/profilePic${System.currentTimeMillis()}.png"
        //Uploading Image, Taking in its Uri
        val uploadTask = mStorageRef.child( "users/profilePic.png").putFile(imageURI)

        //Image Upload Success
        //Image Upload Failed
        uploadTask.addOnSuccessListener {
            Log.e(TAG, "Success")
        }.addOnFailureListener {
            Log.e(TAG, "Image Failed to Upload ${it.printStackTrace()}")
        }
    }

}