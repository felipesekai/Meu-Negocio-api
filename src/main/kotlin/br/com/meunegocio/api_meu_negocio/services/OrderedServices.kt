package br.com.meunegocio.api_meu_negocio.services

import br.com.meunegocio.api_meu_negocio.data.vo.v1.ClientVo
import br.com.meunegocio.api_meu_negocio.mapper.DozerMapper
import br.com.meunegocio.api_meu_negocio.model.Ordered
import br.com.meunegocio.api_meu_negocio.repository.OrderedRepository
import br.com.meunegocio.api_meu_negocio.data.vo.v1.OrderedVo
import br.com.meunegocio.api_meu_negocio.model.Client
import br.com.meunegocio.api_meu_negocio.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class OrderedServices {

    @Autowired
    private lateinit var orderedRepository: OrderedRepository

    private val logger = Logger.getLogger(OrderedServices::class.java.name)

    fun insert(orderedVo: OrderedVo): OrderedVo {
        logger.info("insert order!!!!")
        val order = DozerMapper.parseObject(orderedVo, Ordered::class.java)
        return DozerMapper.parseObject(orderedRepository.save(order), OrderedVo::class.java)
    }

    fun newOrder(client: Client, list: ArrayList<Product>) : OrderedVo {
        logger.info("insert order!!!")
        val order = Ordered()
        order.clients.add(client)
        order.listProtuct = list
        order.date = "12/12/12"

        val orderVo = DozerMapper.parseObject(orderedRepository.save(order), OrderedVo::class.java)
        return  orderVo
    }

}
