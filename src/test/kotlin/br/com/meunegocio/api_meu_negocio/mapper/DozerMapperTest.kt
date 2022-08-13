package br.com.meunegocio.api_meu_negocio.mapper

import br.com.meunegocio.api_meu_negocio.mapper.mocks.MocksClient
import br.com.meunegocio.api_meu_negocio.data.vo.v1.ClientVo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DozerMapperTest {

   var mockClient: MocksClient? = null

    @BeforeEach
    fun setUp() {
        mockClient = MocksClient()
    }

    @Test
    fun parseObject() {
        val client = DozerMapper.parseObject(mockClient!!.mockClient(), ClientVo::class.java)

        assertEquals(0, client.id)
        assertEquals("my name ${0}", client.name)
        assertEquals("my address ${0}", client.address)
        assertEquals("my phone ${0}", client.phone)
    }

    @Test
    fun parseListObject() {
    }
}
