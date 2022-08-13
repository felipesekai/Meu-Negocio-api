package br.com.meunegocio.api_meu_negocio.services

import br.com.meunegocio.api_meu_negocio.mapper.DozerMapper
import br.com.meunegocio.api_meu_negocio.model.Client
import br.com.meunegocio.api_meu_negocio.repository.ClientRepository
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ClientVo
import br.com.meunegocio.api_meu_negocio.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class ClientServices {
    @Autowired
    private lateinit var clientRepository: ClientRepository

    private val logger : Logger = Logger.getLogger(ClientServices::class.java.name)

    fun insert(client: ClientVo) : ClientVo {
        logger.info("insert client!!!")
        val entity = DozerMapper.parseObject(client, Client::class.java)
        val clientVo = DozerMapper.parseObject(clientRepository.save(entity), ClientVo::class.java)
        return  clientVo

    }

    fun findById (id: Long): ClientVo {
        val client = clientRepository.findById(id)
        val clientVO: ClientVo = DozerMapper.parseObject(client, ClientVo::class.java)
        return clientVO
    }



}
