package com.spring.professional.exam.tutorial.module06.question02.security.utils;

public class RolesHierarchyBuilder {
    private StringBuilder stringBuilder = new StringBuilder();

    public RolesHierarchyBuilder append(String uplineRole, String downlineRole) {
        stringBuilder.append(String.format("ROLE_%s > ROLE_%s\n", uplineRole, downlineRole));
        return this;
    }

    public String build() {
        return stringBuilder.toString();
    }
}