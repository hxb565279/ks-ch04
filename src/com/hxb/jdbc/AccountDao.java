package com.hxb.jdbc;

import java.util.List;

public interface AccountDao {
    //添加
    public int addAccount(Account account);
    //更新
    public int updateAccount(Account account);
    //删除
    public int deleteAccount(int id);
    //通过ID查询
    public Account findAccountById(int id);
    //查询所有用户
    public List<Account> findAllAccount();
}
