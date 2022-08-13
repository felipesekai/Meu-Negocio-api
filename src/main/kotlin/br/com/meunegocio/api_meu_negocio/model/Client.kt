package br.com.meunegocio.api_meu_negocio.model

import jakarta.persistence.*

@Entity
@Table(name="client")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long = 0,

    @Column(nullable = false, length = 50)
    var name : String = "",

    @Column(nullable = false, length = 50)
    var address : String? = "",

    @Column(nullable = false, length = 50)
    var phone : String = "",

    @ManyToMany
    var orders: ArrayList<Ordered>? = null
)
