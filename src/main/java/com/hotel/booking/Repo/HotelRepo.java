package com.hotel.booking.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.booking.Model.Hotels;
import com.hotel.booking.Model.Location;

@Repository
public interface HotelRepo extends JpaRepository<Hotels, Long>{

	Hotels findByHotelId(Long hotelId);

	List<Hotels> findByLocationId(Location locationId);

	Optional<Hotels> existsByLocationId(Location locationId);

}
