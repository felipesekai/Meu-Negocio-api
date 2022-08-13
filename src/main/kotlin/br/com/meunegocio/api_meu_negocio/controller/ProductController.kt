package br.com.meunegocio.api_meu_negocio.controller

import br.com.meunegocio.api_meu_negocio.services.ProductServices
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ProductVo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product/v1")
class ProductController {

    @Autowired
    private lateinit var service: ProductServices

    @PostMapping
    fun insert(@RequestBody productVo: ProductVo): ProductVo {
        return service.insert(productVo)
    }
}
