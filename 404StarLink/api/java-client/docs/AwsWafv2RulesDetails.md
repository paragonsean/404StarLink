

# AwsWafv2RulesDetails

 Provides details about rules in a rule group. A rule identifies web requests that you want to allow, block, or count. Each rule includes one top-level Statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**AwsWafv2RulesDetailsAction**](AwsWafv2RulesDetailsAction.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**overrideAction** | [**String**](String.md) |  |  [optional] |
|**priority** | [**Integer**](Integer.md) |  |  [optional] |
|**visibilityConfig** | [**AwsWafv2RuleGroupDetailsVisibilityConfig**](AwsWafv2RuleGroupDetailsVisibilityConfig.md) |  |  [optional] |



