# SalesActivities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activities** | [**List[SalesActivity]**](SalesActivity.md) |  | [optional] 

## Example

```python
from openapi_client.models.sales_activities import SalesActivities

# TODO update the JSON string below
json = "{}"
# create an instance of SalesActivities from a JSON string
sales_activities_instance = SalesActivities.from_json(json)
# print the JSON string representation of the object
print(SalesActivities.to_json())

# convert the object into a dict
sales_activities_dict = sales_activities_instance.to_dict()
# create an instance of SalesActivities from a dict
sales_activities_from_dict = SalesActivities.from_dict(sales_activities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


