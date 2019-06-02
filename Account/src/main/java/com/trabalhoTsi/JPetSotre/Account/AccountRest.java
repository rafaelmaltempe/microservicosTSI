package com.trabalhoTsi.JPetSotre.Account;


import com.trabalhoTsi.JPetSotre.Account.domain.Account;
import com.trabalhoTsi.JPetSotre.Account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountRest {

    @Autowired
    private IAccountService service;

    @RequestMapping(path = "/account/{username}", method = RequestMethod.GET)
    public Account getAccount(@PathVariable("username") String username) {
        System.out.println(username);
        Account account = service.getAccount(username);
        if (account == null) {
            throw new ResourceNotFoundException();
        }
        return account;
    }

    @RequestMapping(path = "/account/{username}/{password}")
    public Account getAccountPassword(@PathVariable("username") String username, @PathVariable("username") String password) {
        System.out.println(username + " - "+ password);
        Account account = service.getAccount(username, password);
        if (account == null) {
            throw new ResourceNotFoundException();
        }
        return account;
    }

    @RequestMapping(path = "/account/{username}", method = RequestMethod.PUT)
    public Account update(@RequestBody Account account) {
        service.updateAccount(account);

        return service.getAccount(account.getUsername());
    }
}
