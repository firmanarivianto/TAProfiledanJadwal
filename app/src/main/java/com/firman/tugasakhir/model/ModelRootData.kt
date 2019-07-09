package com.firman.tugasakhir.model

class ModelRootData (

    // Mengatasi eror jika nilai data item pada ModelDataItem.kt data dan idnya kosong maka akan eror
    val data: List<ModelDataItem?>? = null,
    val id: Int? = null,
    val error: String
)