/**
 * Copyright 2019 The JoyQueue Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.joyqueue.model.domain;

/**
 * Created by wangxiaofei1 on 2019/3/13.
 */
public class BrokerTopicMonitorRecord {
    private String app;
    private String topic;
    private long connections;
    private long count;
    private long retryCount;
    private long retryTps;
    private long backlog;
    private long totalSize;
    private String retryUmpUrl;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getConnections() {
        return connections;
    }

    public void setConnections(long connections) {
        this.connections = connections;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(long retryCount) {
        this.retryCount = retryCount;
    }

    public long getRetryTps() {
        return retryTps;
    }

    public void setRetryTps(long retryTps) {
        this.retryTps = retryTps;
    }

    public void setBacklog(long backlog) {
        this.backlog = backlog;
    }

    public long getBacklog() {
        return backlog;
    }

    public void setRetryUmpUrl(String retryUmpUrl) {
        this.retryUmpUrl = retryUmpUrl;
    }

    public String getRetryUmpUrl() {
        return retryUmpUrl;
    }
}
