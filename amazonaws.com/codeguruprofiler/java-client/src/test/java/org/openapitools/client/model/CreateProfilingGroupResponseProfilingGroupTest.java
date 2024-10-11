/*
 * Amazon CodeGuru Profiler
 * <p> This section provides documentation for the Amazon CodeGuru Profiler API operations. </p> <p> Amazon CodeGuru Profiler collects runtime performance data from your live applications, and provides recommendations that can help you fine-tune your application performance. Using machine learning algorithms, CodeGuru Profiler can help you find your most expensive lines of code and suggest ways you can improve efficiency and remove CPU bottlenecks. </p> <p> Amazon CodeGuru Profiler provides different visualizations of profiling data to help you identify what code is running on the CPU, see how much time is consumed, and suggest ways to reduce CPU utilization. </p> <note> <p>Amazon CodeGuru Profiler currently supports applications written in all Java virtual machine (JVM) languages and Python. While CodeGuru Profiler supports both visualizations and recommendations for applications written in Java, it can also generate visualizations and a subset of recommendations for applications written in other JVM languages and Python.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/codeguru/latest/profiler-ug/what-is-codeguru-profiler.html\">What is Amazon CodeGuru Profiler</a> in the <i>Amazon CodeGuru Profiler User Guide</i>. </p>
 *
 * The version of the OpenAPI document: 2019-07-18
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Map;
import org.openapitools.client.model.ComputePlatform;
import org.openapitools.client.model.ProfilingGroupDescriptionAgentOrchestrationConfig;
import org.openapitools.client.model.ProfilingGroupDescriptionProfilingStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for CreateProfilingGroupResponseProfilingGroup
 */
public class CreateProfilingGroupResponseProfilingGroupTest {
    private final CreateProfilingGroupResponseProfilingGroup model = new CreateProfilingGroupResponseProfilingGroup();

    /**
     * Model tests for CreateProfilingGroupResponseProfilingGroup
     */
    @Test
    public void testCreateProfilingGroupResponseProfilingGroup() {
        // TODO: test CreateProfilingGroupResponseProfilingGroup
    }

    /**
     * Test the property 'agentOrchestrationConfig'
     */
    @Test
    public void agentOrchestrationConfigTest() {
        // TODO: test agentOrchestrationConfig
    }

    /**
     * Test the property 'arn'
     */
    @Test
    public void arnTest() {
        // TODO: test arn
    }

    /**
     * Test the property 'computePlatform'
     */
    @Test
    public void computePlatformTest() {
        // TODO: test computePlatform
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'profilingStatus'
     */
    @Test
    public void profilingStatusTest() {
        // TODO: test profilingStatus
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

}
