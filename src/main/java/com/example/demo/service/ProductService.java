package com.example.demo.service;

import com.example.demo.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    List<Product> findAll(Sort sort);

    List<Product> findAllById(Iterable<Long> longs);

    <S extends Product> List<S> saveAll(Iterable<S> entities);

    Page<Product> findAll(Pageable pageable);

    <S extends Product> S save(S entity);

    Optional<Product> findById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Product entity);

    void deleteAll();
}
