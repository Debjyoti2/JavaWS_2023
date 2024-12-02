package com.tcs.pwb.enums;

public class JobTypeRunner {

    public static void main(String[] args) {
        String exceptionMsg = JobType.AWAIT_MT210.getJobError();
        System.out.println("exceptionMsg :: " + exceptionMsg);

        String exceptionMsg2 = JobType.getJobDetails("AWAITING_MT210_JOB").getJobError();
        System.out.println("exceptionMsg2 :: " + exceptionMsg2);

    }
}
