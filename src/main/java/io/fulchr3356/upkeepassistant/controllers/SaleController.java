package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Sale;
import io.fulchr3356.upkeepassistant.repositories.SaleRepository;

import java.util.Optional;

public class SaleController implements  ControllerInterface<Sale> {
    private final SaleRepository saleRepository;

    public SaleController(SaleRepository saleRepository){
        this.saleRepository = saleRepository;
    }
    @Override
    public Optional<Sale> findById(Integer id) {
        return saleRepository.findById(id);
    }

    @Override
    public Iterable<Sale> findAll() {
        return saleRepository.findAll();
    }

    @Override
    public void update(Sale sale) {
        //TODO add build sale
        saleRepository.save(sale);
    }

    @Override
    public void add(Sale sale) {
        saleRepository.save(sale);
    }

    @Override
    public void delete(Integer id) {
        saleRepository.deleteById(id);
    }
}
