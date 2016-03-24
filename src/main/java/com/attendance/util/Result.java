package com.attendance.util;

import java.util.HashMap;
import java.util.Map;

public class Result {
	private Map<String, Object> map = new HashMap<String, Object>();

    private static final JsonMapper jsonMapper = JsonMapper.buildNormalBinder();

    public Result(){
        map.put("data", null);
    }

    public void setSuccess(boolean flag) {
        map.put("flag", flag);
    }

    public void setStatusmsg(String statusmsg) {
        map.put("statusmsg", statusmsg);
    }

    public String getStatusmsg() {
        if(map.containsKey("statusmsg")) {
            return map.get("statusmsg").toString();
        }

        return "";
    }

    public void setTotal(int total) {
        map.put("total", total);
    }

    public void setData(Object data) {
        map.put("data", data);
    }

    public Map<String, Object> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return jsonMapper.toJson(map);
    }
}
