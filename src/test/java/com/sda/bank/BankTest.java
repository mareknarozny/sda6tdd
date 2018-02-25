package com.sda.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BankTest {

    private Bank bank;

    @Before
    public void init() {
        this.bank = new Bank("test");

    }

    @Test
    public void shouldAddNewUeser() {
        //given
        User user = new User("Szymon", "Nowak");

        //when
        boolean result = bank.addUser(user);
        //then
        Assert.assertTrue("Method returned false", result);
        Assert.assertEquals("User is not present in bank", 1, bank.getNuberOfUsers());
    }

    @Test
    public void shouldNotAddNullUser() {
        //given
        User user = null;
        //when
        boolean result = bank.addUser(user);
        //then
        Assert.assertFalse("Method returned true", result);
        Assert.assertEquals("User is present in bank list", 0, bank.getNuberOfUsers());
    }

    @Test
    public void shouldCreateAccountForGivenUser() {
        //given
        UserService mockckUserService = Mockito.mock(UserService.class);
        AccountService mockAccountService = Mockito.mock(AccountService.class);

        Mockito.when(mockckUserService.addUser(Mockito.any(User.class))).thenReturn(true);
        Mockito.when(mockckUserService.getNumberOfUsers()).thenReturn(1);
        Mockito.when(mockckUserService.isUserPresent(Mockito.any(Integer.class))).thenReturn(true);

        Mockito.when(mockAccountService.addAccount(Mockito.any(Account.class))).thenReturn(true);
        Mockito.when(mockAccountService.getNumberOfAccounts()).thenReturn(1);


        bank.setAccountService(mockAccountService);
        bank.setUserService(mockckUserService);


        User user = new User("Szymon", "Nowak");
        Account account = new Account(0, 0);
        //when
        boolean userAddResult = bank.addUser(user);
        boolean accountAddResult = bank.createAccount(0, account);
        //then
        Assert.assertTrue("User is not present in bank list", userAddResult);
        Assert.assertEquals("User is not present in bank list", 1, bank.getNuberOfUsers());
        Assert.assertTrue("Account is not present in bank list", accountAddResult);
        Assert.assertEquals("Account is not present in bank list", 1, bank.getNumberOfAccounts());
    }
}
