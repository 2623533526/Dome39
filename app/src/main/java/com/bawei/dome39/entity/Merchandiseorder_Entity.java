package com.bawei.dome39.entity;

import java.util.List;

/**
 * @author: 张家辅
 * @date: 2020/02/14
 */
public class Merchandiseorder_Entity {

    /**
     * orderList : [{"detailList":[{"commentStatus":1,"commodityCount":3,"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/5.jpg","commodityPrice":39,"orderDetailId":13174},{"commentStatus":1,"commodityCount":3,"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/5.jpg","commodityPrice":6,"orderDetailId":13175}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021114205242027842","orderStatus":3,"orderTime":1581402052000,"payAmount":135,"payMethod":1,"userId":27842},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/3.jpg","commodityPrice":3499,"orderDetailId":12134},{"commentStatus":1,"commodityCount":1,"commodityId":5,"commodityName":"双头两用修容笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/5.jpg","commodityPrice":39,"orderDetailId":12135}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020011113500992127842","orderStatus":1,"orderTime":1578721810000,"payAmount":3538,"payMethod":1,"userId":27842}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":1,"commodityCount":3,"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/5.jpg","commodityPrice":39,"orderDetailId":13174},{"commentStatus":1,"commodityCount":3,"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/5.jpg","commodityPrice":6,"orderDetailId":13175}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 2020021114205242027842
         * orderStatus : 3
         * orderTime : 1581402052000
         * payAmount : 135
         * payMethod : 1
         * userId : 27842
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private int orderStatus;
        private long orderTime;
        private int payAmount;
        private int payMethod;
        private int userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(long orderTime) {
            this.orderTime = orderTime;
        }

        public int getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(int payAmount) {
            this.payAmount = payAmount;
        }

        public int getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(int payMethod) {
            this.payMethod = payMethod;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 1
             * commodityCount : 3
             * commodityId : 6
             * commodityName : 轻柔系自然裸妆假睫毛
             * commodityPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/5.jpg
             * commodityPrice : 39
             * orderDetailId : 13174
             */

            private int commentStatus;
            private int commodityCount;
            private int commodityId;
            private String commodityName;
            private String commodityPic;
            private int commodityPrice;
            private int orderDetailId;

            public int getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(int commentStatus) {
                this.commentStatus = commentStatus;
            }

            public int getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(int commodityCount) {
                this.commodityCount = commodityCount;
            }

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public int getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(int commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public int getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(int orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}
