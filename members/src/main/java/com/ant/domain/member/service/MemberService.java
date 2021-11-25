package com.ant.domain.member.service;

import com.ant.domain.member.entity.Member;

/**
 * <p>
 * 会员服务
 * </p>
 *
 * @author Ant
 * @since 2021/11/25 2:46 下午
 */
public class MemberService {

    /**
     * <p>
     * 创建会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public Member createMemberInfoDomainService() {
        return Member.createMemberInfo();
    }

    /**
     * <p>
     * 更新会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public Member updateMemberInfoDomainService() {
        return Member.updateMemberInfo();
    }

    /**
     * <p>
     * 查询会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public Member getMemberInfoDomainService() {
        return Member.getMemberInfo();
    }

}
