package com.techshard.graphql.springbootgraphql.dao.repository;

import com.techshard.graphql.springbootgraphql.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
