package br.com.meunegocio.api_meu_negocio.controller

import br.com.meunegocio.api_meu_negocio.services.OrderedServices
import br.com.meunegocio.api_meu_negocio.data.vo.v1.OrderedVo
import br.com.meunegocio.api_meu_negocio.mapper.DozerMapper
import br.com.meunegocio.api_meu_negocio.model.Client
import br.com.meunegocio.api_meu_negocio.model.Product
import br.com.meunegocio.api_meu_negocio.services.ClientServices
import jakarta.websocket.server.PathParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order/v1")
class OrderedController {

    @Autowired
    private lateinit var services: OrderedServices
    @Autowired
    private lateinit var clientServices: ClientServices

    @PostMapping("/{clientId}")
    fun insert(@RequestBody listProduct: ArrayList<Product>, @PathParam("clientId") id: Long): OrderedVo {
        val client = clientServices.findById(id)
         return services.newOrder(DozerMapper.parseObject(client, Client::class.java), listProduct)

    }

}
