package br.com.meunegocio.api_meu_negocio.controller

import br.com.meunegocio.api_meu_negocio.services.ClientServices
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ClientVo
import br.com.meunegocio.api_meu_negocio.mapper.DozerMapper
import br.com.meunegocio.api_meu_negocio.model.Client
import br.com.meunegocio.api_meu_negocio.model.Product
import jakarta.websocket.server.PathParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/client/v1")
class ClientController {
    @Autowired
    private lateinit var services: ClientServices

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long): ClientVo {
        return services.findById(id)
    }
    @PostMapping
    fun insert(@RequestBody clientVo: ClientVo): ClientVo {
        return services.insert(clientVo)
    }


}
