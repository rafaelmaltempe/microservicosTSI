package com.trabalhoTsi.JPetSotre.Account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.trabalhoTsi.JPetSotre.Account.domain.Account;

/**
 * The Interface AccountMapper.
 *
 * @author Eduardo Macarron
 */
public interface AccountMapper {

    Account getAccountByUsername(@Param("username") String username);

    Account getAccountByUsernameAndPassword(String username, String password);

    void insertAccount(Account account);

    void insertProfile(Account account);

    void insertSignon(Account account);

    void updateAccount(Account account);

    void updateProfile(Account account);

    void updateSignon(Account account);

}
