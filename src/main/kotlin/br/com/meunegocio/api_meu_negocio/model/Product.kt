package br.com.meunegocio.api_meu_negocio.model

import jakarta.persistence.*
@Entity
@Table(name= "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long = 0,
    @Column(nullable = false, length = 50)
    var name : String = "",
    @Column(nullable = false)
    var quantity : Int = 0,
    @Column(nullable = false)
    var value : Double = 0.0,
    @ManyToOne
    private var ordered: Ordered?  = null
)
