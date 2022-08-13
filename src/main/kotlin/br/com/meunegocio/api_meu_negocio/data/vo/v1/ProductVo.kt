package br.com.meunegocio.api_meu_negocio.data.vo.v1

import com.github.dozermapper.core.Mapping


data class ProductVo(
    @Mapping("id")
    var key : Long = 0,
    var name : String = "",
    var quantity : Int = 0,
    var value : Double = 0.0,
)
