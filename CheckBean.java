package cn.edu.bistu.music.bean;

public class CheckBean {
        private boolean success;
        private String message;
        public void setSuccess(boolean success) {
            this.success = success;
        }
        public boolean getSuccess() {
            return success;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
}
