package com.jarvis.diancanba.restaurant.UserDetailsService;

import com.jarvis.diancanba.base.mapper.DcbBossMapper;
import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbBossExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2019/10/3 16:24
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/10/3 16:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private DcbBossMapper bossMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("111111111111");
        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
        System.out.println("2222222222"+username);
        DcbBossExample example = new DcbBossExample() ;
        DcbBossExample.Criteria criteria = example.createCriteria();
        criteria.andDcbBossidEqualTo(username);


        List<DcbBoss> boss = bossMapper.selectByExample(example);
        DcbBoss admin =boss.get(0);
        /*ShUser admin = userService.findByUsername(username);
         */
        System.out.println(admin.getDcbBossid()+"333333333");

        grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        if(admin.getDcbBossstatus()==0) {

            //grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            return null;
        }

        if(admin!=null){
            return new User(username,admin.getDcbBosspassword(), grantedAuths);
        }else{
            return null;
        }
        //System.out.println(username);
        //return new User(username,"999", grantedAuths);
    }
}
