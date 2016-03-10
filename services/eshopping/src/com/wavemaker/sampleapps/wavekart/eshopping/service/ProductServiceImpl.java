/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.wavemaker.sampleapps.wavekart.eshopping.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.wavemaker.sampleapps.wavekart.eshopping.*;
import com.wavemaker.sampleapps.wavekart.eshopping.Product;


/**
 * ServiceImpl object for domain model class Product.
 * @see Product
 */
@Service("eshopping.ProductService")
public class ProductServiceImpl implements ProductService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    @Qualifier("eshopping.ProductDao")
    private WMGenericDao<Product, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Product, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "eshoppingTransactionManager")
     public Page<Product> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "eshoppingTransactionManager")
    @Override
    public Product create(Product product) {
        LOGGER.debug("Creating a new product with information: {}" , product);
        return this.wmGenericDao.create(product);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "eshoppingTransactionManager")
    @Override
    public Product delete(Integer productId) throws EntityNotFoundException {
        LOGGER.debug("Deleting product with id: {}" , productId);
        Product deleted = this.wmGenericDao.findById(productId);
        if (deleted == null) {
            LOGGER.debug("No product found with id: {}" , productId);
            throw new EntityNotFoundException(String.valueOf(productId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "eshoppingTransactionManager")
    @Override
    public Page<Product> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all products");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "eshoppingTransactionManager")
    @Override
    public Page<Product> findAll(Pageable pageable) {
        LOGGER.debug("Finding all products");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "eshoppingTransactionManager")
    @Override
    public Product findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding product by id: {}" , id);
        Product product=this.wmGenericDao.findById(id);
        if(product==null){
            LOGGER.debug("No product found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return product;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "eshoppingTransactionManager")
    @Override
    public Product update(Product updated) throws EntityNotFoundException {
        LOGGER.debug("Updating product with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "eshoppingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


