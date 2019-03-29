package Implements;

import Database.AAConnect;
import Database.AccountData;
import Database.CustomerData;
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

    @Override
    public List<Account> listaccount() {
        return accountData.getListAccount();
    }
}
