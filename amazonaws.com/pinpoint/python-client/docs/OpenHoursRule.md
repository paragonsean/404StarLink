# OpenHoursRule

List of OpenHours Rules.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **str** |  | [optional] 
**end_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.open_hours_rule import OpenHoursRule

# TODO update the JSON string below
json = "{}"
# create an instance of OpenHoursRule from a JSON string
open_hours_rule_instance = OpenHoursRule.from_json(json)
# print the JSON string representation of the object
print(OpenHoursRule.to_json())

# convert the object into a dict
open_hours_rule_dict = open_hours_rule_instance.to_dict()
# create an instance of OpenHoursRule from a dict
open_hours_rule_from_dict = OpenHoursRule.from_dict(open_hours_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


