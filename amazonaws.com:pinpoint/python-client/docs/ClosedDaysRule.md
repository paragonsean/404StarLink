# ClosedDaysRule

Closed Days Rule. Part of Journey sending schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**start_date_time** | **str** |  | [optional] 
**end_date_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.closed_days_rule import ClosedDaysRule

# TODO update the JSON string below
json = "{}"
# create an instance of ClosedDaysRule from a JSON string
closed_days_rule_instance = ClosedDaysRule.from_json(json)
# print the JSON string representation of the object
print(ClosedDaysRule.to_json())

# convert the object into a dict
closed_days_rule_dict = closed_days_rule_instance.to_dict()
# create an instance of ClosedDaysRule from a dict
closed_days_rule_from_dict = ClosedDaysRule.from_dict(closed_days_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


