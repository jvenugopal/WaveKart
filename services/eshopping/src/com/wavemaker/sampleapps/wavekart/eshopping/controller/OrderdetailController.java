/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.wavemaker.sampleapps.wavekart.eshopping.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.wavemaker.sampleapps.wavekart.eshopping.Orderdetail;
import com.wavemaker.sampleapps.wavekart.eshopping.service.OrderdetailService;

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
 * Controller object for domain model class Orderdetail.
 * @see Orderdetail
 */
@RestController(value = "Eshopping.OrderdetailController")
@RequestMapping("/eshopping/Orderdetail")
@Api(description = "Exposes APIs to work with Orderdetail resource.", value = "OrderdetailController")
public class OrderdetailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderdetailController.class);

    @Autowired
    @Qualifier("eshopping.OrderdetailService")
    private OrderdetailService orderdetailService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Orderdetail instances matching the search criteria.")
    public Page<Orderdetail> findOrderdetails(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Orderdetails list");
        return orderdetailService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Orderdetail instances.")
    public Page<Orderdetail> getOrderdetails(Pageable pageable) {
        LOGGER.debug("Rendering Orderdetails list");
        return orderdetailService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setOrderdetailService(OrderdetailService service) {
        this.orderdetailService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Orderdetail instance.")
    public Orderdetail createOrderdetail(@RequestBody Orderdetail instance) {
        LOGGER.debug("Create Orderdetail with information: {}", instance);
        instance = orderdetailService.create(instance);
        LOGGER.debug("Created Orderdetail with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Orderdetail instances.")
    public Long countAllOrderdetails() {
        LOGGER.debug("counting Orderdetails");
        Long count = orderdetailService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Orderdetail instance associated with the given id.")
    public Orderdetail getOrderdetail(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Orderdetail with id: {}", id);
        Orderdetail instance = orderdetailService.findById(id);
        LOGGER.debug("Orderdetail details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Orderdetail instance associated with the given id.")
    public Orderdetail editOrderdetail(@PathVariable("id") Integer id, @RequestBody Orderdetail instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Orderdetail with id: {}", instance.getId());
        instance.setId(id);
        instance = orderdetailService.update(instance);
        LOGGER.debug("Orderdetail details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the Orderdetail instance associated with the given id.")
    public boolean deleteOrderdetail(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Orderdetail with id: {}", id);
        Orderdetail deleted = orderdetailService.delete(id);
        return deleted != null;
    }
}