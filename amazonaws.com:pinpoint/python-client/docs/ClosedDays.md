# ClosedDays

The time when journey will stop sending messages.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **List** |  | [optional] 
**sms** | **List** |  | [optional] 
**push** | **List** |  | [optional] 
**voice** | **List** |  | [optional] 
**custom** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.closed_days import ClosedDays

# TODO update the JSON string below
json = "{}"
# create an instance of ClosedDays from a JSON string
closed_days_instance = ClosedDays.from_json(json)
# print the JSON string representation of the object
print(ClosedDays.to_json())

# convert the object into a dict
closed_days_dict = closed_days_instance.to_dict()
# create an instance of ClosedDays from a dict
closed_days_from_dict = ClosedDays.from_dict(closed_days_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


