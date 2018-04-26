package com.boot.controller;

public interface RestMethods {

    public final String V1 = "rest/v1";

    interface User {

        public static final String PATH = "/user";

        interface V1{
            public static final String FIND_USER_BY_ID = "/{id}";
        }
    }
}
