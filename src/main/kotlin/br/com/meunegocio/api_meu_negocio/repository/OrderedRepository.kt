package br.com.meunegocio.api_meu_negocio.repository

import br.com.meunegocio.api_meu_negocio.model.Ordered
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderedRepository : JpaRepository<Ordered, Long?>
