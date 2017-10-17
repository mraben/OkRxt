package com.okrxt.www.model.bean;

/**
 * Description: main页面bean数据
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/10/17 15:20 *
 */

public class Bean {

    /**
     * data : {"author":{"des":"欢迎下载使用OkHttpUtils网络框架，如果遇到问题，欢迎反馈！如果觉得好用，不妨star一下，以便让更多的人了解使用！","email":"liaojeason@126.com","address":"北京","name":"jeasonlzy","github":"https://github.com/jeasonlzy0216","qq":"QQ交流群：489873144","fullname":"廖子尧"},"des":"请求服务器返回Json对象","method":"POST","url":"http://server.jeasonlzy.com/OkHttpUtils/jsonObject","ip":"2607:8700:103:ba23:0:0:0:8:53864"}
     * code : 0
     * msg : 请求成功
     */

    private DataBean data;
    private int code;
    private String msg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * author : {"des":"欢迎下载使用OkHttpUtils网络框架，如果遇到问题，欢迎反馈！如果觉得好用，不妨star一下，以便让更多的人了解使用！","email":"liaojeason@126.com","address":"北京","name":"jeasonlzy","github":"https://github.com/jeasonlzy0216","qq":"QQ交流群：489873144","fullname":"廖子尧"}
         * des : 请求服务器返回Json对象
         * method : POST
         * url : http://server.jeasonlzy.com/OkHttpUtils/jsonObject
         * ip : 2607:8700:103:ba23:0:0:0:8:53864
         */

        private AuthorBean author;
        private String des;
        private String method;
        private String url;
        private String ip;

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "author=" + author +
                    ", des='" + des + '\'' +
                    ", method='" + method + '\'' +
                    ", url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    '}';
        }

        public static class AuthorBean {
            /**
             * des : 欢迎下载使用OkHttpUtils网络框架，如果遇到问题，欢迎反馈！如果觉得好用，不妨star一下，以便让更多的人了解使用！
             * email : liaojeason@126.com
             * address : 北京
             * name : jeasonlzy
             * github : https://github.com/jeasonlzy0216
             * qq : QQ交流群：489873144
             * fullname : 廖子尧
             */

            private String des;
            private String email;
            private String address;
            private String name;
            private String github;
            private String qq;
            private String fullname;

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGithub() {
                return github;
            }

            public void setGithub(String github) {
                this.github = github;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            @Override
            public String toString() {
                return "AuthorBean{" +
                        "des='" + des + '\'' +
                        ", email='" + email + '\'' +
                        ", address='" + address + '\'' +
                        ", name='" + name + '\'' +
                        ", github='" + github + '\'' +
                        ", qq='" + qq + '\'' +
                        ", fullname='" + fullname + '\'' +
                        '}';
            }
        }
    }
}
