package com.timi.retrofitrxjava.bean;

import java.util.List;

/**
 * 测试的test bean
 * author: timi
 * create at: 2017-08-15 11:13
 */
public class TestBean1 {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20170815022466","title":"走着走着,已经到了玩不起的年龄------致自己！","source":"哲理人生语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-31873606.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815022466"},{"id":"wechat_20170815022441","title":"人生，不求完美，但求实在","source":"哲理人生语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-31873606.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815022441"},{"id":"wechat_20170815019114","title":"为心电学事业献毕生精力 做心电学事业薪火传人","source":"生活与健康报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433442.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019114"},{"id":"wechat_20170815019817","title":"卡塔尔公主：艺术世界最强大玩家","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35434003.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019817"},{"id":"wechat_20170815019689","title":"漫画 | 朋友圈最不正经的漫画，他把日子画成了诗，人人都想睡进他画里！","source":"中国青年报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34894483.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019689"},{"id":"wechat_20170815019657","title":"近现代绘画里的金石趣味","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433892.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019657"},{"id":"wechat_20170815019638","title":"水墨的记忆、承传和创造\u2014\u2014水墨艺术对谈","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433824.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019638"},{"id":"wechat_20170815019631","title":"威尼斯画廊展出爱丽丝?尼尔未曾展出的杰作","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433799.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019631"},{"id":"wechat_20170815019729","title":"渭河石画之麻雀","source":"渭河奇石","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-30521633.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019729"},{"id":"wechat_20170815020434","title":"【第一军情·视频】西部演兵一浪高过一浪，东部战区陆军两支劲旅开往高原！","source":"第一军情","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35434401.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815020434"}],"totalPage":12639,"ps":10,"pno":1}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * list : [{"id":"wechat_20170815022466","title":"走着走着,已经到了玩不起的年龄------致自己！","source":"哲理人生语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-31873606.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815022466"},{"id":"wechat_20170815022441","title":"人生，不求完美，但求实在","source":"哲理人生语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-31873606.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815022441"},{"id":"wechat_20170815019114","title":"为心电学事业献毕生精力 做心电学事业薪火传人","source":"生活与健康报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433442.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019114"},{"id":"wechat_20170815019817","title":"卡塔尔公主：艺术世界最强大玩家","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35434003.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019817"},{"id":"wechat_20170815019689","title":"漫画 | 朋友圈最不正经的漫画，他把日子画成了诗，人人都想睡进他画里！","source":"中国青年报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34894483.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019689"},{"id":"wechat_20170815019657","title":"近现代绘画里的金石趣味","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433892.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019657"},{"id":"wechat_20170815019638","title":"水墨的记忆、承传和创造\u2014\u2014水墨艺术对谈","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433824.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019638"},{"id":"wechat_20170815019631","title":"威尼斯画廊展出爱丽丝?尼尔未曾展出的杰作","source":"艺术中国","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35433799.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019631"},{"id":"wechat_20170815019729","title":"渭河石画之麻雀","source":"渭河奇石","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-30521633.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815019729"},{"id":"wechat_20170815020434","title":"【第一军情·视频】西部演兵一浪高过一浪，东部战区陆军两支劲旅开往高原！","source":"第一军情","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35434401.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170815020434"}]
         * totalPage : 12639
         * ps : 10
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20170815022466
             * title : 走着走着,已经到了玩不起的年龄------致自己！
             * source : 哲理人生语录
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-31873606.static/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20170815022466
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        ", source='" + source + '\'' +
                        ", firstImg='" + firstImg + '\'' +
                        ", mark='" + mark + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "TestBean{" +
                    "totalPage=" + totalPage +
                    ", ps=" + ps +
                    ", pno=" + pno +
                    ", list=" + list +
                    '}';
        }
    }
}
