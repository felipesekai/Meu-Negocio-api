package br.com.meunegocio.api_meu_negocio.data.vo.v1

import br.com.meunegocio.api_meu_negocio.model.Ordered

data class ClientVo(
    var id : Long = 0,
    var name : String = "",
    var address : String? = "",
    var phone : String = "",
    var orders: ArrayList<Ordered>? = null
)
