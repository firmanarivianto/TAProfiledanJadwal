package com.firman.tugasakhir.model

import com.google.gson.annotations.SerializedName

// Variable Untuk Mendefinisikan data pofile dan menampilkan id yang ada di API yang sudah diberikan ke Layout

class ModelDataDiri(

    @field:SerializedName("nik")
    val nik: String? = null,

    @field:SerializedName("almt")
    val almt: String? = null,

    @field:SerializedName("tlhr")
    val tlhr: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("telp")
    val telp: String? = null,

    @field:SerializedName("dosen_wali")
    val dosenWali: String? = null,

    @field:SerializedName("kelas")
    val kelas: String? = null


)