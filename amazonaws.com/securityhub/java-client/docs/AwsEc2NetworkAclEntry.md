

# AwsEc2NetworkAclEntry

A rule for the network ACL. Each rule allows or denies access based on the IP address, traffic direction, port, and protocol.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cidrBlock** | [**String**](String.md) |  |  [optional] |
|**egress** | [**Boolean**](Boolean.md) |  |  [optional] |
|**icmpTypeCode** | [**AwsEc2NetworkAclEntryIcmpTypeCode**](AwsEc2NetworkAclEntryIcmpTypeCode.md) |  |  [optional] |
|**ipv6CidrBlock** | [**String**](String.md) |  |  [optional] |
|**portRange** | [**AwsEc2NetworkAclEntryPortRange**](AwsEc2NetworkAclEntryPortRange.md) |  |  [optional] |
|**protocol** | [**String**](String.md) |  |  [optional] |
|**ruleAction** | [**String**](String.md) |  |  [optional] |
|**ruleNumber** | [**Integer**](Integer.md) |  |  [optional] |



