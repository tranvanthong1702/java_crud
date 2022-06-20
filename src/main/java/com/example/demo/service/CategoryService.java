package com.example.demo.service;

import com.example.demo.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findByNameContaining(String name);

    Page<Category> findByNameContaining(String name, Pageable pageable);

    abstract List<Category> findAll();

    abstract List<Category> findAll(Sort sort);

    abstract List<Category> findAllById(Iterable<Long> longs);

    abstract <S extends Category> List<S> saveAll(Iterable<S> entities);

    abstract void flush();

    abstract <S extends Category> S saveAndFlush(S entity);

    abstract <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities);

    abstract void deleteAllInBatch(Iterable<Category> entities);

    abstract void deleteAllByIdInBatch(Iterable<Long> longs);

    abstract void deleteAllInBatch();

    abstract Category getReferenceById(Long aLong);

    abstract Page<Category> findAll(Pageable pageable);

    abstract <S extends Category> S save(S entity);

    abstract Optional<Category> findById(Long aLong);

    abstract boolean existsById(Long aLong);

    abstract long count();

    abstract void deleteById(Long aLong);

    abstract void delete(Category entity);

    abstract void deleteAllById(Iterable<? extends Long> longs);

    abstract void deleteAll(Iterable<? extends Category> entities);

    abstract void deleteAll();
}
