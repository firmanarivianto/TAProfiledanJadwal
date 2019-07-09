package com.firman.tugasakhir.model

import com.google.gson.annotations.SerializedName

// Variable Untuk Mendefinisikan data detail jadwal dan menampilkan id yang ada di API yang sudah diberikan ke Layout

class ModelDataItem (
    val kode_jadwal: String,
    val kode_kelas: String,
    val kode_mk: String,
    val nama_dosen: String,
    val kode_dosen1: String,
    val kode_dosen2: String,
    val sks1: String,
    val nama_ruang: String,
    val hari: String,
    val waktu: String,
    val nama_mk: String,
    val nama_mki: String,
    val error: String,


    @field:SerializedName("telp")
    val telp: String,

    @field:SerializedName("nik")
    val nik: String,

    @field:SerializedName("almt")
    val almt: String,

    @field:SerializedName("dosen_wali")
    val dosenWali: String,

    @field:SerializedName("kelas")
    val kelas: String,

    @field:SerializedName("foto")
    val foto: String,

    @field:SerializedName("email")
    val email: String,

    @field:SerializedName("npm")
    val npm: String,

    @field:SerializedName("nama")
    val nama: String,

    @field:SerializedName("tlhr")
    val tlhr: String
)