package br.com.meunegocio.api_meu_negocio.model

import jakarta.persistence.*
@Entity
@Table(name= "ordered")
data class Ordered(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @OneToMany(targetEntity = Product::class)
    @JoinTable(
        name = "order_produtcts"
    )
    var listProtuct: ArrayList<Product> = ArrayList(),

    @Column(nullable = false, length = 8)
    var date: String = "",

    @ManyToMany
    var clients: ArrayList<Client> = ArrayList<Client>()
)
