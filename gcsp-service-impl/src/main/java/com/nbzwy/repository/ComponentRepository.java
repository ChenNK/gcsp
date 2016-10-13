package com.nbzwy.repository;

import com.nbzwy.domain.po.Component;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * Created by ` on 2016/10/10.
 */

public interface ComponentRepository extends PagingAndSortingRepository<Component, String>,QueryByExampleExecutor<Component> {

}
