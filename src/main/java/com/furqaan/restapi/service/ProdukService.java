package com.furqaan.restapi.service;

import com.furqaan.restapi.model.Produk;
import com.furqaan.restapi.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdukService {
    private ProdukRepository produkRepository;

    @Autowired
    public ProdukService(ProdukRepository produkRepository) {
        this.produkRepository = produkRepository;
    }

    public List<Produk> show(){
        List<Produk> produks = new ArrayList<>();
        produkRepository.findAll().iterator().forEachRemaining(produks::add);
        return produks;
    }

    public Produk showById(Long id){
        return produkRepository.findById(id).get();
    }

    public void store(Produk produk){
        produkRepository.save(produk);
    }

    public Produk update(Produk produk){
        produk.getId();
        return produkRepository.save(produk);
    }

    public void destroy(Long id){
        produkRepository.deleteById(id);
    }
}
