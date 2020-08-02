package com.furqaan.restapi.rest;

import com.furqaan.restapi.model.Produk;
import com.furqaan.restapi.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produk")
public class ProdukController {
    private ProdukService produkService;

    @Autowired
    public ProdukController(ProdukService produkService) {
        this.produkService = produkService;
    }

    @GetMapping
    public ResponseEntity<List<Produk>> get(){
        return new ResponseEntity<>(produkService.show(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produk> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(produkService.showById(id), HttpStatus.OK);
    }

    @PostMapping
    public String add(@RequestBody Produk produk){
        produkService.store(produk);
        return "Produk Save Succesfull";
    }

    @PutMapping
    public ResponseEntity<Produk> update(@RequestBody Produk produk){
        return new ResponseEntity<>(produkService.update(produk), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") Long id){
        produkService.destroy(id);
        return "Produk Delete Succesfull";
    }
}
