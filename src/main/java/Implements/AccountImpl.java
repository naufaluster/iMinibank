package Implements;

import Database.AAConnect;
import Database.AccountData;
import Entity.Account;
import Interfaces.IAccount;

import java.util.List;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class AccountImpl implements IAccount {

    private AccountData accountData;

    public AccountImpl(){
        accountData = new AccountData(AAConnect.getConnection());
    }


    public boolean addAccount(Account account) {
        return accountData.addAccount(account);
    }
}
