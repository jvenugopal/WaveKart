/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.wavemaker.sampleapps.wavekart.eshopping.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.wavemaker.sampleapps.wavekart.eshopping.Orderdetail;
import com.wavemaker.sampleapps.wavekart.eshopping.Productorder;
import com.wavemaker.sampleapps.wavekart.eshopping.service.OrderdetailService;
import com.wavemaker.sampleapps.wavekart.eshopping.service.ProductorderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.sampleapps.wavekart.eshopping.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Productorder.
 * @see Productorder
 */
@RestController(value = "Eshopping.ProductorderController")
@RequestMapping("/eshopping/Productorder")
@Api(description = "Exposes APIs to work with Productorder resource.", value = "ProductorderController")
public class ProductorderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductorderController.class);

    @Autowired
    @Qualifier("eshopping.ProductorderService")
    private ProductorderService productorderService;

    @Autowired
    @Qualifier("eshopping.OrderdetailService")
    private OrderdetailService orderdetailService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Productorder instances matching the search criteria.")
    public Page<Productorder> findProductorders(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Productorders list");
        return productorderService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Productorder instances.")
    public Page<Productorder> getProductorders(Pageable pageable) {
        LOGGER.debug("Rendering Productorders list");
        return productorderService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/orderdetails", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the orderdetails instance associated with the given id.")
    public Page<Orderdetail> findAssociatedorderdetails(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated orderdetails");
        return orderdetailService.findAssociatedValues(id, "productorder", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setProductorderService(ProductorderService service) {
        this.productorderService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Productorder instance.")
    public Productorder createProductorder(@RequestBody Productorder instance) {
        LOGGER.debug("Create Productorder with information: {}", instance);
        instance = productorderService.create(instance);
        LOGGER.debug("Created Productorder with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Productorder instances.")
    public Long countAllProductorders() {
        LOGGER.debug("counting Productorders");
        Long count = productorderService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Productorder instance associated with the given id.")
    public Productorder getProductorder(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Productorder with id: {}", id);
        Productorder instance = productorderService.findById(id);
        LOGGER.debug("Productorder details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Productorder instance associated with the given id.")
    public Productorder editProductorder(@PathVariable(value = "id") Integer id, @RequestBody Productorder instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Productorder with id: {}", instance.getId());
        instance.setId(id);
        instance = productorderService.update(instance);
        LOGGER.debug("Productorder details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the Productorder instance associated with the given id.")
    public boolean deleteProductorder(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Productorder with id: {}", id);
        Productorder deleted = productorderService.delete(id);
        return deleted != null;
    }
}
