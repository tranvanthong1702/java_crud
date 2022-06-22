package com.example.demo.service.impl;

import com.example.demo.domain.Category;
import com.example.demo.repository.CategoryRespository;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRespository categoryRespository;

    public CategoryServiceImpl(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }

    @Override
    public List<Category> findByNameContaining(String name) {
        return categoryRespository.findByNameContaining(name);
    }

    @Override
    public Page<Category> findByNameContaining(String name, Pageable pageable) {
        return categoryRespository.findByNameContaining(name, pageable);
    }

    @Override
    public List<Category> findAll() {
        return categoryRespository.findAll();
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return categoryRespository.findAll(sort);
    }

    @Override
    public List<Category> findAllById(Iterable<Long> longs) {
        return categoryRespository.findAllById(longs);
    }

    @Override
    public <S extends Category> List<S> saveAll(Iterable<S> entities) {
        return categoryRespository.saveAll(entities);
    }

    @Override
    public void flush() {
        categoryRespository.flush();
    }

    @Override
    public <S extends Category> S saveAndFlush(S entity) {
        return categoryRespository.saveAndFlush(entity);
    }

    @Override
    public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
        return categoryRespository.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Category> entities) {
        categoryRespository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        categoryRespository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        categoryRespository.deleteAllInBatch();
    }

    @Override
    public Category getReferenceById(Long aLong) {
        return categoryRespository.getReferenceById(aLong);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRespository.findAll(pageable);
    }

    @Override
    public <S extends Category> S save(S entity) {
        return categoryRespository.save(entity);
    }

    @Override
    public Optional<Category> findById(Long aLong) {
        return categoryRespository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return categoryRespository.existsById(aLong);
    }

    @Override
    public long count() {
        return categoryRespository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRespository.deleteById(aLong);
    }

    @Override
    public void delete(Category entity) {
        categoryRespository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        categoryRespository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Category> entities) {
        categoryRespository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        categoryRespository.deleteAll();
    }
}
