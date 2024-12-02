package com.tcs.pwb.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum JobType {

    AWAITING_DISB("AWAITING_DISB_JOB","This is Await Dis Job Error"),
    AWAIT_MT210("AWAITING_MT210_JOB","This is Await Mt210 Job Error");

    private String jobKey;
    private String jobError;
    static Map<String,JobType> jobNameMap = new HashMap<>();

    static {
        Arrays.stream(JobType.values()).forEach(e->jobNameMap.put(e.jobKey,e));
    }

    JobType(String jobKey, String jobError ){
        this.jobKey=jobKey;
        this.jobError=jobError;
    }

    public String getJobKey() {
        return jobKey;
    }


    public String getJobError() {
        return jobError;
    }

    public static JobType getJobDetails(String JobName){
        return jobNameMap.getOrDefault(JobName,null);
    }

}
