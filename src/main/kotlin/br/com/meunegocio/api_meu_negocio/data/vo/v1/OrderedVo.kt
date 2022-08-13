package br.com.meunegocio.api_meu_negocio.data.vo.v1

import com.github.dozermapper.core.Mapping
import java.util.*
import kotlin.collections.ArrayList


data class OrderedVo(
    @Mapping("id")
    var key: Long = 0,
    var clientId : Long = 0,
    var listProtuct: ArrayList<ProductVo> = ArrayList(),
    var date: String = "",
)
