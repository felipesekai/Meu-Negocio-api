package br.com.meunegocio.api_meu_negocio.mapper

import com.github.dozermapper.core.DozerBeanMapperBuilder
import com.github.dozermapper.core.Mapper



object DozerMapper {
    private val mapper : Mapper = DozerBeanMapperBuilder.buildDefault()

    fun <O,D> parseObject(origin: O, destination: Class<D>?): D{
        return mapper.map(origin,destination)
    }
    fun <O,D> parseListObject(origin: List<O>, destination: Class<D>?): ArrayList<D>{
        val destinationObjetct : ArrayList<D> = arrayListOf()
        for (o in origin){
            destinationObjetct.add(mapper.map(o,destination))
        }

        return destinationObjetct
    }


}
