package com.hotel.booking.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.hotel.booking.Model.Bill;
import com.hotel.booking.Model.Payment;


@Repository
public interface paymentRepo extends JpaRepository<Payment, Long> {

	boolean existsByBillId(Bill bill);

	List<Payment> findByBillId(Bill billId);

}
