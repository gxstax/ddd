package com.ant.domain.member.entity;

import java.time.Instant;

/**
 * <p>
 * 会员（聚合根）
 * </p>
 *
 * @author Ant
 * @since 2021/11/25 2:31 下午
 */
public class Member {

    private Long id;

    private String name;

    private Integer age;

    private Instant birthday;

    public Member() {}

    /**
     * <p>
     * 创建会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public static Member createMemberInfo() {
        return new Member();
    }

    /**
     * <p>
     * 修改会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public static Member updateMemberInfo() {
        return new Member();
    }

    /**
     * <p>
     * 查询会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public static Member getMemberInfo() {
        return new Member();
    }

    /**
     * <p>
     * 查询会员信息
     * </p>
     *
     * @param
     * @return {@link Member}
     */
    public static Long createMemberId() {
        return 1L;
    }

}
