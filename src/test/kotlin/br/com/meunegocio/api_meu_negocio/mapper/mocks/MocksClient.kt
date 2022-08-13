package br.com.meunegocio.api_meu_negocio.mapper.mocks

import br.com.meunegocio.api_meu_negocio.model.Client
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ClientVo

class MocksClient {

    fun mockClient() = mockClient(0)

    fun mockClientVo() = mockClientVo(0)

    fun mockClient(id: Long): Client {
        val client = Client()
        client.apply {
            this.id = id
            name = "my name $id"
            address = "my address $id"
            phone = "my phone $id"
        }
        return client
    }

    fun mockClientVo(id: Long): ClientVo {
        val client = ClientVo()
        client.apply {
            this.id = id
            name = "my name $id"
            address = "my address $id"
            phone = "my phone $id"
        }
        return client
    }

}
