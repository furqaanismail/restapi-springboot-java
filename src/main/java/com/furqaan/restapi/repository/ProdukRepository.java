package com.furqaan.restapi.repository;

import com.furqaan.restapi.model.Produk;
import org.springframework.data.repository.CrudRepository;

public interface ProdukRepository extends CrudRepository<Produk, Long> {
}
