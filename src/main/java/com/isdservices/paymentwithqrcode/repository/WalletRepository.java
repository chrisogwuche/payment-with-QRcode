package com.isdservices.paymentwithqrcode.repository;

import com.isdservices.paymentwithqrcode.model.User;
import com.isdservices.paymentwithqrcode.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {
    Wallet findByUser(User user);
}
