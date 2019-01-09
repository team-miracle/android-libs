/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License
*/

package android.app.job;
public abstract class JobScheduler
{
public  JobScheduler() { throw new RuntimeException("Stub!"); }
public abstract  int schedule(android.app.job.JobInfo job);
public abstract  int enqueue(android.app.job.JobInfo job, android.app.job.JobWorkItem work);
public abstract  void cancel(int jobId);
public abstract  void cancelAll();
public abstract  java.util.List<android.app.job.JobInfo> getAllPendingJobs();
public abstract  android.app.job.JobInfo getPendingJob(int jobId);
public static final int RESULT_FAILURE = 0;
public static final int RESULT_SUCCESS = 1;
}
