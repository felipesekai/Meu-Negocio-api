package br.com.meunegocio.api_meu_negocio.repository

import br.com.meunegocio.api_meu_negocio.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client, Long?>
