package finalproject.util;

import com.google.common.collect.ImmutableMap;
import lombok.Data;

import java.util.Collection;

@Data
public class Result {
        private int code;
        private String msg;
        private Object data;

        public Result(int code, String msg, Object data) {
            this.code = code;
            this.msg = msg;
            this.data = data;
        }

        public static Result build(int code, String msg, Object data) {
            return new Result(code, msg, data);
        }

        public static Result buildError() {
            return new Result(500, "error", null);
        }

        public static Result buildError(String msg) {
            return new Result(500, msg, null);
        }

        public static Result buildSuccess() {
            return new Result(200, "success", null);
        }

        public static Result buildSuccess(Object object) {
            return new Result(200, "success", object);
        }

        public static Result pageResult(Collection data, int current, int pageSize) {
            return new Result(200, "success", ImmutableMap.of("data", data, "current", current, "pageSize", pageSize));
        }
}
