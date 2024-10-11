# AutomatedAbrRule

Specify one or more Automated ABR rule types. Note: Force include and Allowed renditions are mutually exclusive.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_renditions** | **List** |  | [optional] 
**force_include_renditions** | **List** |  | [optional] 
**min_bottom_rendition_size** | [**AutomatedAbrRuleMinBottomRenditionSize**](AutomatedAbrRuleMinBottomRenditionSize.md) |  | [optional] 
**min_top_rendition_size** | [**AutomatedAbrRuleMinTopRenditionSize**](AutomatedAbrRuleMinTopRenditionSize.md) |  | [optional] 
**type** | [**RuleType**](RuleType.md) |  | [optional] 

## Example

```python
from openapi_client.models.automated_abr_rule import AutomatedAbrRule

# TODO update the JSON string below
json = "{}"
# create an instance of AutomatedAbrRule from a JSON string
automated_abr_rule_instance = AutomatedAbrRule.from_json(json)
# print the JSON string representation of the object
print(AutomatedAbrRule.to_json())

# convert the object into a dict
automated_abr_rule_dict = automated_abr_rule_instance.to_dict()
# create an instance of AutomatedAbrRule from a dict
automated_abr_rule_from_dict = AutomatedAbrRule.from_dict(automated_abr_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


