package com.L0KODOM.candles.models

enum class FraganceType(val categoryName: String, val fragances: List<String>) {
    VITALIDAD("Vitalidad", listOf("Cipress","Uva","helicriso")),
    ACOGEDOR("Acogedor", listOf("Eucalipto","Limon","Menta")),
    REFRESCANTE("Refrescante", listOf("Clary Sage","Uva Intensa","Mandarina")),
    FLORAL("Floral", listOf("Lavanda","Arbol de té","Geranio")),
    PAZ_INTERIOR("Paz interior", listOf("Cipress","Uva","helicriso")),
    DULCE("Dulce", listOf("Cipress","Uva","helicriso")),
    ROMANCE("Romance", listOf("Cipress","Uva","helicriso")),
    CONCENTRACION("Concentración", listOf("Cipress","Uva","helicriso")),
    AIRE_FRESCO("Aire Fresco", listOf("Cipress","Uva","helicriso")),
    NOCTURNO("Nocturno", listOf("Cipress","Uva","helicriso")),
    RESPIRACION_LIMPIA("Respiracion Limpia", listOf("Cipress","Uva","helicriso")),
    ENERGETICO("Energético", listOf("Cipress","Uva","helicriso")),
    OCEANICO("Oceánico", listOf("Cipress","Uva","helicriso")),
    FELICIDAD("Felicidad", listOf("Cipress","Uva","helicriso"));
    
    fun getValueList():List<String>{
        return fragances
    }

}