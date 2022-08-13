package br.com.meunegocio.api_meu_negocio.services

import br.com.meunegocio.api_meu_negocio.mapper.DozerMapper
import br.com.meunegocio.api_meu_negocio.model.Product
import br.com.meunegocio.api_meu_negocio.repository.ProductRepository
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ProductVo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class ProductServices {
    @Autowired
    private lateinit var repository : ProductRepository

    private val logger: Logger = Logger.getLogger(ProductServices::class.java.name)

    fun insert(productVo : ProductVo): ProductVo {
        logger.info("insert product!!!")
        val product = DozerMapper.parseObject(productVo, Product::class.java)
        return DozerMapper.parseObject(repository.save(product), ProductVo::class.java)
    }


}
