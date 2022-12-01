/*
 * Amazon Route 53 Resolver
 * <p>When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver. By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or Elastic Load Balancing load balancers. Resolver performs recursive lookups against public name servers for all other domain names.</p> <p>You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:</p> <p> <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b> </p> <p>DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers to easily resolve domain names for Amazon Web Services resources such as EC2 instances or records in a Route 53 private hosted zone. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc\">How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p> <b>Conditionally forward queries from a VPC to resolvers on your network</b> </p> <p>You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you specified in that rule. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network\">How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p>Like Amazon VPC, Resolver is Regional. In each Region where you have VPCs, you can choose whether to forward queries from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.</p>
 *
 * The version of the OpenAPI document: 2018-04-01
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
import java.util.Arrays;
import org.openapitools.client.model.Action;
import org.openapitools.client.model.BlockOverrideDnsType;
import org.openapitools.client.model.BlockResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for CreateFirewallRuleResponseFirewallRule
 */
public class CreateFirewallRuleResponseFirewallRuleTest {
    private final CreateFirewallRuleResponseFirewallRule model = new CreateFirewallRuleResponseFirewallRule();

    /**
     * Model tests for CreateFirewallRuleResponseFirewallRule
     */
    @Test
    public void testCreateFirewallRuleResponseFirewallRule() {
        // TODO: test CreateFirewallRuleResponseFirewallRule
    }

    /**
     * Test the property 'firewallRuleGroupId'
     */
    @Test
    public void firewallRuleGroupIdTest() {
        // TODO: test firewallRuleGroupId
    }

    /**
     * Test the property 'firewallDomainListId'
     */
    @Test
    public void firewallDomainListIdTest() {
        // TODO: test firewallDomainListId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'action'
     */
    @Test
    public void actionTest() {
        // TODO: test action
    }

    /**
     * Test the property 'blockResponse'
     */
    @Test
    public void blockResponseTest() {
        // TODO: test blockResponse
    }

    /**
     * Test the property 'blockOverrideDomain'
     */
    @Test
    public void blockOverrideDomainTest() {
        // TODO: test blockOverrideDomain
    }

    /**
     * Test the property 'blockOverrideDnsType'
     */
    @Test
    public void blockOverrideDnsTypeTest() {
        // TODO: test blockOverrideDnsType
    }

    /**
     * Test the property 'blockOverrideTtl'
     */
    @Test
    public void blockOverrideTtlTest() {
        // TODO: test blockOverrideTtl
    }

    /**
     * Test the property 'creatorRequestId'
     */
    @Test
    public void creatorRequestIdTest() {
        // TODO: test creatorRequestId
    }

    /**
     * Test the property 'creationTime'
     */
    @Test
    public void creationTimeTest() {
        // TODO: test creationTime
    }

    /**
     * Test the property 'modificationTime'
     */
    @Test
    public void modificationTimeTest() {
        // TODO: test modificationTime
    }

}
