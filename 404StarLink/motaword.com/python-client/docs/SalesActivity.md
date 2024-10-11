# SalesActivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**created_at** | **int** | timestamp | [optional] 
**created_by** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sales_activity import SalesActivity

# TODO update the JSON string below
json = "{}"
# create an instance of SalesActivity from a JSON string
sales_activity_instance = SalesActivity.from_json(json)
# print the JSON string representation of the object
print(SalesActivity.to_json())

# convert the object into a dict
sales_activity_dict = sales_activity_instance.to_dict()
# create an instance of SalesActivity from a dict
sales_activity_from_dict = SalesActivity.from_dict(sales_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


